package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;

public class GrateTrapDoorBlock extends TrapDoorBlock {
    public GrateTrapDoorBlock(Properties properties) {
        super(properties);
    }

    public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
        return 0.6F;
    }
}
