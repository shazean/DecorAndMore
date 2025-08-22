package com.shim.decorandmore.util;

import com.shim.decorandmore.registry.DecorBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
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


    });

}
