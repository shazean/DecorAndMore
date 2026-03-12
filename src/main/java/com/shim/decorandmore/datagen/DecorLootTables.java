package com.shim.decorandmore.datagen;

import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

public class DecorLootTables extends BaseLootTableProvider {

    public DecorLootTables(DataGenerator dataGeneratorIn) {
        super(dataGeneratorIn);
    }

    @Override
    protected void addTables() {

        for (RegistryObject<? extends Block> block : DecorBlocks.BLOCKS_LOOT_TABLE)
            block(block.get(), createSimpleTable(block.get()));


//        self(DecorBlocks.ACACIA_BENCH.get());
//        self(DecorBlocks.BIRCH_BENCH.get());
//        self(DecorBlocks.CRIMSON_BENCH.get());
//        self(DecorBlocks.OAK_BENCH.get());
//        self(DecorBlocks.DARK_OAK_BENCH.get());
//        self(DecorBlocks.SPRUCE_BENCH.get());
//        self(DecorBlocks.JUNGLE_BENCH.get());
//        self(DecorBlocks.WARPED_BENCH.get());

        self(DecorBlocks.HALF_ACACIA_BENCH.get());
        self(DecorBlocks.HALF_BIRCH_BENCH.get());
        self(DecorBlocks.HALF_CRIMSON_BENCH.get());
        self(DecorBlocks.HALF_OAK_BENCH.get());
        self(DecorBlocks.HALF_DARK_OAK_BENCH.get());
        self(DecorBlocks.HALF_SPRUCE_BENCH.get());
        self(DecorBlocks.HALF_JUNGLE_BENCH.get());
        self(DecorBlocks.HALF_WARPED_BENCH.get());
//
//        self(DecorBlocks.GOLD_LANTERN.get());
//        self(DecorBlocks.GOLD_SOUL_LANTERN.get());
//        self(DecorBlocks.NETHERITE_LANTERN.get());
//        self(DecorBlocks.NETHERITE_SOUL_LANTERN.get());
//        self(DecorBlocks.COPPER_LANTERN.get());
//        self(DecorBlocks.COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.EXPOSED_COPPER_LANTERN.get());
//        self(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.WEATHERED_COPPER_LANTERN.get());
//        self(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
//        self(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get());
//
//        self(DecorBlocks.WAXED_COPPER_LANTERN.get());
//        self(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get());
//        self(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get());
//        self(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get());
//        self(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get());
//        self(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get());
//
//        self(DecorBlocks.REDSTONE_LANTERN.get());
//        self(DecorBlocks.GOLD_REDSTONE_LANTERN.get());
//        self(DecorBlocks.NETHERITE_REDSTONE_LANTERN.get());
//        self(DecorBlocks.COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get());
//
//        self(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get());
//        self(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get());

        createSilkTouchTable(DecorBlocks.COBBLESTONE_PATH.get(), Blocks.COBBLESTONE, 1 ,1);
        createSilkTouchTable(DecorBlocks.MOSSY_COBBLESTONE_PATH.get(), Blocks.MOSSY_COBBLESTONE, 1 ,1);
        createSilkTouchTable(DecorBlocks.STONE_BRICK_PATH.get(), Blocks.STONE_BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.MOSSY_STONE_BRICK_PATH.get(), Blocks.MOSSY_STONE_BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.BRICK_PATH.get(), Blocks.BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.NETHER_BRICK_PATH.get(), Blocks.NETHER_BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.DEEPSLATE_BRICK_PATH.get(), Blocks.DEEPSLATE_BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.END_STONE_BRICK_PATH.get(), Blocks.END_STONE_BRICKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.OAK_PATH.get(), Blocks.OAK_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.DARK_OAK_PATH.get(), Blocks.DARK_OAK_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.ACACIA_PATH.get(), Blocks.ACACIA_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.SPRUCE_PATH.get(), Blocks.SPRUCE_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.BIRCH_PATH.get(), Blocks.BIRCH_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.JUNGLE_PATH.get(), Blocks.JUNGLE_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.CRIMSON_PATH.get(), Blocks.CRIMSON_PLANKS, 1 ,1);
        createSilkTouchTable(DecorBlocks.WARPED_PATH.get(), Blocks.WARPED_PLANKS, 1 ,1);

    }

    public void self(Block block) {
        block(block, createSimpleTable(block));
    }

}