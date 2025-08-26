package com.shim.decorandmore.blocks;

import com.google.common.collect.Sets;
import com.mojang.math.Vector3f;
import com.shim.decorandmore.DecorAndMore;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.DustParticleOptions;
import net.minecraft.util.Mth;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.Vec3;

import java.util.*;

public class RedstoneChainBlock extends ChainBlock {
    public static final IntegerProperty POWER = BlockStateProperties.POWER;
//    public static final Map<Direction, EnumProperty<RedstoneSide>> PROPERTY_BY_DIRECTION = Maps.newEnumMap(ImmutableMap.of(Direction.NORTH, NORTH, Direction.EAST, EAST, Direction.SOUTH, SOUTH, Direction.WEST, WEST));
    private static final Vec3[] COLORS = Util.make(new Vec3[16], (p_154319_) -> {
        for(int i = 0; i <= 15; ++i) {
            float f = (float)i / 15.0F;
            float f1 = f * 0.6F + (f > 0.0F ? 0.4F : 0.3F);
            float f2 = Mth.clamp(f * f * 0.7F - 0.5F, 0.0F, 1.0F);
            float f3 = Mth.clamp(f * f * 0.6F - 0.7F, 0.0F, 1.0F);
            p_154319_[i] = new Vec3((double)f1, (double)f2, (double)f3);
        }

    });
    boolean shouldSignal;



