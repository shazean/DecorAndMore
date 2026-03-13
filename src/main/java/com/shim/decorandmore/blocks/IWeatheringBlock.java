package com.shim.decorandmore.blocks;

import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;

public interface IWeatheringBlock extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {

    static Block getFirst(Block blockIn) {
        Block block = blockIn;

        for (Block previousBlock = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(blockIn).previousStage(); previousBlock != null; previousBlock = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(previousBlock).previousStage()) {
            block = previousBlock;
        }
        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    static Optional<Block> getPrevious(Block block) {
        WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
        if (stage != null)
            return Optional.ofNullable(stage.previousStage());
        else return Optional.empty();

    }

    static Optional<Block> getNext(Block block) {
        WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
        if (stage != null)
            return Optional.ofNullable(stage.nextStage());
        else return Optional.empty();

    }

    static BlockState getFirst(BlockState state) {
        return getFirst(state.getBlock()).withPropertiesOf(state);
    }

    default Optional<BlockState> getNext(BlockState state) {
        return getNext(state.getBlock()).map((p_154896_) -> p_154896_.withPropertiesOf(state));
    }

    default float getChanceModifier() {
        return this.getAge() == WeatheringCopper.WeatherState.UNAFFECTED ? 0.75F : 1.0F;
    }
}