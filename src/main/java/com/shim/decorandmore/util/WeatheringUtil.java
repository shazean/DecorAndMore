package com.shim.decorandmore.util;

import com.shim.decorandmore.registry.DecorBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class WeatheringUtil {
    public static Map<Block, Block> WAX_OFF = new HashMap<>();

    public record WeatherableStage(@Nullable Block nextStage, @Nullable Block previousStage, Block waxedCounterpart) {

        public WeatherableStage addWaxed(Block nonWaxed) {
            WAX_OFF.put(this.waxedCounterpart, nonWaxed);
            return this;
        }
    }

    public static Map<Block, WeatherableStage> WEATHERABLE_BLOCK_STAGES = Util.make(new HashMap<>(), (map) -> {
        map.put(DecorBlocks.COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_LANTERN.get()).addWaxed(DecorBlocks.COPPER_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.COPPER_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get()).addWaxed(DecorBlocks.EXPOSED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get()).addWaxed(DecorBlocks.WEATHERED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get()).addWaxed(DecorBlocks.OXIDIZED_COPPER_LANTERN.get()));

        map.put(DecorBlocks.COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get()).addWaxed(DecorBlocks.COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get()).addWaxed(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get()).addWaxed(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get()).addWaxed(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get()));

        map.put(DecorBlocks.COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get()).addWaxed(DecorBlocks.COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get()).addWaxed(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get()).addWaxed(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get()).addWaxed(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get()));

        map.put(DecorBlocks.CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), null, DecorBlocks.WAXED_CUT_COPPER_TABLE.get()).addWaxed(DecorBlocks.CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), DecorBlocks.CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get()).addWaxed(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), new WeatherableStage(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get()).addWaxed(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get()));
        map.put(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get()).addWaxed(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get()));


        map.put(DecorBlocks.COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_CHAIN.get(), null, DecorBlocks.WAXED_COPPER_CHAIN.get()).addWaxed(DecorBlocks.COPPER_CHAIN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get()).addWaxed(DecorBlocks.EXPOSED_COPPER_CHAIN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_CHAIN.get(), new WeatherableStage(DecorBlocks.OXIDIZED_COPPER_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_CHAIN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get()).addWaxed(DecorBlocks.WEATHERED_COPPER_CHAIN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_CHAIN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_CHAIN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get()).addWaxed(DecorBlocks.OXIDIZED_COPPER_CHAIN.get()));

        map.put(DecorBlocks.COPPER_REDSTONE_CHAIN.get(), new WeatherableStage(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get(), null, DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get()).addWaxed(DecorBlocks.COPPER_REDSTONE_CHAIN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get(), new WeatherableStage(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get()).addWaxed(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get(), new WeatherableStage( DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get()).addWaxed(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get(), new WeatherableStage(null, DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get()).addWaxed(DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get()));

    });

}
