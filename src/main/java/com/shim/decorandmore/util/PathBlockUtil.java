package com.shim.decorandmore.util;

import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.Util;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.HashMap;
import java.util.Map;

public class PathBlockUtil {

    public static Map<Block, Block> PICKAXE_PATHS = Util.make(new HashMap<>(), (map) -> {
        map.put(Blocks.COBBLESTONE, DecorBlocks.COBBLESTONE_PATH.get());
        map.put(Blocks.MOSSY_COBBLESTONE, DecorBlocks.MOSSY_COBBLESTONE_PATH.get());
        map.put(Blocks.STONE_BRICKS, DecorBlocks.STONE_BRICK_PATH.get());
        map.put(Blocks.MOSSY_STONE_BRICKS, DecorBlocks.MOSSY_STONE_BRICK_PATH.get());
        map.put(Blocks.BRICKS, DecorBlocks.BRICK_PATH.get());
        map.put(Blocks.NETHER_BRICKS, DecorBlocks.NETHER_BRICK_PATH.get());
        map.put(Blocks.DEEPSLATE_BRICKS, DecorBlocks.DEEPSLATE_BRICK_PATH.get());
        map.put(Blocks.END_STONE_BRICKS, DecorBlocks.END_STONE_BRICK_PATH.get());
    });
    public static Map<Block, Block> AXE_PATHS = Util.make(new HashMap<>(), (map) -> {
        map.put(Blocks.OAK_PLANKS, DecorBlocks.OAK_PATH.get());
        map.put(Blocks.DARK_OAK_PLANKS, DecorBlocks.DARK_OAK_PATH.get());
        map.put(Blocks.ACACIA_PLANKS, DecorBlocks.ACACIA_PATH.get());
        map.put(Blocks.SPRUCE_PLANKS, DecorBlocks.SPRUCE_PATH.get());
        map.put(Blocks.BIRCH_PLANKS, DecorBlocks.BIRCH_PATH.get());
        map.put(Blocks.JUNGLE_PLANKS, DecorBlocks.JUNGLE_PATH.get());
        map.put(Blocks.CRIMSON_PLANKS, DecorBlocks.CRIMSON_PATH.get());
        map.put(Blocks.WARPED_PLANKS, DecorBlocks.WARPED_PATH.get());
    });
    public static Map<Block, Block> SHOVEL_PATHS = new HashMap<>();

    public void addPickaxePath(Block block, Block path) {
        PICKAXE_PATHS.put(block, path);
    }
    public void addAxePath(Block block, Block path) {
        AXE_PATHS.put(block, path);
    }
    public void addShovelPath(Block block, Block path) {
        SHOVEL_PATHS.put(block, path);
    }
}