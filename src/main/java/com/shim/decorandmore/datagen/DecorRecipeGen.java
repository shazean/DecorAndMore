package com.shim.decorandmore.datagen;

import com.shim.decorandmore.blocks.LogTableBlock;
import com.shim.decorandmore.blocks.TableBlock;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.function.Consumer;

public class DecorRecipeGen extends RecipeProvider {

    public DecorRecipeGen(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

        dyedStool(DecorBlocks.OAK_STOOL.get(), Blocks.OAK_PLANKS, consumer);
        dyedStool(DecorBlocks.DARK_OAK_STOOL.get(), Blocks.DARK_OAK_PLANKS, consumer);
        dyedStool(DecorBlocks.SPRUCE_STOOL.get(), Blocks.SPRUCE_PLANKS, consumer);
        dyedStool(DecorBlocks.JUNGLE_STOOL.get(), Blocks.JUNGLE_PLANKS, consumer);
        dyedStool(DecorBlocks.ACACIA_STOOL.get(), Blocks.ACACIA_PLANKS, consumer);
        dyedStool(DecorBlocks.BIRCH_STOOL.get(), Blocks.BIRCH_PLANKS, consumer);
        dyedStool(DecorBlocks.CRIMSON_STOOL.get(), Blocks.CRIMSON_PLANKS, consumer);
        dyedStool(DecorBlocks.WARPED_STOOL.get(), Blocks.WARPED_PLANKS, consumer);

        dyedStool(DecorBlocks.OAK_LOG_STOOL.get(), Blocks.OAK_LOG, consumer);
        dyedStool(DecorBlocks.DARK_OAK_LOG_STOOL.get(), Blocks.DARK_OAK_LOG, consumer);
        dyedStool(DecorBlocks.SPRUCE_LOG_STOOL.get(), Blocks.SPRUCE_LOG, consumer);
        dyedStool(DecorBlocks.JUNGLE_LOG_STOOL.get(), Blocks.JUNGLE_LOG, consumer);
        dyedStool(DecorBlocks.ACACIA_LOG_STOOL.get(), Blocks.ACACIA_LOG, consumer);
        dyedStool(DecorBlocks.BIRCH_LOG_STOOL.get(), Blocks.BIRCH_LOG, consumer);
        dyedStool(DecorBlocks.CRIMSON_STEM_STOOL.get(), Blocks.CRIMSON_STEM, consumer);
        dyedStool(DecorBlocks.WARPED_STEM_STOOL.get(), Blocks.WARPED_STEM, consumer);

        dyedStool(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get(), Blocks.STRIPPED_OAK_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get(), Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get(), Blocks.STRIPPED_SPRUCE_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get(), Blocks.STRIPPED_JUNGLE_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get(), Blocks.STRIPPED_ACACIA_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get(), Blocks.STRIPPED_BIRCH_LOG, consumer);
        dyedStool(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get(), Blocks.STRIPPED_CRIMSON_STEM, consumer);
        dyedStool(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get(), Blocks.STRIPPED_WARPED_STEM, consumer);

        stairs(DecorBlocks.OAK_BENCH.get(), Blocks.OAK_LOG, consumer);
        stairs(DecorBlocks.DARK_OAK_BENCH.get(), Blocks.DARK_OAK_LOG, consumer);
        stairs(DecorBlocks.SPRUCE_BENCH.get(), Blocks.SPRUCE_LOG, consumer);
        stairs(DecorBlocks.JUNGLE_BENCH.get(), Blocks.JUNGLE_LOG, consumer);
        stairs(DecorBlocks.ACACIA_BENCH.get(), Blocks.ACACIA_LOG, consumer);
        stairs(DecorBlocks.BIRCH_BENCH.get(), Blocks.BIRCH_LOG, consumer);
        stairs(DecorBlocks.WARPED_BENCH.get(), Blocks.WARPED_STEM, consumer);
        stairs(DecorBlocks.CRIMSON_BENCH.get(), Blocks.CRIMSON_STEM, consumer);

        slab(DecorBlocks.HALF_OAK_BENCH.get(), Blocks.OAK_LOG, consumer);
        slab(DecorBlocks.HALF_DARK_OAK_BENCH.get(), Blocks.DARK_OAK_LOG, consumer);
        slab(DecorBlocks.HALF_SPRUCE_BENCH.get(), Blocks.SPRUCE_LOG, consumer);
        slab(DecorBlocks.HALF_JUNGLE_BENCH.get(), Blocks.JUNGLE_LOG, consumer);
        slab(DecorBlocks.HALF_ACACIA_BENCH.get(), Blocks.ACACIA_LOG, consumer);
        slab(DecorBlocks.HALF_BIRCH_BENCH.get(), Blocks.BIRCH_LOG, consumer);
        slab(DecorBlocks.HALF_WARPED_BENCH.get(), Blocks.WARPED_STEM, consumer);
        slab(DecorBlocks.HALF_CRIMSON_BENCH.get(), Blocks.CRIMSON_STEM, consumer);

        lanterns(DecorBlocks.GOLD_LANTERN.get(), DecorBlocks.GOLD_SOUL_LANTERN.get(), DecorBlocks.GOLD_REDSTONE_LANTERN.get(), true, Items.GOLD_NUGGET, consumer);
        lanterns(DecorBlocks.COPPER_LANTERN.get(), DecorBlocks.COPPER_SOUL_LANTERN.get(), DecorBlocks.COPPER_REDSTONE_LANTERN.get(), false, Items.COPPER_INGOT, consumer);
        lanterns(DecorBlocks.NETHERITE_LANTERN.get(), DecorBlocks.NETHERITE_SOUL_LANTERN.get(), DecorBlocks.NETHERITE_REDSTONE_LANTERN.get(), false, Items.NETHERITE_INGOT, consumer);
        ShapedRecipeBuilder.shaped(DecorBlocks.REDSTONE_LANTERN.get()).pattern("XXX").pattern("XTX").pattern("XXX").define('X', Items.IRON_NUGGET).define('T', Items.REDSTONE_TORCH).unlockedBy(name( Items.IRON_NUGGET), has( Items.IRON_NUGGET)).save(consumer);

        redstoneLamp(DecorBlocks.RED_REDSTONE_LAMP.get(), Items.RED_DYE, consumer);
        redstoneLamp(DecorBlocks.ORANGE_REDSTONE_LAMP.get(), Items.ORANGE_DYE, consumer);
        redstoneLamp(DecorBlocks.YELLOW_REDSTONE_LAMP.get(), Items.YELLOW_DYE, consumer);
        redstoneLamp(DecorBlocks.LIME_REDSTONE_LAMP.get(), Items.LIME_DYE, consumer);
        redstoneLamp(DecorBlocks.GREEN_REDSTONE_LAMP.get(), Items.GREEN_DYE, consumer);
        redstoneLamp(DecorBlocks.CYAN_REDSTONE_LAMP.get(), Items.CYAN_DYE, consumer);
        redstoneLamp(DecorBlocks.BLUE_REDSTONE_LAMP.get(), Items.BLUE_DYE, consumer);
        redstoneLamp(DecorBlocks.LIGHT_BLUE_REDSTONE_LAMP.get(), Items.LIGHT_BLUE_DYE, consumer);
        redstoneLamp(DecorBlocks.PURPLE_REDSTONE_LAMP.get(), Items.PURPLE_DYE, consumer);
        redstoneLamp(DecorBlocks.MAGENTA_REDSTONE_LAMP.get(), Items.MAGENTA_DYE, consumer);
        redstoneLamp(DecorBlocks.PINK_REDSTONE_LAMP.get(), Items.PINK_DYE, consumer);
        redstoneLamp(DecorBlocks.BROWN_REDSTONE_LAMP.get(), Items.BROWN_DYE, consumer);
        redstoneLamp(DecorBlocks.BLACK_REDSTONE_LAMP.get(), Items.BLACK_DYE, consumer);
        redstoneLamp(DecorBlocks.GRAY_REDSTONE_LAMP.get(), Items.GRAY_DYE, consumer);
        redstoneLamp(DecorBlocks.LIGHT_GRAY_REDSTONE_LAMP.get(), Items.LIGHT_GRAY_DYE, consumer);
        redstoneLamp(DecorBlocks.WHITE_REDSTONE_LAMP.get(), Items.WHITE_DYE, consumer);

        table(DecorBlocks.OAK_TABLE_PLANKS.get(), Blocks.OAK_PLANKS, Blocks.OAK_PLANKS, consumer);
        table(DecorBlocks.OAK_TABLE_LOGS.get(), Blocks.OAK_LOG, Blocks.OAK_LOG, consumer);
        table(DecorBlocks.OAK_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_OAK_LOG, Blocks.STRIPPED_OAK_LOG, consumer);
        table(DecorBlocks.OAK_TABLE_PLANKS_LOGS.get(), Blocks.OAK_PLANKS, Blocks.OAK_LOG, consumer);
        table(DecorBlocks.OAK_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.OAK_PLANKS, Blocks.STRIPPED_OAK_LOG, consumer);
        table(DecorBlocks.OAK_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_OAK_LOG, Blocks.OAK_LOG, consumer);

        table(DecorBlocks.DARK_OAK_TABLE_PLANKS.get(), Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_PLANKS, consumer);
        table(DecorBlocks.DARK_OAK_TABLE_LOGS.get(), Blocks.DARK_OAK_LOG, Blocks.DARK_OAK_LOG, consumer);
        table(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_DARK_OAK_LOG, Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        table(DecorBlocks.DARK_OAK_TABLE_PLANKS_LOGS.get(), Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_LOG, consumer);
        table(DecorBlocks.DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.DARK_OAK_PLANKS, Blocks.STRIPPED_DARK_OAK_LOG, consumer);
        table(DecorBlocks.DARK_OAK_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_DARK_OAK_LOG, Blocks.DARK_OAK_LOG, consumer);

        table(DecorBlocks.SPRUCE_TABLE_PLANKS.get(), Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_PLANKS, consumer);
        table(DecorBlocks.SPRUCE_TABLE_LOGS.get(), Blocks.SPRUCE_LOG, Blocks.SPRUCE_LOG, consumer);
        table(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_SPRUCE_LOG, Blocks.STRIPPED_SPRUCE_LOG, consumer);
        table(DecorBlocks.SPRUCE_TABLE_PLANKS_LOGS.get(), Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_LOG, consumer);
        table(DecorBlocks.SPRUCE_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.SPRUCE_PLANKS, Blocks.STRIPPED_SPRUCE_LOG, consumer);
        table(DecorBlocks.SPRUCE_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_SPRUCE_LOG, Blocks.SPRUCE_LOG, consumer);

        table(DecorBlocks.JUNGLE_TABLE_PLANKS.get(), Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_PLANKS, consumer);
        table(DecorBlocks.JUNGLE_TABLE_LOGS.get(), Blocks.JUNGLE_LOG, Blocks.JUNGLE_LOG, consumer);
        table(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_JUNGLE_LOG, Blocks.STRIPPED_JUNGLE_LOG, consumer);
        table(DecorBlocks.JUNGLE_TABLE_PLANKS_LOGS.get(), Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_LOG, consumer);
        table(DecorBlocks.JUNGLE_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.JUNGLE_PLANKS, Blocks.STRIPPED_JUNGLE_LOG, consumer);
        table(DecorBlocks.JUNGLE_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_JUNGLE_LOG, Blocks.JUNGLE_LOG, consumer);

        table(DecorBlocks.ACACIA_TABLE_PLANKS.get(), Blocks.ACACIA_PLANKS, Blocks.ACACIA_PLANKS, consumer);
        table(DecorBlocks.ACACIA_TABLE_LOGS.get(), Blocks.ACACIA_LOG, Blocks.ACACIA_LOG, consumer);
        table(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_ACACIA_LOG, Blocks.STRIPPED_ACACIA_LOG, consumer);
        table(DecorBlocks.ACACIA_TABLE_PLANKS_LOGS.get(), Blocks.ACACIA_PLANKS, Blocks.ACACIA_LOG, consumer);
        table(DecorBlocks.ACACIA_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.ACACIA_PLANKS, Blocks.STRIPPED_ACACIA_LOG, consumer);
        table(DecorBlocks.ACACIA_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_ACACIA_LOG, Blocks.ACACIA_LOG, consumer);

        table(DecorBlocks.BIRCH_TABLE_PLANKS.get(), Blocks.BIRCH_PLANKS, Blocks.BIRCH_PLANKS, consumer);
        table(DecorBlocks.BIRCH_TABLE_LOGS.get(), Blocks.BIRCH_LOG, Blocks.BIRCH_LOG, consumer);
        table(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS.get(), Blocks.STRIPPED_BIRCH_LOG, Blocks.STRIPPED_BIRCH_LOG, consumer);
        table(DecorBlocks.BIRCH_TABLE_PLANKS_LOGS.get(), Blocks.BIRCH_PLANKS, Blocks.BIRCH_LOG, consumer);
        table(DecorBlocks.BIRCH_TABLE_PLANKS_STRIPPED_LOGS.get(), Blocks.BIRCH_PLANKS, Blocks.STRIPPED_BIRCH_LOG, consumer);
        table(DecorBlocks.BIRCH_TABLE_STRIPPED_LOGS_LOGS.get(), Blocks.STRIPPED_BIRCH_LOG, Blocks.BIRCH_LOG, consumer);

        table(DecorBlocks.WARPED_TABLE_PLANKS.get(), Blocks.WARPED_PLANKS, Blocks.WARPED_PLANKS, consumer);
        table(DecorBlocks.WARPED_TABLE_STEMS.get(), Blocks.WARPED_STEM, Blocks.WARPED_STEM, consumer);
        table(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS.get(), Blocks.STRIPPED_WARPED_STEM, Blocks.STRIPPED_WARPED_STEM, consumer);
        table(DecorBlocks.WARPED_TABLE_PLANKS_STEMS.get(), Blocks.WARPED_PLANKS, Blocks.WARPED_STEM, consumer);
        table(DecorBlocks.WARPED_TABLE_PLANKS_STRIPPED_STEMS.get(), Blocks.WARPED_PLANKS, Blocks.STRIPPED_WARPED_STEM, consumer);
        table(DecorBlocks.WARPED_TABLE_STRIPPED_STEMS_STEMS.get(), Blocks.STRIPPED_WARPED_STEM, Blocks.WARPED_STEM, consumer);

        table(DecorBlocks.CRIMSON_TABLE_PLANKS.get(), Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_PLANKS, consumer);
        table(DecorBlocks.CRIMSON_TABLE_STEMS.get(), Blocks.CRIMSON_STEM, Blocks.CRIMSON_STEM, consumer);
        table(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS.get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.STRIPPED_CRIMSON_STEM, consumer);
        table(DecorBlocks.CRIMSON_TABLE_PLANKS_STEMS.get(), Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_STEM, consumer);
        table(DecorBlocks.CRIMSON_TABLE_PLANKS_STRIPPED_STEMS.get(), Blocks.CRIMSON_PLANKS, Blocks.STRIPPED_CRIMSON_STEM, consumer);
        table(DecorBlocks.CRIMSON_TABLE_STRIPPED_STEMS_STEMS.get(), Blocks.STRIPPED_CRIMSON_STEM, Blocks.CRIMSON_STEM, consumer);

        simpleTable(DecorBlocks.DIORITE_TABLE.get(), Blocks.DIORITE, consumer);
        simpleTable(DecorBlocks.DIORITE_TABLE_POLISHED.get(), Blocks.POLISHED_DIORITE, consumer);
//        simpleTwoBlockTable(DecorBlocks.DIORITE_TABLE_TOP_POLISHED.get(), Blocks.POLISHED_DIORITE, Blocks.DIORITE, consumer);
//        simpleTwoBlockTable(DecorBlocks.DIORITE_TABLE_BOTTOM_POLISHED.get(), Blocks.DIORITE, Blocks.POLISHED_DIORITE, consumer);

        simpleTable(DecorBlocks.GRANITE_TABLE.get(), Blocks.GRANITE, consumer);
        simpleTable(DecorBlocks.GRANITE_TABLE_POLISHED.get(), Blocks.POLISHED_GRANITE, consumer);
        simpleTable(DecorBlocks.ANDESITE_TABLE.get(), Blocks.ANDESITE, consumer);
        simpleTable(DecorBlocks.ANDESITE_TABLE_POLISHED.get(), Blocks.POLISHED_ANDESITE, consumer);

        simpleTable(DecorBlocks.STONE_BRICKS_TABLE.get(), Blocks.STONE_BRICKS, consumer);
        simpleTable(DecorBlocks.SMOOTH_STONE_TABLE.get(), Blocks.SMOOTH_STONE, consumer);

        simpleTable(DecorBlocks.QUARTZ_BRICK_TABLE.get(), Blocks.QUARTZ_BRICKS, consumer);
        simpleTable(DecorBlocks.SMOOTH_QUARTZ_TABLE.get(), Blocks.SMOOTH_QUARTZ, consumer);

        simpleTable(DecorBlocks.NETHER_BRICK_TABLE.get(), Blocks.NETHER_BRICKS, consumer);
        simpleTable(DecorBlocks.RED_NETHER_BRICK_TABLE.get(), Blocks.RED_NETHER_BRICKS, consumer);

        simpleTable(DecorBlocks.POLISHED_BLACKSTONE_BRICKS_TABLE.get(), Blocks.POLISHED_BLACKSTONE_BRICKS, consumer);
        simpleTable(DecorBlocks.POLISHED_BLACKSTONE_TABLE.get(), Blocks.POLISHED_BLACKSTONE, consumer);

        simpleTable(DecorBlocks.BRICK_TABLE.get(), Blocks.BRICKS, consumer);
        simpleTable(DecorBlocks.PURPUR_TABLE.get(), Blocks.PURPUR_BLOCK, consumer);
        simpleTable(DecorBlocks.END_STONE_BRICKS_TABLE.get(), Blocks.END_STONE_BRICKS, consumer);

        simpleTable(DecorBlocks.CUT_COPPER_TABLE.get(), Blocks.CUT_COPPER, consumer);
        simpleTable(DecorBlocks.EXPOSED_CUT_COPPER_TABLE.get(), Blocks.EXPOSED_CUT_COPPER, consumer);
        simpleTable(DecorBlocks.WEATHERED_CUT_COPPER_TABLE.get(), Blocks.WEATHERED_CUT_COPPER, consumer);
        simpleTable(DecorBlocks.OXIDIZED_CUT_COPPER_TABLE.get(), Blocks.OXIDIZED_CUT_COPPER, consumer);

        simpleTable(DecorBlocks.WAXED_CUT_COPPER_TABLE.get(), Blocks.CUT_COPPER, consumer);
        simpleTable(DecorBlocks.WAXED_EXPOSED_CUT_COPPER_TABLE.get(), Blocks.EXPOSED_CUT_COPPER, consumer);
        simpleTable(DecorBlocks.WAXED_WEATHERED_CUT_COPPER_TABLE.get(), Blocks.WEATHERED_CUT_COPPER, consumer);
        simpleTable(DecorBlocks.WAXED_OXIDIZED_CUT_COPPER_TABLE.get(), Blocks.OXIDIZED_CUT_COPPER, consumer);

        simpleTable(DecorBlocks.CUT_SANDSTONE_TABLE.get(), Blocks.CUT_SANDSTONE, consumer);
        simpleTable(DecorBlocks.SMOOTH_SANDSTONE_TABLE.get(), Blocks.SMOOTH_SANDSTONE, consumer);
        simpleTable(DecorBlocks.RED_CUT_SANDSTONE_TABLE.get(), Blocks.CUT_RED_SANDSTONE, consumer);
        simpleTable(DecorBlocks.SMOOTH_RED_SANDSTONE_TABLE.get(), Blocks.SMOOTH_SANDSTONE, consumer);

        simpleTable(DecorBlocks.POLISHED_DEEPSLATE_TABLE.get(), Blocks.POLISHED_DEEPSLATE, consumer);
        simpleTable(DecorBlocks.DEEPSLATE_BRICK_TABLE.get(), Blocks.DEEPSLATE_BRICKS, consumer);
        simpleTable(DecorBlocks.DEEPSLATE_TILE_TABLE.get(), Blocks.DEEPSLATE_TILES, consumer);

        simpleTable(DecorBlocks.PRISMARINE_BRICK_TABLE.get(), Blocks.PRISMARINE_BRICKS, consumer);
        simpleTable(DecorBlocks.DARK_PRISMARINE_TABLE.get(), Blocks.DARK_PRISMARINE, consumer);


    }

    private String name(ItemLike block) {
        return block.asItem().getRegistryName().getPath();
    }


    public void simpleTable(TableBlock table, ItemLike craftingItem, Consumer<FinishedRecipe> consumer) {
        table(table, craftingItem, craftingItem, consumer);
    }


    public void table(TableBlock table, ItemLike topItem, ItemLike bottomItem, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(table, 4).pattern("XXX").pattern(" x ").pattern(" x ").define('X', topItem).define('x', bottomItem).unlockedBy(name(topItem), has(topItem)).save(consumer);
    }

    public void redstoneLamp(ItemLike lamp, Item dye, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(lamp).requires(dye).requires(Items.REDSTONE_LAMP).unlockedBy("has_dye", has(dye)).save(consumer, name(lamp) + "_shapeless_dyed_lamp");
    }

    public void lanterns(ItemLike lantern, ItemLike soulLantern, ItemLike redstoneLantern, Boolean useNugget, Item nuggetOrIngot, Consumer<FinishedRecipe> consumer) {
        if (useNugget) {
            ShapedRecipeBuilder.shaped(lantern).pattern("XXX").pattern("XTX").pattern("XXX").define('X', nuggetOrIngot).define('T', Items.TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
            ShapedRecipeBuilder.shaped(soulLantern).pattern("XXX").pattern("XTX").pattern("XXX").define('X', nuggetOrIngot).define('T', Items.SOUL_TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
            ShapedRecipeBuilder.shaped(redstoneLantern).pattern("XXX").pattern("XTX").pattern("XXX").define('X', nuggetOrIngot).define('T', Items.REDSTONE_TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
        } else {
            ShapedRecipeBuilder.shaped(lantern, 2).pattern("X").pattern("T").pattern("X").define('X', nuggetOrIngot).define('T', Items.TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
            ShapedRecipeBuilder.shaped(soulLantern, 2).pattern("X").pattern("T").pattern("X").define('X', nuggetOrIngot).define('T', Items.SOUL_TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
            ShapedRecipeBuilder.shaped(redstoneLantern, 2).pattern("X").pattern("T").pattern("X").define('X', nuggetOrIngot).define('T', Items.REDSTONE_TORCH).unlockedBy(name(nuggetOrIngot), has(nuggetOrIngot)).save(consumer);
        }
    }

    public void stairs(ItemLike stair, ItemLike ingredient, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(stair, 6).pattern("X  ").pattern("XX ").pattern("XXX").define('X', ingredient).unlockedBy(name(ingredient), has(ingredient)).save(consumer);
    }

    public void slab(ItemLike slab, ItemLike ingredient, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(slab, 6).pattern("XXX").define('X', ingredient).unlockedBy(name(ingredient), has(ingredient)).save(consumer);
    }

    public void dyedStool(Block stool, Block wood, Consumer<FinishedRecipe> consumer) {
        DyedRecipeBuilder.shaped(stool, DyeColor.RED, 2).pattern("WW").pattern("XX").define('W', Items.RED_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "red_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.ORANGE, 2).pattern("WW").pattern("XX").define('W', Items.ORANGE_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "orange_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.YELLOW, 2).pattern("WW").pattern("XX").define('W', Items.YELLOW_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "yellow_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.LIME, 2).pattern("WW").pattern("XX").define('W', Items.LIME_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "lime_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.GREEN, 2).pattern("WW").pattern("XX").define('W', Items.GREEN_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "green_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.CYAN, 2).pattern("WW").pattern("XX").define('W', Items.CYAN_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "cyan_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.LIGHT_BLUE, 2).pattern("WW").pattern("XX").define('W', Items.LIGHT_BLUE_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "light_blue_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.BLUE, 2).pattern("WW").pattern("XX").define('W', Items.BLUE_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "blue_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.PURPLE, 2).pattern("WW").pattern("XX").define('W', Items.PURPLE_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "purple_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.MAGENTA, 2).pattern("WW").pattern("XX").define('W', Items.MAGENTA_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "magenta_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.PINK, 2).pattern("WW").pattern("XX").define('W', Items.PINK_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "pink_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.WHITE, 2).pattern("WW").pattern("XX").define('W', Items.WHITE_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "white_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.LIGHT_GRAY, 2).pattern("WW").pattern("XX").define('W', Items.LIGHT_GRAY_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "light_gray_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.GRAY, 2).pattern("WW").pattern("XX").define('W', Items.GRAY_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "gray_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.BLACK, 2).pattern("WW").pattern("XX").define('W', Items.BLACK_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "black_" + name(wood) + "_slab_stool");
        DyedRecipeBuilder.shaped(stool, DyeColor.BROWN, 2).pattern("WW").pattern("XX").define('W', Items.BROWN_WOOL).define('X', wood).unlockedBy(name(wood), has(wood)).save(consumer, "brown_" + name(wood) + "_slab_stool");
    }
}