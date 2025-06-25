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

    }

    public static class Items {
        public static final TagKey<Item> SEATS = ItemTags.create(modLoc("seats"));
        public static final TagKey<Item> STOOLS = ItemTags.create(modLoc("stools"));
        public static final TagKey<Item> BENCHES = ItemTags.create(modLoc("benches"));
        public static final TagKey<Item> HALF_BENCHES = ItemTags.create(modLoc("half_benches"));
        public static final TagKey<Item> LANTERNS = ItemTags.create(modLoc("lanterns"));

    }

    private static ResourceLocation modLoc(String location) {
        return new ResourceLocation(DecorAndMore.MODID, location);
    }
}