package com.shim.decorandmore.blocks;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.common.extensions.IForgeBlock;
import org.jetbrains.annotations.Nullable;

import java.util.Optional;


public interface IWeatheringBlock extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {



    static Block getFirst(Block blockIn) {
        Block block = blockIn;

        for (Block block1 = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(blockIn).previousStage(); block1 != null; block1 = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block1).previousStage()) {
            block = block1;
        }
        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
//        DecorAndMore.LOGGER.debug("state: " + state + " previous: " + getPrevious(state.getBlock()) + ", previous from map: " + WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(state.getBlock()).previousStage());
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