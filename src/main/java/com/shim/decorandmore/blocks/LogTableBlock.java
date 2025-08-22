package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

import javax.annotation.Nullable;

public class LogTableBlock extends TableBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public LogTableBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(WATERLOGGED, Boolean.FALSE).setValue(FACING, Direction.NORTH));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_56388_) {
        p_56388_.add(WATERLOGGED, FACING);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = context.getLevel().getBlockState(blockpos);
        if (blockstate.is(this)) {
            return blockstate.setValue(WATERLOGGED, Boolean.FALSE);
        } else {
            FluidState fluidstate = context.getLevel().getFluidState(blockpos);
            //            Direction direction = context.getClickedFace();
            return this.defaultBlockState().setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER).setValue(FACING, context.getHorizontalDirection());
        }
    }

//    @Nullable
//    public BlockState getStateForPlacement(BlockPlaceContext p_56361_) {
//        BlockPos blockpos = p_56361_.getClickedPos();
//        BlockState blockstate = p_56361_.getLevel().getBlockState(blockpos);
//        if (blockstate.is(this)) {
//            return blockstate.setValue(WATERLOGGED, Boolean.FALSE);
//        } else {
//            FluidState fluidstate = p_56361_.getLevel().getFluidState(blockpos);
//            BlockState blockstate1 = this.defaultBlockState().setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
//            Direction direction = p_56361_.getClickedFace();
//            return blockstate1;
//        }
//    }
//
//    public boolean canBeReplaced(BlockState p_56373_, BlockPlaceContext p_56374_) {
//        ItemStack itemstack = p_56374_.getItemInHand();
//        if (itemstack.is(this.asItem())) {
//            if (p_56374_.replacingClickedOnBlock()) {
//                boolean flag = p_56374_.getClickLocation().y - (double)p_56374_.getClickedPos().getY() > 0.5D;
//                Direction direction = p_56374_.getClickedFace();
//                return direction == Direction.UP || flag && direction.getAxis().isHorizontal();
//            } else {
//                return true;
//            }
//        } else {
//            return false;
//        }
//    }
//
//    public FluidState getFluidState(BlockState p_56397_) {
//        return p_56397_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_56397_);
//    }
//
//    public BlockState updateShape(BlockState p_56381_, Direction p_56382_, BlockState p_56383_, LevelAccessor p_56384_, BlockPos p_56385_, BlockPos p_56386_) {
//        if (p_56381_.getValue(WATERLOGGED)) {
//            p_56384_.scheduleTick(p_56385_, Fluids.WATER, Fluids.WATER.getTickDelay(p_56384_));
//        }
//
//        return super.updateShape(p_56381_, p_56382_, p_56383_, p_56384_, p_56385_, p_56386_);
//    }
//
//    public boolean isPathfindable(BlockState p_56376_, BlockGetter p_56377_, BlockPos p_56378_, PathComputationType p_56379_) {
//        return switch (p_56379_) {
//            case LAND -> false;
//            case WATER -> p_56377_.getFluidState(p_56378_).is(FluidTags.WATER);
//            case AIR -> false;
//            default -> false;
//        };
//    }

    public BlockState rotate(BlockState p_48722_, Rotation p_48723_) {
        return p_48722_.setValue(FACING, p_48723_.rotate(p_48722_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_48719_, Mirror p_48720_) {
        return p_48719_.rotate(p_48720_.getRotation(p_48719_.getValue(FACING)));
    }

}
