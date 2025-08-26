package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CopperTableBlock extends TableBlock implements IWeatheringBlock {
    private final WeatheringCopper.WeatherState weatherState;

    public CopperTableBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
        this.registerDefaultState(this.stateDefinition.any().setValue(WATERLOGGED, Boolean.FALSE));
    }

    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, Random rand) {
        this.onRandomTick(state, level, pos, rand);
    }

    public boolean isRandomlyTicking(BlockState state) {
        return IWeatheringBlock.getNext(state.getBlock()).isPresent();
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
