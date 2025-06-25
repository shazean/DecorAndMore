package com.shim.decorandmore.datagen;

import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
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
    }

    private String name(ItemLike block) {
        return block.asItem().getRegistryName().getPath();
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