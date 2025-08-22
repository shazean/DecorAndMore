package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;

import javax.annotation.Nullable;
import java.util.Random;

public class CopperLanternBlock extends LanternBlock implements IWeatheringBlock {
    public static final BooleanProperty LIT = RedstoneTorchBlock.LIT;
    private final WeatheringCopper.WeatherState weatherState;
    private final boolean redstonePowered;

    public CopperLanternBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
        this(weatherState, false, properties);
    }

    public CopperLanternBlock(WeatheringCopper.WeatherState weatherState, Boolean redstonePowered, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
        this.redstonePowered = redstonePowered;
        this.registerDefaultState(this.stateDefinition.any().setValue(HANGING, Boolean.FALSE).setValue(WATERLOGGED, Boolean.FALSE).setValue(LIT, false));
    }

    public void randomTick(BlockState p_154929_, ServerLevel p_154930_, BlockPos p_154931_, Random p_154932_) {
        this.onRandomTick(p_154929_, p_154930_, p_154931_, p_154932_);
    }

    public boolean isRedstonePowered() {

        return redstonePowered;
    }

    public boolean isRandomlyTicking(BlockState p_154935_) {
        return IWeatheringBlock.getNext(p_154935_.getBlock()).isPresent();
    }

    @Override
    public WeatheringCopper.WeatherState getAge() {
        return weatherState;
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());

        for (Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                BlockState blockstate = this.defaultBlockState().setValue(HANGING, direction == Direction.UP).setValue(LIT, context.getLevel().hasNeighborSignal(context.getClickedPos()));
                if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                    return blockstate.setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
                }
            }
        }

        return null;
    }


    public void neighborChanged(BlockState p_55666_, Level p_55667_, BlockPos p_55668_, Block p_55669_, BlockPos p_55670_, boolean p_55671_) {
        if (!p_55667_.isClientSide) {
            boolean flag = p_55666_.getValue(LIT);
            if (flag != p_55667_.hasNeighborSignal(p_55668_)) {
                if (flag) {
                    p_55667_.scheduleTick(p_55668_, this, 4);
                } else {
                    p_55667_.setBlock(p_55668_, p_55666_.cycle(LIT), 2);
                }
            }

        }
    }

    public void tick(BlockState state, ServerLevel p_55662_, BlockPos p_55663_, Random p_55664_) {
        if (state.getBlock() instanceof CopperLanternBlock lantern && lantern.redstonePowered) {
            if (state.getValue(LIT) && !p_55662_.hasNeighborSignal(p_55663_)) {
                p_55662_.setBlock(p_55663_, state.cycle(LIT), 2);
            }
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_153490_) {
        p_153490_.add(HANGING, WATERLOGGED, LIT);
    }
}