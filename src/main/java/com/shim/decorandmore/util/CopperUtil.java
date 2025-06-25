package com.shim.decorandmore.util;

import com.shim.decorandmore.blocks.IWeatheringCopper;
import com.shim.decorandmore.registry.DecorBlocks;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.Util;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CopperUtil {

    public static Map<Block, CopperStage> COPPER_STAGES = Util.make(new Object2ObjectArrayMap<>(), (map) -> {
        map.put(DecorBlocks.COPPER_LANTERN.get(), new CopperStage(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), new CopperStage(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.COPPER_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), new CopperStage(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), new CopperStage(null, DecorBlocks.WEATHERED_COPPER_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get()));

        map.put(DecorBlocks.COPPER_SOUL_LANTERN.get(), new CopperStage(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), new CopperStage(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), new CopperStage(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), new CopperStage(null, DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get()));

        map.put(DecorBlocks.COPPER_REDSTONE_LANTERN.get(), new CopperStage(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), null, DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), new CopperStage(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), new CopperStage(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get()));
        map.put(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), new CopperStage(null, DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get()));


    });

    public record CopperStage(@Nullable Block nextStage, @Nullable Block previousStage, Block waxedCounterpart) { }
}
