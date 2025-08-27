package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.registry.DecorTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
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

        tag(net.minecraft.tags.BlockTags.MINEABLE_WITH_AXE)
                .addTag(DecorTags.Blocks.SEATS);

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
                .add(DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get()).add(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get());


    }
}
