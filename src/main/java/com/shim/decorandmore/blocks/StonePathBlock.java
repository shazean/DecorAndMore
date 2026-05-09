package com.shim.decorandmore.blocks;

import com.shim.decorandmore.util.PathBlockUtil;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.pathfinder.Path;

public class StonePathBlock extends PathBlock {
    public StonePathBlock(Properties properties, Block originBlock) {
        super(properties, originBlock);
//        PathBlockUtil.addPickaxePath(originBlock, this);
    }
}
