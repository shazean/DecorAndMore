package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.CopperLanternBlock;
import com.shim.decorandmore.blocks.HalfBlock;
import com.shim.decorandmore.blocks.RedstoneLanternBlock;
import com.shim.decorandmore.blocks.SlabStoolBlock;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
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