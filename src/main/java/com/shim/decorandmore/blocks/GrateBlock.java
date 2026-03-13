package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GrateBlock extends HalfTransparentBlock {
    public GrateBlock(Properties properties) {
        super(properties);
    }

    public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
        return 0.6F;
    }
}
