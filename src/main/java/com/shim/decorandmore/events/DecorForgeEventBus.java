package com.shim.decorandmore.events;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.CopperChainBlock;
import com.shim.decorandmore.blocks.CopperLanternBlock;
import com.shim.decorandmore.blocks.IWeatheringBlock;
import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecorAndMore.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DecorForgeEventBus {

    @SubscribeEvent
    public static void clickEvent(PlayerInteractEvent.RightClickBlock event) {
        Player player = event.getPlayer();
        ItemStack itemStack = event.getItemStack();
        Level level = event.getWorld();
        BlockPos pos = event.getHitVec().getBlockPos();
        BlockState state = level.getBlockState(pos);

        if (itemStack.getItem() instanceof HoneycombItem) {

            if (state.getBlock() instanceof CopperLanternBlock lanternBlock) {
                WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(lanternBlock);
                if (stage != null) {
                    BlockState waxedState = stage.waxedCounterpart().defaultBlockState();

                    if (lanternBlock.isRedstonePowered())
                        waxedState = waxedState.setValue(CopperLanternBlock.LIT, state.getValue(CopperLanternBlock.LIT));
                    level.setBlock(pos, waxedState, 1);
                    if (player instanceof ServerPlayer) {
                        CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemStack);
                    }
                    itemStack.shrink(1);
                    level.levelEvent(player, 3003, pos, 0);

                }
            } else if (state.getBlock() instanceof IWeatheringBlock block) {
                WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
                if (stage != null) {
                    BlockState waxedState = stage.waxedCounterpart().defaultBlockState();

                    level.setBlock(pos, waxedState, 1);
                    if (player instanceof ServerPlayer) {
                        CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemStack);
                    }
                    itemStack.shrink(1);
                    level.levelEvent(player, 3003, pos, 0);

                }
            }
        } else if (itemStack.getItem() instanceof AxeItem) {
            //de-waxing



            //de-oxidizing
//            if (state.getBlock() instanceof CopperLanternBlock lanternBlock) {
//                WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(lanternBlock);
//                if (stage != null) {
//                    Block previous = stage.previousStage();
//                    if (previous == null)
//                        return;
//
//                    BlockState previousStage = previous.defaultBlockState();
//
//                    if (lanternBlock.isRedstonePowered())
//                        previousStage = previousStage.setValue(CopperLanternBlock.LIT, state.getValue(CopperLanternBlock.LIT));
//                    level.setBlock(pos, previousStage, 1);
//                    if (player instanceof ServerPlayer) {
//                        CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemStack);
//                    }
////                    level.levelEvent(player, 3003, pos, 0);
//                    if (player != null) {
//                        itemStack.hurtAndBreak(1, player, (p_150686_) -> {
//                            p_150686_.broadcastBreakEvent(event.getHand());
//                        });
//                    }
//                }
//            } else if (state.getBlock() instanceof IWeatheringBlock block) {
//                WeatheringUtil.WeatherableStage stage = WeatheringUtil.WEATHERABLE_BLOCK_STAGES.get(block);
//                if (stage != null) {
//                    Block previous = stage.previousStage();
//                    if (previous == null)
//                        return;
//
//                    BlockState previousStage = previous.defaultBlockState();
//                    level.setBlock(pos, previousStage, 1);
//                    if (player instanceof ServerPlayer) {
//                        CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemStack);
//                    }
////                    level.levelEvent(player, 3003, pos, 0);
//                    if (player != null) {
//                        itemStack.hurtAndBreak(1, player, (p_150686_) -> {
//                            p_150686_.broadcastBreakEvent(event.getHand());
//                        });
//                    }
//
//                }
//            }
        }
    }
}