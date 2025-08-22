package com.shim.decorandmore.blocks;

import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;


public interface IWeatheringBlock extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
//    BiMap<Block, Block> BLOCK_MAP =  HashBiMap.create(Util.make(new Object2ObjectArrayMap<>(), (map) -> {
//
//        map.put(DecorBlocks.COPPER_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_LANTERN.get());
//        map.put(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), DecorBlocks.WEATHERED_COPPER_LANTERN.get());
//        map.put(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
//
//    }));
//
//    Supplier<BiMap<Block, Block>> NEXT_BY_BLOCK = Suppliers.memoize(() -> BLOCK_MAP);
//    Supplier<BiMap<Block, Block>> PREVIOUS_BY_BLOCK = Suppliers.memoize(() -> NEXT_BY_BLOCK.get().inverse());
//
//    static void addToMap(Block block, Block nextBlock) {
//        BLOCK_MAP.put(block, nextBlock);
//    }

//    Block getPreviousStage(Block block);
//    Block getNextStage();
//    Block getCurrentStage();

    static Optional<Block> getPrevious(Block block) {
        WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
        if (stage != null)
            return Optional.ofNullable(stage.previousStage());
        else return Optional.empty();

//        return Optional.ofNullable(CopperUtil.COPPER_STAGES.get(block).previousStage());

//        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    static Block getFirst(Block blockIn) {
        Block block = blockIn;

        for (Block block1 = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(blockIn).previousStage(); block1 != null; block1 = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block1).previousStage()) {
            block = block1;
        }

//        for(Block block1 = PREVIOUS_BY_BLOCK.get().get(blockIn); block1 != null; block1 = PREVIOUS_BY_BLOCK.get().get(block1)) {
//            block = block1;
//        }
        return block;
    }

    static Optional<BlockState> getPrevious(BlockState state) {
        return getPrevious(state.getBlock()).map((block) -> block.withPropertiesOf(state));
    }

    static Optional<Block> getNext(Block block) {
        WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
        if (stage != null)
            return Optional.ofNullable(stage.nextStage());
        else return Optional.empty();

//        return Optional.ofNullable(CopperUtil.COPPER_STAGES.get(block).nextStage());
//        return Optional.ofNullable(NEXT_BY_BLOCK.get().get(p_154905_));
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