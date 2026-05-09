package com.shim.decorandmore.blocks;

import com.shim.decorandmore.util.PathBlockUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class PathBlock extends DirtPathBlock {
    final Block originBlock;

    public PathBlock(Properties properties, Block originBlock) {
        super(properties);
        this.originBlock = originBlock;
    }


    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, Random random) {
        this.convert(state, level, pos);
    }


    public void convert(BlockState state, Level level, BlockPos pos) {
        level.setBlockAndUpdate(pos, pushEntitiesUp(state, this.originBlock.defaultBlockState(), level, pos));
    }
}
