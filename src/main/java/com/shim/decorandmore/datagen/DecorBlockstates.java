package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.*;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.properties.StairsShape;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Function;

public class DecorBlockstates extends BlockStateProvider {

    public DecorBlockstates(DataGenerator gen, ExistingFileHelper helper) {
        super(gen, DecorAndMore.MODID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        slabStoolPlanksBlock(DecorBlocks.OAK_STOOL.get(), "oak");
        slabStoolPlanksBlock(DecorBlocks.DARK_OAK_STOOL.get(), "dark_oak");
        slabStoolPlanksBlock(DecorBlocks.JUNGLE_STOOL.get(), "jungle");
        slabStoolPlanksBlock(DecorBlocks.SPRUCE_STOOL.get(), "spruce");
        slabStoolPlanksBlock(DecorBlocks.ACACIA_STOOL.get(), "acacia");
        slabStoolPlanksBlock(DecorBlocks.BIRCH_STOOL.get(), "birch");
        slabStoolPlanksBlock(DecorBlocks.WARPED_STOOL.get(), "warped");
        slabStoolPlanksBlock(DecorBlocks.CRIMSON_STOOL.get(), "crimson");

        slabStoolLogBlock(DecorBlocks.OAK_LOG_STOOL.get(), Blocks.OAK_LOG);
        slabStoolLogBlock(DecorBlocks.DARK_OAK_LOG_STOOL.get(), Blocks.DARK_OAK_LOG);
        slabStoolLogBlock(DecorBlocks.JUNGLE_LOG_STOOL.get(), Blocks.JUNGLE_LOG);
        slabStoolLogBlock(DecorBlocks.SPRUCE_LOG_STOOL.get(), Blocks.SPRUCE_LOG);
        slabStoolLogBlock(DecorBlocks.ACACIA_LOG_STOOL.get(), Blocks.ACACIA_LOG);
        slabStoolLogBlock(DecorBlocks.BIRCH_LOG_STOOL.get(), Blocks.BIRCH_LOG);
        slabStoolLogBlock(DecorBlocks.WARPED_STEM_STOOL.get(), Blocks.WARPED_STEM);
        slabStoolLogBlock(DecorBlocks.CRIMSON_STEM_STOOL.get(), Blocks.CRIMSON_STEM);

        slabStoolLogBlock(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get(), Blocks.STRIPPED_OAK_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get(), Blocks.STRIPPED_DARK_OAK_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get(), Blocks.STRIPPED_JUNGLE_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get(), Blocks.STRIPPED_SPRUCE_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get(), Blocks.STRIPPED_ACACIA_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get(), Blocks.STRIPPED_BIRCH_LOG);
        slabStoolLogBlock(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get(), Blocks.STRIPPED_WARPED_STEM);
        slabStoolLogBlock(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get(), Blocks.STRIPPED_CRIMSON_STEM);

        logBench(DecorBlocks.OAK_BENCH.get(), Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        logBench(DecorBlocks.DARK_OAK_BENCH.get(), Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        logBench(DecorBlocks.SPRUCE_BENCH.get(), Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
        logBench(DecorBlocks.JUNGLE_BENCH.get(), Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        logBench(DecorBlocks.ACACIA_BENCH.get(), Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        logBench(DecorBlocks.BIRCH_BENCH.get(), Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        logBench(DecorBlocks.WARPED_BENCH.get(), Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM);
        logBench(DecorBlocks.CRIMSON_BENCH.get(), Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM);

        halfLogBench(DecorBlocks.HALF_OAK_BENCH.get(), Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        halfLogBench(DecorBlocks.HALF_DARK_OAK_BENCH.get(), Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        halfLogBench(DecorBlocks.HALF_SPRUCE_BENCH.get(), Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
        halfLogBench(DecorBlocks.HALF_JUNGLE_BENCH.get(), Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        halfLogBench(DecorBlocks.HALF_ACACIA_BENCH.get(), Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        halfLogBench(DecorBlocks.HALF_BIRCH_BENCH.get(), Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        halfLogBench(DecorBlocks.HALF_WARPED_BENCH.get(), Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM);
        halfLogBench(DecorBlocks.HALF_CRIMSON_BENCH.get(), Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM);

        lantern(DecorBlocks.GOLD_LANTERN.get());
        lantern(DecorBlocks.GOLD_SOUL_LANTERN.get());

        copperLantern(DecorBlocks.COPPER_LANTERN.get());
        copperLantern(DecorBlocks.COPPER_SOUL_LANTERN.get());
        copperLantern(DecorBlocks.EXPOSED_COPPER_LANTERN.get());
        copperLantern(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get());
        copperLantern(DecorBlocks.WEATHERED_COPPER_LANTERN.get());
        copperLantern(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get());
        copperLantern(DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
        copperLantern(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get());

        waxedlantern(DecorBlocks.WAXED_COPPER_LANTERN.get(), DecorBlocks.COPPER_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get(), DecorBlocks.COPPER_SOUL_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get(), DecorBlocks.WEATHERED_COPPER_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get(), DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get(), DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
        waxedlantern(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get(), DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get());

        lantern(DecorBlocks.NETHERITE_LANTERN.get());
        lantern(DecorBlocks.NETHERITE_SOUL_LANTERN.get());

        redstoneLantern(DecorBlocks.REDSTONE_LANTERN.get());
        redstoneLantern(DecorBlocks.GOLD_REDSTONE_LANTERN.get());

        redstoneLantern(DecorBlocks.COPPER_REDSTONE_LANTERN.get());
        redstoneLantern(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get());
        redstoneLantern(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get());
        redstoneLantern(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get());

        waxedCopperRedstoneLantern(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.COPPER_REDSTONE_LANTERN.get());
        waxedCopperRedstoneLantern(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get());
        waxedCopperRedstoneLantern(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get());
        waxedCopperRedstoneLantern(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get(), DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get());

        redstoneLantern(DecorBlocks.NETHERITE_REDSTONE_LANTERN.get());

        simpleTable(DecorBlocks.OAK_TABLE_PLANKS.get(), Blocks.OAK_PLANKS);
        logTable(DecorBlocks.OAK_TABLE_LOGS.get(), Blocks.OAK_LOG, Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        logTable(DecorBlocks.OAK_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_LOG);
        twoBlockTable(DecorBlocks.OAK_TABLE_PLANKS_LOGS.get(), Blocks.OAK_PLANKS, Blocks.OAK_LOG);
        twoBlockTable(DecorBlocks.OAK_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.OAK_PLANKS, Blocks.STRIPPED_OAK_LOG);
        logTable(DecorBlocks.OAK_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_OAK_LOG, Blocks.OAK_LOG, Blocks.STRIPPED_OAK_LOG);

        simpleTable(DecorBlocks.DARK_OAK_TABLE_PLANKS.get(), Blocks.DARK_OAK_PLANKS);
        logTable(DecorBlocks.DARK_OAK_TABLE_LOGS.get(), Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        logTable(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);
        twoBlockTable(DecorBlocks.DARK_OAK_TABLE_PLANKS_LOGS.get(), Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG);
        twoBlockTable(DecorBlocks.DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.DARK_OAK_PLANKS, Blocks.STRIPPED_DARK_OAK_LOG);
        logTable(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG);

        simpleTable(DecorBlocks.SPRUCE_TABLE_PLANKS.get(), Blocks.SPRUCE_PLANKS);
        logTable(DecorBlocks.SPRUCE_TABLE_LOGS.get(), Blocks.SPRUCE_LOG, Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
        logTable(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);
        twoBlockTable(DecorBlocks.SPRUCE_TABLE_PLANKS_LOGS.get(), Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG);
        twoBlockTable(DecorBlocks.SPRUCE_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.SPRUCE_PLANKS, Blocks.STRIPPED_SPRUCE_LOG);
        logTable(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG);

        simpleTable(DecorBlocks.JUNGLE_TABLE_PLANKS.get(), Blocks.JUNGLE_PLANKS);
        logTable(DecorBlocks.JUNGLE_TABLE_LOGS.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        logTable(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);
        twoBlockTable(DecorBlocks.JUNGLE_TABLE_PLANKS_LOGS.get(), Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG);
        twoBlockTable(DecorBlocks.JUNGLE_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.JUNGLE_PLANKS, Blocks.STRIPPED_JUNGLE_LOG);
        logTable(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG);

        simpleTable(DecorBlocks.ACACIA_TABLE_PLANKS.get(), Blocks.ACACIA_PLANKS);
        logTable(DecorBlocks.ACACIA_TABLE_LOGS.get(), Blocks.ACACIA_LOG, Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        logTable(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);
        twoBlockTable(DecorBlocks.ACACIA_TABLE_PLANKS_LOGS.get(), Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG);
        twoBlockTable(DecorBlocks.ACACIA_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.ACACIA_PLANKS, Blocks.STRIPPED_ACACIA_LOG);
        logTable(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG);

        simpleTable(DecorBlocks.BIRCH_TABLE_PLANKS.get(), Blocks.BIRCH_PLANKS);
        logTable(DecorBlocks.BIRCH_TABLE_LOGS.get(), Blocks.BIRCH_LOG, Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        logTable(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);
        twoBlockTable(DecorBlocks.BIRCH_TABLE_PLANKS_LOGS.get(), Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG);
        twoBlockTable(DecorBlocks.BIRCH_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.BIRCH_PLANKS, Blocks.STRIPPED_BIRCH_LOG);
        logTable(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG);

        simpleTable(DecorBlocks.WARPED_TABLE_PLANKS.get(), Blocks.WARPED_PLANKS);
        logTable(DecorBlocks.WARPED_TABLE_STEMS.get(), Blocks.WARPED_STEM, Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM);
        logTable(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS.get(), Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM);
        twoBlockTable(DecorBlocks.WARPED_TABLE_PLANKS_STEMS.get(), Blocks.WARPED_PLANKS, Blocks.WARPED_STEM);
        twoBlockTable(DecorBlocks.WARPED_TABLE_PLANKS_STRIPPED_STEMS.get(), Blocks.WARPED_PLANKS, Blocks.STRIPPED_WARPED_STEM);
        logTable(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS_STEMS.get(), Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_STEM, Blocks.STRIPPED_WARPED_STEM);

        simpleTable(DecorBlocks.CRIMSON_TABLE_PLANKS.get(), Blocks.CRIMSON_PLANKS);
        logTable(DecorBlocks.CRIMSON_TABLE_STEMS.get(), Blocks.CRIMSON_STEM, Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM);
        logTable(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS.get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM);
        twoBlockTable(DecorBlocks.CRIMSON_TABLE_PLANKS_STEMS.get(), Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM);
        twoBlockTable(DecorBlocks.CRIMSON_TABLE_PLANKS_STRIPPED_STEMS.get(), Blocks.CRIMSON_PLANKS, Blocks.STRIPPED_CRIMSON_STEM);
        logTable(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS_STEMS.get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM);

        simpleTable(DecorBlocks.DIORITE_TABLE.get(), Blocks.DIORITE);
        simpleTable(DecorBlocks.DIORITE_TABLE_POLISHED.get(), Blocks.POLISHED_DIORITE);
//        simpleTwoBlockTable(DecorBlocks.DIORITE_TABLE_TOP_POLISHED.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE);
//        simpleTwoBlockTable(DecorBlocks.DIORITE_TABLE_BOTTOM_POLISHED.get(), Blocks.DIORITE, Blocks.POLISHED_DIORITE);

        simpleTable(DecorBlocks.GRANITE_TABLE.get(), Blocks.GRANITE);
        simpleTable(DecorBlocks.GRANITE_TABLE_POLISHED.get(), Blocks.POLISHED_GRANITE);
        simpleTable(DecorBlocks.ANDESITE_TABLE.get(), Blocks.ANDESITE);
        simpleTable(DecorBlocks.ANDESITE_TABLE_POLISHED.get(), Blocks.POLISHED_ANDESITE);

        simpleTable(DecorBlocks.STONE_BRICKS_TABLE.get(), Blocks.STONE_BRICKS);
        simpleTable(DecorBlocks.SMOOTH_STONE_TABLE.get(), Blocks.SMOOTH_STONE);

        simpleTable(DecorBlocks.QUARTZ_BRICK_TABLE.get(), Blocks.QUARTZ_BRICKS);
        table(DecorBlocks.SMOOTH_QUARTZ_TABLE.get(), getTextureFromBlock(Blocks.QUARTZ_BLOCK, "_bottom"), getTextureFromBlock(Blocks.QUARTZ_BLOCK, "_bottom"), getTextureFromBlock(Blocks.QUARTZ_BLOCK, "_bottom"));

        simpleTable(DecorBlocks.NETHER_BRICK_TABLE.get(), Blocks.NETHER_BRICKS);
        simpleTable(DecorBlocks.RED_NETHER_BRICK_TABLE.get(), Blocks.RED_NETHER_BRICKS);

        simpleTable(DecorBlocks.POLISHED_BLACKSTONE_BRICKS_TABLE.get(), Blocks.POLISHED_BLACKSTONE_BRICKS);
        simpleTable(DecorBlocks.POLISHED_BLACKSTONE_TABLE.get(), Blocks.POLISHED_BLACKSTONE);

        simpleTable(DecorBlocks.BRICK_TABLE.get(), Blocks.BRICKS);
        simpleTable(DecorBlocks.PURPUR_TABLE.get(), Blocks.PURPUR_BLOCK);
        simpleTable(DecorBlocks.END_STONE_BRICKS_TABLE.get(), Blocks.END_STONE_BRICKS);

        simpleTable(DecorBlocks.CUT_COPPER_TABLE.get(), Blocks.CUT_COPPER);
        simpleTable(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), Blocks.EXPOSED_CUT_COPPER);
        simpleTable(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), Blocks.WEATHERED_CUT_COPPER);
        simpleTable(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), Blocks.OXIDIZED_CUT_COPPER);

        simpleTable(DecorBlocks.WAXED_CUT_COPPER_TABLE.get(), Blocks.CUT_COPPER);
        simpleTable(DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get(), Blocks.EXPOSED_CUT_COPPER);
        simpleTable(DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get(), Blocks.WEATHERED_CUT_COPPER);
        simpleTable(DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get(), Blocks.OXIDIZED_CUT_COPPER);

        simpleTable(DecorBlocks.CUT_SANDSTONE_TABLE.get(), Blocks.CUT_SANDSTONE);
        table(DecorBlocks.SMOOTH_SANDSTONE_TABLE.get(), getTextureFromBlock(Blocks.SANDSTONE, "_top"), getTextureFromBlock(Blocks.SANDSTONE, "_top"), getTextureFromBlock(Blocks.SANDSTONE, "_top"));
        simpleTable(DecorBlocks.RED_CUT_SANDSTONE_TABLE.get(), Blocks.CUT_RED_SANDSTONE);
        table(DecorBlocks.SMOOTH_RED_SANDSTONE_TABLE.get(), getTextureFromBlock(Blocks.RED_SANDSTONE, "_top"), getTextureFromBlock(Blocks.RED_SANDSTONE, "_top"), getTextureFromBlock(Blocks.RED_SANDSTONE, "_top"));

        simpleTable(DecorBlocks.POLISHED_DEEPSLATE_TABLE.get(), Blocks.POLISHED_DEEPSLATE);
        simpleTable(DecorBlocks.DEEPSLATE_BRICK_TABLE.get(), Blocks.DEEPSLATE_BRICKS);
        simpleTable(DecorBlocks.DEEPSLATE_TILE_TABLE.get(), Blocks.DEEPSLATE_TILES);

        simpleTable(DecorBlocks.PRISMARINE_BRICK_TABLE.get(), Blocks.PRISMARINE_BRICKS);
        simpleTable(DecorBlocks.DARK_PRISMARINE_TABLE.get(), Blocks.DARK_PRISMARINE);


        redstoneLamp(DecorBlocks.RED_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.ORANGE_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.YELLOW_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.LIME_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.GREEN_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.CYAN_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.BLUE_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.LIGHT_BLUE_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.PURPLE_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.MAGENTA_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.PINK_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.BROWN_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.BLACK_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.GRAY_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.LIGHT_GRAY_REDSTONE_LAMP.get());
        redstoneLamp(DecorBlocks.WHITE_REDSTONE_LAMP.get());


        redstoneChainBlock(DecorBlocks.REDSTONE_CHAIN.get(), (ChainBlock) Blocks.CHAIN);
        chainBlock(DecorBlocks.GOLD_CHAIN.get());
        redstoneChainBlock(DecorBlocks.GOLD_REDSTONE_CHAIN.get(), DecorBlocks.GOLD_CHAIN.get());
        chainBlock(DecorBlocks.NETHERITE_CHAIN.get());
        redstoneChainBlock(DecorBlocks.NETHERITE_REDSTONE_CHAIN.get(), DecorBlocks.NETHERITE_CHAIN.get());

        chainBlock(DecorBlocks.COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.COPPER_REDSTONE_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get());
        chainBlock(DecorBlocks.EXPOSED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_CHAIN.get());
        chainBlock(DecorBlocks.WEATHERED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.WEATHERED_COPPER_CHAIN.get());
        chainBlock(DecorBlocks.OXIDIZED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.OXIDIZED_COPPER_CHAIN.get());

        chainBlock(DecorBlocks.WAXED_COPPER_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.COPPER_CHAIN.get());
        chainBlock(DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.EXPOSED_COPPER_CHAIN.get());
        chainBlock(DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get(), DecorBlocks.WEATHERED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.WEATHERED_COPPER_CHAIN.get());
        chainBlock(DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get(), DecorBlocks.OXIDIZED_COPPER_CHAIN.get());
        redstoneChainBlock(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get(), DecorBlocks.OXIDIZED_COPPER_CHAIN.get());

        rugBlock(DecorBlocks.RED_RUG.get());
        rugBlock(DecorBlocks.ORANGE_RUG.get());
        rugBlock(DecorBlocks.YELLOW_RUG.get());
        rugBlock(DecorBlocks.LIME_RUG.get());
        rugBlock(DecorBlocks.GREEN_RUG.get());
        rugBlock(DecorBlocks.CYAN_RUG.get());
        rugBlock(DecorBlocks.BLUE_RUG.get());
        rugBlock(DecorBlocks.LIGHT_BLUE_RUG.get());
        rugBlock(DecorBlocks.PURPLE_RUG.get());
        rugBlock(DecorBlocks.MAGENTA_RUG.get());
        rugBlock(DecorBlocks.PINK_RUG.get());
        rugBlock(DecorBlocks.BROWN_RUG.get());
        rugBlock(DecorBlocks.BLACK_RUG.get());
        rugBlock(DecorBlocks.GRAY_RUG.get());
        rugBlock(DecorBlocks.LIGHT_GRAY_RUG.get());
        rugBlock(DecorBlocks.WHITE_RUG.get());

        carpetEdgeBlock(DecorBlocks.RED_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.ORANGE_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.YELLOW_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.LIME_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.GREEN_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.CYAN_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.BLUE_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.LIGHT_BLUE_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.PURPLE_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.MAGENTA_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.PINK_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.BROWN_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.BLACK_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.GRAY_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.LIGHT_GRAY_CARPET_EDGE.get());
        carpetEdgeBlock(DecorBlocks.WHITE_CARPET_EDGE.get());

        pathBlock(DecorBlocks.COBBLESTONE_PATH.get(), Blocks.COBBLESTONE);
        pathBlock(DecorBlocks.MOSSY_COBBLESTONE_PATH.get(), Blocks.MOSSY_COBBLESTONE);
        pathBlock(DecorBlocks.STONE_BRICK_PATH.get(), Blocks.STONE_BRICKS);
        pathBlock(DecorBlocks.MOSSY_STONE_BRICK_PATH.get(), Blocks.MOSSY_STONE_BRICKS);
        pathBlock(DecorBlocks.BRICK_PATH.get(), Blocks.BRICKS);
        pathBlock(DecorBlocks.NETHER_BRICK_PATH.get(), Blocks.NETHER_BRICKS);
        pathBlock(DecorBlocks.DEEPSLATE_BRICK_PATH.get(), Blocks.DEEPSLATE_BRICKS);
        pathBlock(DecorBlocks.END_STONE_BRICK_PATH.get(), Blocks.END_STONE_BRICKS);

        pathBlock(DecorBlocks.OAK_PATH.get(), Blocks.OAK_PLANKS);
        pathBlock(DecorBlocks.DARK_OAK_PATH.get(), Blocks.DARK_OAK_PLANKS);
        pathBlock(DecorBlocks.ACACIA_PATH.get(), Blocks.ACACIA_PLANKS);
        pathBlock(DecorBlocks.SPRUCE_PATH.get(), Blocks.SPRUCE_PLANKS);
        pathBlock(DecorBlocks.BIRCH_PATH.get(), Blocks.BIRCH_PLANKS);
        pathBlock(DecorBlocks.JUNGLE_PATH.get(), Blocks.JUNGLE_PLANKS);
        pathBlock(DecorBlocks.CRIMSON_PATH.get(), Blocks.CRIMSON_PLANKS);
        pathBlock(DecorBlocks.WARPED_PATH.get(), Blocks.WARPED_PLANKS);

        simpleBlock(DecorBlocks.BUTCHER_BLOCK.get());

        simpleBlock(DecorBlocks.IRON_GRATE.get());
        simpleBlock(DecorBlocks.GOLD_GRATE.get());
        simpleBlock(DecorBlocks.NETHERITE_GRATE.get());

        simpleBlock(DecorBlocks.COPPER_GRATE.get());
        simpleBlock(DecorBlocks.EXPOSED_COPPER_GRATE.get());
        simpleBlock(DecorBlocks.WEATHERED_COPPER_GRATE.get());
        simpleBlock(DecorBlocks.OXIDIZED_COPPER_GRATE.get());

        waxedSimpleBlock(DecorBlocks.WAXED_COPPER_GRATE.get(), DecorBlocks.COPPER_GRATE.get());
        waxedSimpleBlock(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE.get(), DecorBlocks.EXPOSED_COPPER_GRATE.get());
        waxedSimpleBlock(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE.get(), DecorBlocks.WEATHERED_COPPER_GRATE.get());
        waxedSimpleBlock(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE.get(), DecorBlocks.OXIDIZED_COPPER_GRATE.get());

        trapdoorBlock(DecorBlocks.IRON_GRATE_TRAPDOOR.get(), DecorBlocks.IRON_GRATE.get());
        trapdoorBlock(DecorBlocks.GOLD_GRATE_TRAPDOOR.get(), DecorBlocks.GOLD_GRATE.get());
        trapdoorBlock(DecorBlocks.NETHERITE_GRATE_TRAPDOOR.get(), DecorBlocks.NETHERITE_GRATE.get());

        trapdoorBlock(DecorBlocks.COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.COPPER_GRATE.get());
        trapdoorBlock(DecorBlocks.EXPOSED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.EXPOSED_COPPER_GRATE.get());
        trapdoorBlock(DecorBlocks.WEATHERED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.WEATHERED_COPPER_GRATE.get());
        trapdoorBlock(DecorBlocks.OXIDIZED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.OXIDIZED_COPPER_GRATE.get());

        waxedTrapdoorBlock(DecorBlocks.WAXED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.COPPER_GRATE.get());
        waxedTrapdoorBlock(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.EXPOSED_COPPER_GRATE.get());
        waxedTrapdoorBlock(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.WEATHERED_COPPER_GRATE.get());
        waxedTrapdoorBlock(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR.get(), DecorBlocks.OXIDIZED_COPPER_GRATE.get());

    }

    public void waxedTrapdoorBlock(TrapDoorBlock block, Block blockForTexture) {
        ModelFile bottom = models().withExistingParent(name(block) + "_bottom", modLoc("template_orientable_trapdoor_bottom"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(blockForTexture, "_trapdoor_side"));

        ModelFile top = models().withExistingParent(name(block) + "_top", modLoc("template_orientable_trapdoor_top"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(blockForTexture, "_trapdoor_side"));

        ModelFile open = models().withExistingParent(name(block) + "_side", modLoc("template_orientable_trapdoor_open"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(blockForTexture, "_trapdoor_side"));

        trapdoorBlock(block, bottom, top, open, true);
    }

    public void trapdoorBlock(TrapDoorBlock block, Block blockForTexture) {
        ModelFile bottom = models().withExistingParent(name(block) + "_bottom", modLoc("template_orientable_trapdoor_bottom"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(block, "_side"));

        ModelFile top = models().withExistingParent(name(block) + "_top", modLoc("template_orientable_trapdoor_top"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(block, "_side"));

        ModelFile open = models().withExistingParent(name(block)  + "_open", modLoc("template_orientable_trapdoor_open"))
                .texture("top", getTextureFromBlock(blockForTexture))
                .texture("side", getTextureFromBlock(block, "_side"));

        trapdoorBlock(block, bottom, top, open, true);
    }

    public void waxedSimpleBlock(Block block, Block nonWaxedBlock) {
        BlockModelBuilder model = models().cubeAll(name(block), blockTexture(nonWaxedBlock));
        simpleBlock(block, new ConfiguredModel(model));
    }

    public void pathBlock(Block block, Block top) {
        ModelFile model = models().withExistingParent(name(block), modLoc("template_path"))
                .texture("top", getTextureFromBlock(top))
                .texture("bottom", getTextureFromBlock(top))
                .texture("side", getTextureFromBlock(top));

        getVariantBuilder(block).forAllStates(state -> ConfiguredModel.builder().modelFile(model).build());
    }

    public void carpetEdgeBlock(RugBlock block) {
        ModelFile modelEW = models().withExistingParent(name(block) + "_ew", modLoc("carpet_edge_ew"))
                .texture("carpet", getTextureFromBlock(block, "_ew"));
        ModelFile modelNS = models().withExistingParent(name(block) + "_ns", modLoc("carpet_edge_ns"))
                .texture("carpet", getTextureFromBlock(block, "_ns"));

        getVariantBuilder(block).forAllStates(state -> {

            Direction facing = state.getValue(RugBlock.FACING);

            int yRot = facing == Direction.WEST || facing == Direction.NORTH ? 180 : 0;

            return ConfiguredModel.builder().modelFile((facing == Direction.EAST || facing == Direction.WEST) ? modelEW : modelNS).rotationY(yRot).build();

        });
    }

    public void rugBlock(RugBlock block) {
        ModelFile model = models().withExistingParent(name(block), mcLoc("carpet"))
                .texture("wool", blockTexture(block));

        getVariantBuilder(block).forAllStates(state -> {

            Direction facing = state.getValue(RugBlock.FACING);

            int yRot;
            switch (facing) {
                case EAST -> yRot = 270;
                case NORTH -> yRot = 180;
                case WEST -> yRot = 90;
                default -> yRot = 0;
            }

            return ConfiguredModel.builder().modelFile(model).rotationY(yRot).build();

        });
    }

    public void chainBlock(ChainBlock block) {
        ModelFile model = models().withExistingParent(name(block), modLoc("template_chain"))
                .texture("all", blockTexture(block));

        getVariantBuilder(block).forAllStatesExcept(state -> {

            Direction.Axis axis = state.getValue(ChainBlock.AXIS);
            int xRot = (axis == Direction.Axis.X || axis == Direction.Axis.Z) ? 90 : 0;
            int yRot = (axis == Direction.Axis.X) ? 90 : 0;

            return ConfiguredModel.builder().modelFile(model).rotationX(xRot).rotationY(yRot).build();

        }, ChainBlock.WATERLOGGED);
    }

    public void chainBlock(ChainBlock chain, Block textureBlock) {
        ModelFile model = models().withExistingParent(name(chain), modLoc("template_chain"))
                .texture("all", blockTexture(textureBlock));

        getVariantBuilder(chain).forAllStatesExcept(state -> {

            Direction.Axis axis = state.getValue(ChainBlock.AXIS);
            int xRot = (axis == Direction.Axis.X || axis == Direction.Axis.Z) ? 90 : 0;
            int yRot = (axis == Direction.Axis.X) ? 90 : 0;

            return ConfiguredModel.builder().modelFile(model).rotationX(xRot).rotationY(yRot).build();

        }, ChainBlock.WATERLOGGED);
    }

    public void redstoneChainBlock(RedstoneChainBlock block, ChainBlock nonRedstoneBlock) {
        ModelFile model = models().withExistingParent(name(block), modLoc("template_redstone_chain"))
                .texture("chain", blockTexture(nonRedstoneBlock));

        getVariantBuilder(block).forAllStatesExcept(state -> {

            Direction.Axis axis = state.getValue(ChainBlock.AXIS);
            int xRot = (axis == Direction.Axis.X || axis == Direction.Axis.Z) ? 90 : 0;
            int yRot = (axis == Direction.Axis.X) ? 90 : 0;

            return ConfiguredModel.builder().modelFile(model).rotationX(xRot).rotationY(yRot).build();

        }, ChainBlock.WATERLOGGED, RedstoneChainBlock.POWER);
    }

    public void redstoneLamp(RedstoneLampBlock lamp) {
        redstoneLamp(lamp, getTextureFromBlock(lamp, "_on"), getTextureFromBlock(lamp));
    }

    public void redstoneLamp(RedstoneLampBlock lamp, ResourceLocation lit, ResourceLocation unlit) {
        ModelFile litModel = models().withExistingParent(name(lamp) + "_lit", mcLoc("block/cube_all")).texture("all", lit);
        ModelFile unlitModel = models().withExistingParent(name(lamp), mcLoc("block/cube_all")).texture("all", unlit);

        redstoneLamp(lamp, litModel, unlitModel);
    }

    public void redstoneLamp(RedstoneLampBlock lamp, ModelFile litModel, ModelFile unlitModel) {
        getVariantBuilder(lamp).forAllStatesExcept(state -> {

            Boolean lit = state.getValue(RedstoneLampBlock.LIT);

            return ConfiguredModel.builder()
                    .modelFile(lit ? litModel : unlitModel)
                    .build();
        }, LanternBlock.WATERLOGGED);
    }

    public void simpleTable(TableBlock table, Block block) {
        table(table, getTextureFromBlock(block), getTextureFromBlock(block), getTextureFromBlock(block));
    }

    public void simpleTwoBlockTable(TableBlock table, Block top, Block post) {
        table(table, getTextureFromBlock(top), getTextureFromBlock(post), getTextureFromBlock(post));
    }

    public void twoBlockTable(TableBlock table, Block top, Block post) {
        table(table, getTextureFromBlock(top), getTextureFromBlock(post), getTextureFromBlock(post, "_top"));
    }

    public void logTable(LogTableBlock table, Block top, Block post, Block stripped) {
        logTable(table, getTextureFromBlock(top), getTextureFromBlock(post), getTextureFromBlock(post, "_top"), getTextureFromBlock(top, "_top"), getTextureFromBlock(stripped));
    }

    public void logTable(LogTableBlock table, ResourceLocation top, ResourceLocation post_side, ResourceLocation post_bottom, ResourceLocation top_end, ResourceLocation top_underside) {

        ModelFile model = models().withExistingParent(name(table), modLoc("block/log_table")).texture("top", top)
                .texture("post_side", post_side).texture("post_bottom", post_bottom).texture("top_end", top_end)
                .texture("top_underside", top_underside);

        logTable(table, model);
    }

    public void logTable(LogTableBlock table, ModelFile model) {
        getVariantBuilder(table).forAllStatesExcept(state -> {

            Direction facing = state.getValue(HalfBlock.FACING);

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) (facing.getOpposite()).toYRot())
                    .build();
        }, LanternBlock.WATERLOGGED);
    }

    public void table(TableBlock table, ResourceLocation top, ResourceLocation post_side, ResourceLocation post_bottom) {

        ModelFile model = models().withExistingParent(name(table), modLoc("block/table")).texture("top", top)
                .texture("post_side", post_side).texture("post_bottom", post_bottom);

        table(table, model);
    }

    public void table(TableBlock table, ModelFile model) {
        getVariantBuilder(table).forAllStates(state -> ConfiguredModel.builder()
                .modelFile(model).build());
    }

    public void waxedlantern(LanternBlock waxed, LanternBlock nonWaxedToCopy) {
        ModelFile model = models().withExistingParent(name(waxed), mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy));

        ModelFile hangingModel = models().withExistingParent(name(waxed) + "_hanging", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy));

        lantern(waxed, model, hangingModel);

    }

    public void waxedCopperRedstoneLantern(RedstoneLanternBlock waxed, LanternBlock nonWaxedToCopy) {
        ModelFile model = models().withExistingParent(name(waxed), mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy));

        ModelFile hangingModel = models().withExistingParent(name(waxed) + "_hanging", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy));

        ModelFile litModel = models().withExistingParent(name(waxed) + "_on", mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy, "_on"));

        ModelFile litHangingModel = models().withExistingParent(name(waxed) + "_hanging_on", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(nonWaxedToCopy, "_on"));

        redstoneLantern(waxed, model, hangingModel, litModel, litHangingModel);

    }

    public void redstoneLantern(LanternBlock block) {
        ModelFile model = models().withExistingParent(name(block), mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        ModelFile hangingModel = models().withExistingParent(name(block) + "_hanging", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        ModelFile litModel = models().withExistingParent(name(block) + "_on", mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(block, "_on"));

        ModelFile litHangingModel = models().withExistingParent(name(block) + "_hanging_on", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(block, "_on"));

        redstoneLantern(block, model, hangingModel, litModel, litHangingModel);

    }

    public void redstoneLantern(LanternBlock block, ModelFile model, ModelFile hangingModel, ModelFile litModel, ModelFile litHangingModel) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            Boolean hanging = state.getValue(LanternBlock.HANGING);
            Boolean lit = state.getValue(RedstoneLanternBlock.LIT);

            return ConfiguredModel.builder()
                    .modelFile(hanging ? lit ? litHangingModel : hangingModel : lit ? litModel : model)
                    .build();
        }, LanternBlock.WATERLOGGED);
    }


    public void copperLantern(CopperLanternBlock block) {
        ModelFile model = models().withExistingParent(name(block), mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        ModelFile hangingModel = models().withExistingParent(name(block) + "_hanging", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        copperLantern(block, model, hangingModel);

    }

    public void copperLantern(CopperLanternBlock block, ModelFile model, ModelFile hangingModel) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            Boolean hanging = state.getValue(LanternBlock.HANGING);

            return ConfiguredModel.builder()
                    .modelFile(hanging ? hangingModel : model)
                    .build();
        }, LanternBlock.WATERLOGGED, CopperLanternBlock.LIT);
    }


    public void lantern(LanternBlock block) {
        ModelFile model = models().withExistingParent(name(block), mcLoc("block/template_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        ModelFile hangingModel = models().withExistingParent(name(block) + "_hanging", mcLoc("block/template_hanging_lantern"))
                .texture("lantern", getTextureFromBlock(block));

        lantern(block, model, hangingModel);

    }

    public void lantern(LanternBlock block, ModelFile model, ModelFile hangingModel) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            Boolean hanging = state.getValue(LanternBlock.HANGING);

            return ConfiguredModel.builder()
                    .modelFile(hanging ? hangingModel : model)
                    .build();
        }, LanternBlock.WATERLOGGED);
    }

    private String name(ItemLike block) {
        return block.asItem().getRegistryName().getPath();
    }

    private String namespace(ItemLike block) {
        return block.asItem().getRegistryName().getNamespace();
    }

    public void halfLogBench(HalfBlock block, Block log, Block strippedLog) {
        halfLogBench(block, getTextureFromBlock(log), getTextureFromBlock(strippedLog));
    }

    public void halfLogBench(HalfBlock block, ResourceLocation log, ResourceLocation strippedLog) {
        ModelFile bench = models().withExistingParent(name(block), modLoc("block/half_bench"))
                .texture("side", log).texture("top", strippedLog).texture("end", strippedLog + "_top").texture("bottom", log);

        halfLogBench(block, bench);
    }

    public void halfLogBench(HalfBlock block, ModelFile model) {
        getVariantBuilder(block).forAllStates(state -> {
            Direction facing = state.getValue(HalfBlock.FACING);

            return ConfiguredModel.builder()
                    .modelFile(model)
                    .rotationY((int) (facing.getOpposite()).toYRot())
                    .build();
        });
    }


    public void logBench(StairBlock block, Block log, Block strippedLog) {
        ResourceLocation diagonalTex = new ResourceLocation(block.getRegistryName().getNamespace(), "block/diagonal_" + name(log));
        ResourceLocation strippedDiagnoalTex = new ResourceLocation(block.getRegistryName().getNamespace(), "block/stripped_diagonal_" + name(log));

        logBench(block, getTextureFromBlock(log), getTextureFromBlock(strippedLog), diagonalTex, strippedDiagnoalTex);
    }

    public void logBench(StairBlock block, ResourceLocation log, ResourceLocation strippedLog, ResourceLocation diagonal, ResourceLocation strippedDiagonal) {
        ModelFile bench = models().withExistingParent(name(block), modLoc("block/log_bench")).texture("side", log)
                .texture("inside", strippedLog).texture("end", strippedLog + "_top");
        ModelFile benchInner = models().withExistingParent(name(block) + "_inner", modLoc("block/log_bench_inner")).texture("side", log)
                .texture("inside", strippedLog).texture("diagonal", strippedDiagonal)
                .texture("end", strippedLog + "_top").texture("top", diagonal);
        ModelFile benchOuter = models().withExistingParent(name(block) + "_outer", modLoc("block/log_bench_outer")).texture("side", log)
                .texture("diagonal", strippedDiagonal).texture("end", strippedLog + "_top")
                .texture("top", diagonal);


        logBench(block, bench, benchInner, benchOuter);
    }

    public void logBench(StairBlock block, ModelFile stairs, ModelFile stairsInner, ModelFile stairsOuter) {
        getVariantBuilder(block)
                .forAllStatesExcept(state -> {
                    Direction facing = state.getValue(StairBlock.FACING);
                    Half half = state.getValue(StairBlock.HALF);
                    StairsShape shape = state.getValue(StairBlock.SHAPE);
                    int yRot = (int) facing.getClockWise().toYRot(); // Stairs model is rotated 90 degrees clockwise for some reason
                    if (shape == StairsShape.INNER_LEFT || shape == StairsShape.OUTER_LEFT) {
                        yRot += 270; // Left facing stairs are rotated 90 degrees clockwise
                    }
                    if (shape != StairsShape.STRAIGHT && half == Half.TOP) {
                        yRot += 90; // Top stairs are rotated 90 degrees clockwise
                    }
                    yRot %= 360;
                    boolean uvlock = false; //yRot != 0 || half == Half.TOP; // Don't set uvlock for states that have no rotation
                    return ConfiguredModel.builder()
                            .modelFile(shape == StairsShape.STRAIGHT ? stairs : shape == StairsShape.INNER_LEFT || shape == StairsShape.INNER_RIGHT ? stairsInner : stairsOuter)
                            .rotationX(half == Half.BOTTOM ? 0 : 180)
                            .rotationY(yRot)
                            .uvLock(uvlock)
                            .build();
                }, StairBlock.WATERLOGGED);
    }

    public ResourceLocation getTextureFromBlock(Block block) {
        return new ResourceLocation(block.getRegistryName().getNamespace(), "block/" + name(block));
    }

    public ResourceLocation getTextureFromBlock(String prefix, Block block) {
        return new ResourceLocation(block.getRegistryName().getNamespace(), "block/" + prefix + name(block));
    }


    public ResourceLocation getTextureFromBlock(Block block, String suffix) {
        return new ResourceLocation(block.getRegistryName().getNamespace(), "block/" + name(block) + suffix);
    }

    public void slabStoolPlanksBlock(SlabBlock block, String planks) {
        slabStoolBlock(block,
                modLoc("block/" + planks + "_slab_stool_side"),
                modLoc("block/" + planks + "_slab_stool_double"),
                mcLoc("block/" + planks + "_planks"));
    }

    public void slabStoolPlanksBlock(SlabBlock block, Block planks) {
        slabStoolBlock(block,
                getTextureFromBlock(planks),
                getTextureFromBlock(planks),
                getTextureFromBlock(planks));
    }

    public void slabStoolLogBlock(SlabBlock block, Block log) {
        slabStoolBlock(block,
                getTextureFromBlock(log),
                getTextureFromBlock(log),
                new ResourceLocation(log.getRegistryName().getNamespace(), "block/" + name(log) + "_top"));
    }

    public void slabStoolBlock(SlabBlock block, ResourceLocation plankSide, ResourceLocation doublePlankSide, ResourceLocation bottom) {
        getVariantBuilder(block).forAllStatesExcept(state -> {
            DyeColor color = state.getValue(SlabStoolBlock.COLOR);
            SlabType slabType = state.getValue(SlabStoolBlock.TYPE);
            BlockModelBuilder model = models().withExistingParent("white_" + name(block) + "_top", modLoc("block/slab_stool_top"))
                    .texture("wool_side", modLoc("block/white_slab_stool_side")).texture("plank_side", plankSide)
                    .texture("bottom", bottom).texture("top", modLoc("block/white_slab_stool_top"));
            BlockModelBuilder neededModel = model; //default to white, bottom

            for (DyeColor dye : DyeColor.values()) {
                if (slabType == SlabType.TOP) {
                    model = models().withExistingParent(dye.getName() + "_" + name(block) + "_top", modLoc("block/slab_stool_top"))
                            .texture("wool_side", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_side"))
                            .texture("plank_side", plankSide)
                            .texture("bottom", bottom)
                            .texture("top", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_top"));

                    neededModel = (dye == color) ? model : neededModel;

                } else if (slabType == SlabType.DOUBLE) {
                    model = models().withExistingParent(dye.getName() + "_" + name(block) + "_double", modLoc("block/slab_stool_double"))
                            .texture("wool_side", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_side"))
                            .texture("plank_side", doublePlankSide)
                            .texture("bottom", bottom)
                            .texture("top", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_top"));

                    neededModel = (dye == color) ? model : neededModel;

                } else { //bottom slab
                    model = models().withExistingParent(dye.getName() + "_" + name(block), modLoc("block/slab_stool"))
                            .texture("wool_side", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_side"))
                            .texture("plank_side", plankSide)
                            .texture("bottom", bottom)
                            .texture("top", new ResourceLocation(namespace(block), "block/" + dye.getName() + "_slab_stool_top"));

                    neededModel = (dye == color) ? model : neededModel;

                }
            }

            return ConfiguredModel.builder().modelFile(neededModel).build();
        }, SlabStoolBlock.WATERLOGGED);
    }
}