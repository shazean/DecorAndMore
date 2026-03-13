package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class CopperTrapdoorBlock extends TrapDoorBlock implements IWeatheringBlock {
    private final WeatheringCopper.WeatherState weatherState;

    public CopperTrapdoorBlock(WeatheringCopper.WeatherState weatherState, Properties properties) {
        super(properties);
        this.weatherState = weatherState;
    }

    public float getShadeBrightness(BlockState state, BlockGetter getter, BlockPos pos) {
        return 0.6F;
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
            return IWeatheringBlock.getPrevious(state).orElse(null);
        }
        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}