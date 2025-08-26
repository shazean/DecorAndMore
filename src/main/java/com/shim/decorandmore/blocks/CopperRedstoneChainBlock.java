package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CopperRedstoneChainBlock extends RedstoneChainBlock implements IWeatheringBlock {
    private final WeatheringCopper.WeatherState weatherState;

    public CopperRedstoneChainBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }


    public void randomTick(BlockState p_154929_, ServerLevel p_154930_, BlockPos p_154931_, Random p_154932_) {
        this.onRandomTick(p_154929_, p_154930_, p_154931_, p_154932_);
    }

    public boolean isRandomlyTicking(BlockState p_154935_) {
        return IWeatheringBlock.getNext(p_154935_.getBlock()).isPresent();
    }

    @Override
    public WeatheringCopper.WeatherState getAge() {
        return weatherState;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if (toolAction == ToolActions.AXE_SCRAPE) {
//            WeatheringUtil.WeatherableStage weatherable = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(state);
//            if (weatherable != null && weatherable.previousStage() != null)
//                return weatherable.previousStage().defaultBlockState().setValue(AXIS, state.getValue(AXIS)).setValue(WATERLOGGED, state.getValue(WATERLOGGED));

            return IWeatheringBlock.getPrevious(state).orElse(null);
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }

}