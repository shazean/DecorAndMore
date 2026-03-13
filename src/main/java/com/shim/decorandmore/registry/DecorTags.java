package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DecorTags {

    public static class Blocks {

        public static final TagKey<Block> SEATS = BlockTags.create(modLoc("seats"));
        public static final TagKey<Block> STOOLS = BlockTags.create(modLoc("stools"));
        public static final TagKey<Block> BENCHES = BlockTags.create(modLoc("benches"));
        public static final TagKey<Block> HALF_BENCHES = BlockTags.create(modLoc("half_benches"));
        public static final TagKey<Block> LANTERNS = BlockTags.create(modLoc("lanterns"));
        public static final TagKey<Block> WAXED_COPPER = BlockTags.create(modLoc("waxed_copper"));
        public static final TagKey<Block> PATHS = BlockTags.create(modLoc("paths"));
        public static final TagKey<Block> TABLES = BlockTags.create(modLoc("tables"));
        public static final TagKey<Block> WOODEN_TABLES = BlockTags.create(modLoc("wooden_tables"));
        public static final TagKey<Block> STONE_OR_METAL_TABLES = BlockTags.create(modLoc("stone_or_metal_tables"));

    }

    public static class Items {
        public static final TagKey<Item> SEATS = ItemTags.create(modLoc("seats"));
        public static final TagKey<Item> STOOLS = ItemTags.create(modLoc("stools"));
        public static final TagKey<Item> BENCHES = ItemTags.create(modLoc("benches"));
        public static final TagKey<Item> HALF_BENCHES = ItemTags.create(modLoc("half_benches"));
        public static final TagKey<Item> LANTERNS = ItemTags.create(modLoc("lanterns"));
        public static final TagKey<Item> WAXED_COPPER = ItemTags.create(modLoc("waxed_copper"));
        public static final TagKey<Item> PATHS = ItemTags.create(modLoc("paths"));
        public static final TagKey<Item> TABLES = ItemTags.create(modLoc("tables"));
        public static final TagKey<Item> WOODEN_TABLES = ItemTags.create(modLoc("wooden_tables"));
        public static final TagKey<Item> STONE_OR_METAL_TABLES = ItemTags.create(modLoc("stone_or_metal_tables"));

    }

    private static ResourceLocation modLoc(String location) {
        return new ResourceLocation(DecorAndMore.MODID, location);
    }
}