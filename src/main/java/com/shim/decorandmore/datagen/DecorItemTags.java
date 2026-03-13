package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorTags;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DecorItemTags extends ItemTagsProvider {

    public DecorItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, DecorAndMore.MODID, helper);
    }

    @Override
    protected void addTags() {

        this.copy(DecorTags.Blocks.BENCHES, DecorTags.Items.BENCHES);
        this.copy(DecorTags.Blocks.HALF_BENCHES, DecorTags.Items.HALF_BENCHES);
        this.copy(DecorTags.Blocks.STOOLS, DecorTags.Items.STOOLS);
        this.copy(DecorTags.Blocks.SEATS, DecorTags.Items.SEATS);
        this.copy(DecorTags.Blocks.PATHS, DecorTags.Items.PATHS);
        this.copy(DecorTags.Blocks.WOODEN_TABLES, DecorTags.Items.WOODEN_TABLES);
        this.copy(DecorTags.Blocks.STONE_OR_METAL_TABLES, DecorTags.Items.STONE_OR_METAL_TABLES);
        this.copy(DecorTags.Blocks.TABLES, DecorTags.Items.TABLES);

        this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
        this.copy(BlockTags.SLABS, ItemTags.SLABS);

        this.copy(DecorTags.Blocks.WAXED_COPPER, DecorTags.Items.WAXED_COPPER);


    }
}