    public RedstoneChainBlock(Properties p_51452_) {
        super(p_51452_);
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE).setValue(AXIS, Direction.Axis.Y).setValue(POWER, 0));

    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_51468_) {
        p_51468_.add(WATERLOGGED).add(AXIS).add(POWER);
    }


    @Override
    public void onPlace(BlockState state, Level level, BlockPos pos, BlockState p_60569_, boolean p_60570_) {

        if (!p_60569_.is(state.getBlock()) && !level.isClientSide) {
            this.updatePowerStrength(level, pos, state, false);

            for(Direction direction : Direction.values()) {
                level.updateNeighborsAt(pos.relative(direction), this);
            }

            this.updateNeighborsOfNeighboringWires(level, pos);
        }
    }

    public int getDirectSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
        return !this.shouldSignal ? 0 : state.getSignal(getter, pos, direction);
    }

    public int getSignal(BlockState state, BlockGetter getter, BlockPos pos, Direction direction) {
        if (this.shouldSignal) { // && direction != Direction.DOWN) {
            int i = state.getValue(POWER);
            if (i == 0) {
                return 0;
            } else {
                if (state.getValue(AXIS).isVertical())
                    return direction == Direction.UP || direction == Direction.DOWN ? i : 0;
                else if (state.getValue(AXIS) == Direction.Axis.X)
                    return direction == Direction.WEST || direction == Direction.EAST ? i : 0;
                else if (state.getValue(AXIS) == Direction.Axis.Z)
                    return direction == Direction.NORTH || direction == Direction.SOUTH ? i : 0;


                return 0;
            }
        } else {
            return 0;
        }
    }

    public boolean isSignalSource(BlockState p_55636_) {
        return this.shouldSignal;
    }


    public void onRemove(BlockState p_55568_, Level p_55569_, BlockPos p_55570_, BlockState p_55571_, boolean p_55572_) {
        if (!p_55572_ && !p_55568_.is(p_55571_.getBlock())) {
            super.onRemove(p_55568_, p_55569_, p_55570_, p_55571_, p_55572_);
            if (!p_55569_.isClientSide) {
                for(Direction direction : Direction.values()) {
                    p_55569_.updateNeighborsAt(p_55570_.relative(direction), this);
                }

                this.updatePowerStrength(p_55569_, p_55570_, p_55568_, true);
                this.updateNeighborsOfNeighboringWires(p_55569_, p_55570_);
            }
        }
    }

    private void updateNeighborsOfNeighboringWires(Level p_55638_, BlockPos p_55639_) {
        for(Direction direction : Direction.values()) {
            this.checkCornerChangeAt(p_55638_, p_55639_.relative(direction));
        }

        for(Direction direction1 : Direction.values()) {
            BlockPos blockpos = p_55639_.relative(direction1);
            if (p_55638_.getBlockState(blockpos).isRedstoneConductor(p_55638_, blockpos)) {
                this.checkCornerChangeAt(p_55638_, blockpos.above());
            } else {
                this.checkCornerChangeAt(p_55638_, blockpos.below());
            }
        }

    }

    private void checkCornerChangeAt(Level p_55617_, BlockPos p_55618_) {
        if (p_55617_.getBlockState(p_55618_).is(this)) {
            p_55617_.updateNeighborsAt(p_55618_, this);

            for(Direction direction : Direction.values()) {
                p_55617_.updateNeighborsAt(p_55618_.relative(direction), this);
            }

        }
    }

    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block p_55564_, BlockPos neighborPos, boolean p_55566_) {
        if (!level.isClientSide) {
            this.updatePowerStrength(level, pos, state, false);
        }
    }

    public List<Direction> getDirectionsToUpdate(BlockState state) {
        List<Direction> directions = new ArrayList<>();
        if (state.getValue(AXIS).isVertical()) {
            directions.add(Direction.UP);
            directions.add(Direction.DOWN);
        } else if (state.getValue(AXIS) == Direction.Axis.X) {
            directions.add(Direction.WEST);
            directions.add(Direction.NORTH);
        } else {
            directions.add(Direction.NORTH);
            directions.add(Direction.SOUTH);
        }
        return directions;
    }

    private void updatePowerStrength(Level level, BlockPos pos, BlockState state, boolean onRemove) {
        int i = this.calculateTargetStrength(level, pos, onRemove);
        if (state.getValue(POWER) != i) {
            if (level.getBlockState(pos) == state) {
                if (!level.isClientSide()) {
                    level.setBlock(pos, state.setValue(POWER, i), 2);
                }
            }

            Set<BlockPos> set = Sets.newHashSet();
            set.add(pos);

            if (onRemove) {
                for (Direction direction : Direction.values()) {
                    set.add(pos.relative(direction));
                }
            } else {
                for (Direction direction : getDirectionsToUpdate(state)) {
                    set.add(pos.relative(direction));
                }
            }

            for(BlockPos blockpos : set) {
                level.updateNeighborsAt(blockpos, this);
            }
        }
    }

    private int calculateTargetStrength(Level level, BlockPos pos, boolean onRemove) {
        this.shouldSignal = false;
        int i = level.getBestNeighborSignal(pos);
        this.shouldSignal = true;
        int j = 0;
        if (i < 15) {

            List<Direction> directions = (onRemove ? Arrays.stream(Direction.values()).toList() : getDirectionsToUpdate(level.getBlockState(pos)));

            for(Direction direction : directions) {
                BlockPos relativePos = pos.relative(direction);
                BlockState relativeState = level.getBlockState(relativePos);
                j = Math.max(j, this.getWireSignal(relativeState));
                BlockPos above = pos.above();
                if (relativeState.isRedstoneConductor(level, relativePos)) { // && !level.getBlockState(above).isRedstoneConductor(level, above)) {
                    j = Math.max(j, this.getWireSignal(level.getBlockState(relativePos.above())));
                } else if (!relativeState.isRedstoneConductor(level, relativePos)) {
                    j = Math.max(j, this.getWireSignal(level.getBlockState(relativePos.below())));
                }
            }
        }

        return Math.max(i, j - 1);
    }

    private int getWireSignal(BlockState state) {
        return state.is(this) ? state.getValue(POWER) : 0;
    }


    public static int getColorForPower(int p_55607_) {
        Vec3 vec3 = COLORS[p_55607_];
        return Mth.color((float)vec3.x(), (float)vec3.y(), (float)vec3.z());
    }

    private void spawnParticlesAlongLine(Level p_154310_, Random p_154311_, BlockPos p_154312_, Vec3 p_154313_, Direction p_154314_, Direction p_154315_, float p_154316_, float p_154317_) {
        float f = p_154317_ - p_154316_;
        if (!(p_154311_.nextFloat() >= 0.2F * f)) {
            float f1 = 0.4375F;
            float f2 = p_154316_ + f * p_154311_.nextFloat();
            double d0 = 0.5D + (double)(0.4375F * (float)p_154314_.getStepX()) + (double)(f2 * (float)p_154315_.getStepX());
            double d1 = 0.5D + (double)(0.4375F * (float)p_154314_.getStepY()) + (double)(f2 * (float)p_154315_.getStepY());
            double d2 = 0.5D + (double)(0.4375F * (float)p_154314_.getStepZ()) + (double)(f2 * (float)p_154315_.getStepZ());
            p_154310_.addParticle(new DustParticleOptions(new Vector3f(p_154313_), 1.0F), (double)p_154312_.getX() + d0, (double)p_154312_.getY() + d1, (double)p_154312_.getZ() + d2, 0.0D, 0.0D, 0.0D);
        }
    }

    public void animateTick(BlockState p_55574_, Level p_55575_, BlockPos p_55576_, Random p_55577_) {
        int i = p_55574_.getValue(POWER);
        if (i != 0) {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
//                RedstoneSide redstoneside = p_55574_.getValue(PROPERTY_BY_DIRECTION.get(direction));
//                switch(redstoneside) {
//                    case UP:
//                        this.spawnParticlesAlongLine(p_55575_, p_55577_, p_55576_, COLORS[i], direction, Direction.UP, -0.5F, 0.5F);
//                    case SIDE:
//                        this.spawnParticlesAlongLine(p_55575_, p_55577_, p_55576_, COLORS[i], Direction.DOWN, direction, 0.0F, 0.5F);
//                        break;
//                    case NONE:
//                    default:
                        this.spawnParticlesAlongLine(p_55575_, p_55577_, p_55576_, COLORS[i], Direction.DOWN, direction, 0.0F, 0.3F);
                }
            }

        }

}
