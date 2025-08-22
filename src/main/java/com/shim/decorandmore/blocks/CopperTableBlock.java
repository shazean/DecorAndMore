package com.shim.decorandmore.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

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

}
