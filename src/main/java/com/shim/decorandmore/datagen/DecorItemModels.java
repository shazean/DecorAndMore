package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class DecorItemModels extends ItemModelProvider {

    public DecorItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, DecorAndMore.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        for (RegistryObject<? extends Block> block : DecorBlocks.BLOCKS_ITEM_MODELS)
            self(block.get());


        slabStool(DecorBlocks.OAK_STOOL.get());
        slabStool(DecorBlocks.DARK_OAK_STOOL.get());
        slabStool(DecorBlocks.JUNGLE_STOOL.get());
        slabStool(DecorBlocks.ACACIA_STOOL.get());
        slabStool(DecorBlocks.SPRUCE_STOOL.get());
        slabStool(DecorBlocks.BIRCH_STOOL.get());
        slabStool(DecorBlocks.CRIMSON_STOOL.get());
        slabStool(DecorBlocks.WARPED_STOOL.get());

        slabStool(DecorBlocks.OAK_LOG_STOOL.get());
        slabStool(DecorBlocks.DARK_OAK_LOG_STOOL.get());
        slabStool(DecorBlocks.JUNGLE_LOG_STOOL.get());
        slabStool(DecorBlocks.ACACIA_LOG_STOOL.get());
        slabStool(DecorBlocks.SPRUCE_LOG_STOOL.get());
        slabStool(DecorBlocks.BIRCH_LOG_STOOL.get());
        slabStool(DecorBlocks.CRIMSON_STEM_STOOL.get());
        slabStool(DecorBlocks.WARPED_STEM_STOOL.get());

        slabStool(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get());
        slabStool(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get());

//        self(DecorBlocks.OAK_BENCH.get());
//        self(DecorBlocks.DARK_OAK_BENCH.get());
//        self(DecorBlocks.SPRUCE_BENCH.get());
//        self(DecorBlocks.JUNGLE_BENCH.get());
//        self(DecorBlocks.ACACIA_BENCH.get());
//        self(DecorBlocks.BIRCH_BENCH.get());
//        self(DecorBlocks.WARPED_BENCH.get());
//        self(DecorBlocks.CRIMSON_BENCH.get());
//
//        self(DecorBlocks.HALF_OAK_BENCH.get());
//        self(DecorBlocks.HALF_DARK_OAK_BENCH.get());
//        self(DecorBlocks.HALF_SPRUCE_BENCH.get());
//        self(DecorBlocks.HALF_JUNGLE_BENCH.get());
//        self(DecorBlocks.HALF_ACACIA_BENCH.get());
//        self(DecorBlocks.HALF_BIRCH_BENCH.get());
//        self(DecorBlocks.HALF_WARPED_BENCH.get());
//        self(DecorBlocks.HALF_CRIMSON_BENCH.get());

        generatedItem(DecorBlocks.GOLD_LANTERN.get());
        generatedItem(DecorBlocks.GOLD_SOUL_LANTERN.get());
        generatedItem(DecorBlocks.NETHERITE_LANTERN.get());
        generatedItem(DecorBlocks.NETHERITE_SOUL_LANTERN.get());
        generatedItem(DecorBlocks.COPPER_LANTERN.get());
        generatedItem(DecorBlocks.COPPER_SOUL_LANTERN.get());
        generatedItem(DecorBlocks.EXPOSED_COPPER_LANTERN.get());
        generatedItem(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get());
        generatedItem(DecorBlocks.WEATHERED_COPPER_LANTERN.get());
        generatedItem(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get());
        generatedItem(DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
        generatedItem(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get());

        generatedItem(DecorBlocks.WAXED_COPPER_LANTERN.get(), "copper_lantern");
        generatedItem(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get(), "copper_soul_lantern");
        generatedItem(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get(), "exposed_copper_lantern");
        generatedItem(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get(), "exposed_copper_soul_lantern");
        generatedItem(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get(), "weathered_copper_lantern");
        generatedItem(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get(), "weathered_copper_soul_lantern");
        generatedItem(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get(), "oxidized_copper_lantern");
        generatedItem(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get(), "oxidized_copper_soul_lantern");

        generatedItem(DecorBlocks.REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.GOLD_REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.NETHERITE_REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.COPPER_REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get());
        generatedItem(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get());

        generatedItem(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get(), "copper_redstone_lantern");
        generatedItem(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get(), "exposed_copper_redstone_lantern");
        generatedItem(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get(), "weathered_copper_redstone_lantern");
        generatedItem(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get(), "oxidized_copper_redstone_lantern");

//        self(DecorBlocks.OAK_TABLE_PLANKS.get());
//        self(DecorBlocks.OAK_TABLE_LOGS.get());
//        self(DecorBlocks.OAK_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.OAK_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.OAK_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.OAK_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.DARK_OAK_TABLE_PLANKS.get());
//        self(DecorBlocks.DARK_OAK_TABLE_LOGS.get());
//        self(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.DARK_OAK_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.SPRUCE_TABLE_PLANKS.get());
//        self(DecorBlocks.SPRUCE_TABLE_LOGS.get());
//        self(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.SPRUCE_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.SPRUCE_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.JUNGLE_TABLE_PLANKS.get());
//        self(DecorBlocks.JUNGLE_TABLE_LOGS.get());
//        self(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.JUNGLE_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.JUNGLE_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.ACACIA_TABLE_PLANKS.get());
//        self(DecorBlocks.ACACIA_TABLE_LOGS.get());
//        self(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.ACACIA_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.ACACIA_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.BIRCH_TABLE_PLANKS.get());
//        self(DecorBlocks.BIRCH_TABLE_LOGS.get());
//        self(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS.get());
//        self(DecorBlocks.BIRCH_TABLE_PLANKS_LOGS.get());
//        self(DecorBlocks.BIRCH_TABLE_PLANKS_STRIPPED_LOGS.get());
//        self(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS_LOGS.get());
//
//        self(DecorBlocks.WARPED_TABLE_PLANKS.get());
//        self(DecorBlocks.WARPED_TABLE_STEMS.get());
//        self(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS.get());
//        self(DecorBlocks.WARPED_TABLE_PLANKS_STEMS.get());
//        self(DecorBlocks.WARPED_TABLE_PLANKS_STRIPPED_STEMS.get());
//        self(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS_STEMS.get());
//
//        self(DecorBlocks.CRIMSON_TABLE_PLANKS.get());
//        self(DecorBlocks.CRIMSON_TABLE_STEMS.get());
//        self(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS.get());
//        self(DecorBlocks.CRIMSON_TABLE_PLANKS_STEMS.get());
//        self(DecorBlocks.CRIMSON_TABLE_PLANKS_STRIPPED_STEMS.get());
//        self(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS_STEMS.get());

    }

    private String name(ItemLike block) {
        return block.asItem().getRegistryName().getPath();
    }

    public void generatedItem(ItemLike item, String path) {
        this.singleTexture(name(item), new ResourceLocation("item/generated"), "layer0", modLoc("item/" + path));
    }

    public void generatedItem(ItemLike item) {
        this.singleTexture(name(item), new ResourceLocation("item/generated"), "layer0", modLoc("item/" + name(item)));
    }

    protected void self(Block block) {
        this.withExistingParent(name(block), this.modLoc("block/" + name(block)));
    }

    public void slabStool(Block block) {
        ResourceLocation parent = new ResourceLocation("item/generated");

        ItemModelBuilder builder = getBuilder(name(block)).parent(getExistingFile(parent));

        for (int i = 0; i < 16; i++) {
            builder = getColorOverride(builder, block, i);
        }
    }

    public ItemModelBuilder getColorOverride(ItemModelBuilder builder, Block block, int colorId) {
        String color = DyeColor.byId(colorId).getName();

        return builder.override().predicate(mcLoc("color"), colorId)
                .model(withExistingParent(color + "_" + name(block), new ResourceLocation(block.getRegistryName().getNamespace(), "block/" + color + "_" + name(block)))).end();
    }
}
