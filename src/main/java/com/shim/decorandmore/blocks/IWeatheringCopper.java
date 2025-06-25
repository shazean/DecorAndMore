package com.shim.decorandmore.blocks;

import com.google.common.base.Suppliers;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.util.CopperUtil;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChangeOverTimeBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Optional;
import java.util.function.Supplier;


public interface IWeatheringCopper extends ChangeOverTimeBlock<WeatheringCopper.WeatherState> {
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

    static Optional<Block> getPrevious(Block block) {
        CopperUtil.CopperStage stage = CopperUtil.COPPER_STAGES.get(block);
        if (stage != null)
            return Optional.ofNullable(stage.previousStage());
        else return Optional.empty();

//        return Optional.ofNullable(CopperUtil.COPPER_STAGES.get(block).previousStage());

//        return Optional.ofNullable(PREVIOUS_BY_BLOCK.get().get(p_154891_));
    }

    static Block getFirst(Block blockIn) {
        Block block = blockIn;

        for (Block block1 = CopperUtil.COPPER_STAGES.get(blockIn).previousStage(); block1 != null; block1 = CopperUtil.COPPER_STAGES.get(block1).previousStage()) {
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
        CopperUtil.CopperStage stage = CopperUtil.COPPER_STAGES.get(block);
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