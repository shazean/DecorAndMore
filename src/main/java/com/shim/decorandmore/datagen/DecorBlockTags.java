package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.registry.DecorTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DecorBlockTags extends BlockTagsProvider {

    public DecorBlockTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, DecorAndMore.MODID, helper);

    }

    @Override
    @SuppressWarnings("unchecked")
    protected void addTags() {

        tag(DecorTags.Blocks.BENCHES)
                .add(DecorBlocks.ACACIA_BENCH.get()).add(DecorBlocks.BIRCH_BENCH.get()).add(DecorBlocks.CRIMSON_BENCH.get())
                .add(DecorBlocks.DARK_OAK_BENCH.get()).add(DecorBlocks.OAK_BENCH.get()).add(DecorBlocks.SPRUCE_BENCH.get())
                .add(DecorBlocks.JUNGLE_BENCH.get()).add(DecorBlocks.WARPED_BENCH.get());

        tag(DecorTags.Blocks.HALF_BENCHES)
                .add(DecorBlocks.HALF_ACACIA_BENCH.get()).add(DecorBlocks.HALF_BIRCH_BENCH.get()).add(DecorBlocks.HALF_CRIMSON_BENCH.get())
                .add(DecorBlocks.HALF_DARK_OAK_BENCH.get()).add(DecorBlocks.HALF_OAK_BENCH.get()).add(DecorBlocks.HALF_SPRUCE_BENCH.get())
                .add(DecorBlocks.HALF_JUNGLE_BENCH.get()).add(DecorBlocks.HALF_WARPED_BENCH.get());

        tag(DecorTags.Blocks.STOOLS)
                .add(DecorBlocks.ACACIA_STOOL.get()).add(DecorBlocks.BIRCH_STOOL.get()).add(DecorBlocks.CRIMSON_STOOL.get())
                .add(DecorBlocks.DARK_OAK_STOOL.get()).add(DecorBlocks.OAK_STOOL.get()).add(DecorBlocks.SPRUCE_STOOL.get())
                .add(DecorBlocks.JUNGLE_STOOL.get()).add(DecorBlocks.WARPED_STOOL.get())
                .add(DecorBlocks.ACACIA_LOG_STOOL.get()).add(DecorBlocks.BIRCH_LOG_STOOL.get()).add(DecorBlocks.CRIMSON_STEM_STOOL.get())
                .add(DecorBlocks.DARK_OAK_LOG_STOOL.get()).add(DecorBlocks.OAK_LOG_STOOL.get()).add(DecorBlocks.SPRUCE_LOG_STOOL.get())
                .add(DecorBlocks.JUNGLE_LOG_STOOL.get()).add(DecorBlocks.WARPED_STEM_STOOL.get())
                .add(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get()).add(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get())
                .add(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get()).add(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get())
                .add(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get()).add(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get());

        tag(DecorTags.Blocks.SEATS)
                .addTags(DecorTags.Blocks.BENCHES, DecorTags.Blocks.HALF_BENCHES, DecorTags.Blocks.STOOLS);

        tag(DecorTags.Blocks.PATHS)
                .add(DecorBlocks.COBBLESTONE_PATH.get()).add(DecorBlocks.MOSSY_COBBLESTONE_PATH.get()).add(DecorBlocks.STONE_BRICK_PATH.get())
                .add(DecorBlocks.MOSSY_STONE_BRICK_PATH.get()).add(DecorBlocks.BRICK_PATH.get()).add(DecorBlocks.NETHER_BRICK_PATH.get())
                .add(DecorBlocks.DEEPSLATE_BRICK_PATH.get()).add(DecorBlocks.END_STONE_BRICK_PATH.get())
                
                .add(DecorBlocks.OAK_PATH.get()).add(DecorBlocks.DARK_OAK_PATH.get()).add(DecorBlocks.ACACIA_PATH.get())
                .add(DecorBlocks.SPRUCE_PATH.get()).add(DecorBlocks.BIRCH_PATH.get()).add(DecorBlocks.JUNGLE_PATH.get())
                .add(DecorBlocks.CRIMSON_PATH.get()).add(DecorBlocks.WARPED_PATH.get());

        tag(DecorTags.Blocks.WOODEN_TABLES)
                .add(DecorBlocks.OAK_TABLE_PLANKS.get()).add(DecorBlocks.OAK_TABLE_LOGS.get()).add(DecorBlocks.OAK_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.OAK_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.OAK_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.OAK_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.DARK_OAK_TABLE_PLANKS.get()).add(DecorBlocks.DARK_OAK_TABLE_LOGS.get()).add(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.DARK_OAK_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.SPRUCE_TABLE_PLANKS.get()).add(DecorBlocks.SPRUCE_TABLE_LOGS.get()).add(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.SPRUCE_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.SPRUCE_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.JUNGLE_TABLE_PLANKS.get()).add(DecorBlocks.JUNGLE_TABLE_LOGS.get()).add(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.JUNGLE_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.JUNGLE_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.ACACIA_TABLE_PLANKS.get()).add(DecorBlocks.ACACIA_TABLE_LOGS.get()).add(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.ACACIA_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.ACACIA_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.BIRCH_TABLE_PLANKS.get()).add(DecorBlocks.BIRCH_TABLE_LOGS.get()).add(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS.get())
                .add(DecorBlocks.BIRCH_TABLE_PLANKS_LOGS.get()).add(DecorBlocks.BIRCH_TABLE_PLANKS_STRIPPED_LOGS.get()).add(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS_LOGS.get())

                .add(DecorBlocks.WARPED_TABLE_PLANKS.get()).add(DecorBlocks.WARPED_TABLE_STEMS.get()).add(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS.get())
                .add(DecorBlocks.WARPED_TABLE_PLANKS_STEMS.get()).add(DecorBlocks.WARPED_TABLE_PLANKS_STRIPPED_STEMS.get()).add(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS_STEMS.get())

                .add(DecorBlocks.CRIMSON_TABLE_PLANKS.get()).add(DecorBlocks.CRIMSON_TABLE_STEMS.get()).add(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS.get())
                .add(DecorBlocks.CRIMSON_TABLE_PLANKS_STEMS.get()).add(DecorBlocks.CRIMSON_TABLE_PLANKS_STRIPPED_STEMS.get()).add(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS_STEMS.get());

        tag(DecorTags.Blocks.STONE_OR_METAL_TABLES)
                .add(DecorBlocks.DIORITE_TABLE.get()).add(DecorBlocks.DIORITE_TABLE_POLISHED.get())

                .add(DecorBlocks.GRANITE_TABLE.get()).add(DecorBlocks.GRANITE_TABLE_POLISHED.get())
                .add(DecorBlocks.ANDESITE_TABLE.get()).add(DecorBlocks.ANDESITE_TABLE_POLISHED.get())

                .add(DecorBlocks.STONE_BRICKS_TABLE.get()).add(DecorBlocks.SMOOTH_STONE_TABLE.get())
                .add(DecorBlocks.QUARTZ_BRICK_TABLE.get()).add(DecorBlocks.SMOOTH_QUARTZ_TABLE.get())
                .add(DecorBlocks.NETHER_BRICK_TABLE.get()).add(DecorBlocks.RED_NETHER_BRICK_TABLE.get())
                .add(DecorBlocks.POLISHED_BLACKSTONE_BRICKS_TABLE.get()).add(DecorBlocks.POLISHED_BLACKSTONE_TABLE.get())
                .add(DecorBlocks.BRICK_TABLE.get()).add(DecorBlocks.PURPUR_TABLE.get()).add(DecorBlocks.END_STONE_BRICKS_TABLE.get())

                .add(DecorBlocks.CUT_COPPER_TABLE.get()).add(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get()).add(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get())
                .add(DecorBlocks.WAXED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get());

        tag(DecorTags.Blocks.TABLES)
                .addTag(DecorTags.Blocks.WOODEN_TABLES)
                .addTag(DecorTags.Blocks.STONE_OR_METAL_TABLES);


        tag(BlockTags.MINEABLE_WITH_AXE)
                .addTag(DecorTags.Blocks.SEATS)
                .addTag(DecorTags.Blocks.WOODEN_TABLES)

                .add(DecorBlocks.OAK_PATH.get()).add(DecorBlocks.DARK_OAK_PATH.get()).add(DecorBlocks.ACACIA_PATH.get())
                .add(DecorBlocks.SPRUCE_PATH.get()).add(DecorBlocks.BIRCH_PATH.get()).add(DecorBlocks.JUNGLE_PATH.get())
                .add(DecorBlocks.CRIMSON_PATH.get()).add(DecorBlocks.WARPED_PATH.get());
        
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(DecorTags.Blocks.STONE_OR_METAL_TABLES)

                .add(DecorBlocks.COBBLESTONE_PATH.get()).add(DecorBlocks.MOSSY_COBBLESTONE_PATH.get()).add(DecorBlocks.STONE_BRICK_PATH.get())
                .add(DecorBlocks.MOSSY_STONE_BRICK_PATH.get()).add(DecorBlocks.BRICK_PATH.get()).add(DecorBlocks.NETHER_BRICK_PATH.get())
                .add(DecorBlocks.DEEPSLATE_BRICK_PATH.get()).add(DecorBlocks.END_STONE_BRICK_PATH.get())

                .add(DecorBlocks.GOLD_CHAIN.get()).add(DecorBlocks.NETHERITE_CHAIN.get())
                .add(DecorBlocks.COPPER_CHAIN.get()).add(DecorBlocks.EXPOSED_COPPER_CHAIN.get()).add(DecorBlocks.WEATHERED_COPPER_CHAIN.get()).add(DecorBlocks.OXIDIZED_COPPER_CHAIN.get())
                .add(DecorBlocks.WAXED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get())

                .add(DecorBlocks.GOLD_LANTERN.get()).add(DecorBlocks.NETHERITE_LANTERN.get())
                .add(DecorBlocks.COPPER_LANTERN.get()).add(DecorBlocks.EXPOSED_COPPER_LANTERN.get()).add(DecorBlocks.WEATHERED_COPPER_LANTERN.get()).add(DecorBlocks.OXIDIZED_COPPER_LANTERN.get())
                .add(DecorBlocks.WAXED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get())


                .add(DecorBlocks.IRON_GRATE.get()).add(DecorBlocks.GOLD_GRATE.get()).add(DecorBlocks.NETHERITE_GRATE.get())
                .add(DecorBlocks.COPPER_GRATE.get()).add(DecorBlocks.EXPOSED_COPPER_GRATE.get()).add(DecorBlocks.WEATHERED_COPPER_GRATE.get()).add(DecorBlocks.OXIDIZED_COPPER_GRATE.get())
                .add(DecorBlocks.WAXED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE.get());

        tag(BlockTags.SLABS)
                .addTag(DecorTags.Blocks.HALF_BENCHES)
                .addTag(DecorTags.Blocks.STOOLS);

        tag(BlockTags.STAIRS)
                .addTag(DecorTags.Blocks.BENCHES);


        tag(DecorTags.Blocks.WAXED_COPPER)
                .add(DecorBlocks.WAXED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get())
                .add(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get())
                .add(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get())
                .add(DecorBlocks.WAXED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get()).add(DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get())
                .add(DecorBlocks.WAXED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get())
                .add(DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get())
                .add(DecorBlocks.WAXED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE.get());

        tag(BlockTags.WOODEN_FENCES)
                .add(DecorBlocks.OAK_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get())
                .add(DecorBlocks.JUNGLE_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE.get())
                .add(DecorBlocks.BIRCH_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE.get())
                .add(DecorBlocks.WARPED_STEM_FENCE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE.get())

                .add(DecorBlocks.STRIPPED_OAK_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_JUNGLE_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_BIRCH_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_WARPED_STEM_FENCE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE.get());


        tag(BlockTags.FENCES)
                .add(DecorBlocks.OAK_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get())
                .add(DecorBlocks.JUNGLE_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE.get())
                .add(DecorBlocks.BIRCH_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE.get())
                .add(DecorBlocks.WARPED_STEM_FENCE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE.get())

                .add(DecorBlocks.STRIPPED_OAK_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_JUNGLE_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_BIRCH_LOG_FENCE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE.get())
                .add(DecorBlocks.STRIPPED_WARPED_STEM_FENCE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE.get());

        tag(BlockTags.FENCE_GATES)
                .add(DecorBlocks.OAK_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE_GATE.get())
                .add(DecorBlocks.JUNGLE_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE_GATE.get())
                .add(DecorBlocks.BIRCH_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE_GATE.get())
                .add(DecorBlocks.WARPED_STEM_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE_GATE.get())

                .add(DecorBlocks.STRIPPED_OAK_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_DARK_OAK_LOG_FENCE_GATE.get())
                .add(DecorBlocks.STRIPPED_JUNGLE_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_ACACIA_LOG_FENCE_GATE.get())
                .add(DecorBlocks.STRIPPED_BIRCH_LOG_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_SPRUCE_LOG_FENCE_GATE.get())
                .add(DecorBlocks.STRIPPED_WARPED_STEM_FENCE_GATE.get()).add(DecorBlocks.STRIPPED_CRIMSON_STEM_FENCE_GATE.get());

    }
}
