package com.shim.decorandmore.util;

import com.shim.decorandmore.registry.DecorBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class WeatheringUtil {
    public record WeatherableStage(@Nullable Block nextStage, @Nullable Block previousStage, Block waxedCounterpart) { }

    public static Map<Block, WeatherableStage> WEATHERABLE_BLOCK_STAGES = Util.make(new Object2ObjectArrayMap<>(), (map) -> {
        map.put(DecorBlocks.COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.COPPER_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get()));

        map.put(DecorBlocks.COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get()));

        map.put(DecorBlocks.COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get()));

        map.put(DecorBlocks.CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), null, DecorBlocks.WAXED_CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), DecorBlocks.CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get()));


        map.put(DecorBlocks.COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_CHAIN.get(), null, DecorBlocks.WAXED_COPPER_CHAIN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_CHAIN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_CHAIN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_CHAIN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get()));

        map.put(DecorBlocks.REDSTONE_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.EXPOSED_REDSTONE_COPPER_CHAIN.get(), null, DecorBlocks.WAXED_REDSTONE_COPPER_CHAIN.get()));
        map.put(DecorBlocks.EXPOSED_REDSTONE_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.WEATHERED_REDSTONE_COPPER_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get(), DecorBlocks.WAXED_EXPOSED_REDSTONE_COPPER_CHAIN.get()));
        map.put(DecorBlocks.WEATHERED_REDSTONE_COPPER_CHAIN.get(), new WeatherableStage( DecorBlocks.OXIDIZED_REDSTONE_COPPER_CHAIN.get(), DecorBlocks.EXPOSED_REDSTONE_COPPER_CHAIN.get(), DecorBlocks.WAXED_WEATHERED_REDSTONE_COPPER_CHAIN.get()));
        map.put(DecorBlocks.OXIDIZED_REDSTONE_COPPER_CHAIN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_REDSTONE_COPPER_CHAIN.get(), DecorBlocks.WAXED_OXIDIZED_REDSTONE_COPPER_CHAIN.get()));

    });

    public static Map<Block, Block> WAX_OFF = Util.make(new Object2ObjectArrayMap<>(), (map) -> {
        map.put(DecorBlocks.WAXED_COPPER_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get());
    });

    public static void addToMaps(Block copperBlock, @Nullable Block nextStage, @Nullable Block previousStage, Block waxedCounterpart) {
        WEATHERABLE_BLOCK_STAGES.put(copperBlock, new WeatherableStage(nextStage, previousStage, waxedCounterpart));
        WAX_OFF.put(waxedCounterpart, copperBlock);
    }

}
