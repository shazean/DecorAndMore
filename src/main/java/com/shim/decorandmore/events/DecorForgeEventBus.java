package com.shim.decorandmore.events;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.CopperChainBlock;
import com.shim.decorandmore.blocks.CopperLanternBlock;
import com.shim.decorandmore.blocks.IWeatheringBlock;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.registry.DecorTags;
import com.shim.decorandmore.util.PathBlockUtil;
import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecorAndMore.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DecorForgeEventBus {

    @SubscribeEvent
    public static void clickBlockEvent(PlayerInteractEvent.RightClickBlock event) {
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
        }
        else if (itemStack.getItem() instanceof AxeItem) {

            if (state.is(DecorTags.Blocks.WAXED_COPPER)) {
                Block waxOffBlock = WeatheringUtil.WAX_OFF.get(state.getBlock());
                if (waxOffBlock == null)
                    return;

                BlockState waxOff = waxOffBlock.defaultBlockState();

                if (waxOffBlock instanceof CopperLanternBlock)
                    waxOff = waxOff.setValue(CopperLanternBlock.LIT, state.getValue(CopperLanternBlock.LIT));

                level.setBlock(pos, waxOff, 1);

                if (player instanceof ServerPlayer) {
                    CriteriaTriggers.ITEM_USED_ON_BLOCK.trigger((ServerPlayer) player, pos, itemStack);
                }
                if (player != null) {
                    itemStack.hurtAndBreak(1, player, (p_150686_) -> {
                        p_150686_.broadcastBreakEvent(event.getHand());
                    });
                }
                level.playSound(player, pos, SoundEvents.AXE_WAX_OFF, SoundSource.BLOCKS, 1.0F, 1.0F);
                level.levelEvent(player, 3004, pos, 0);

                event.setCanceled(true); //otherwise the axe use is still called, and then it removes a layer of oxidization as well

            }

            if (PathBlockUtil.AXE_PATHS.containsKey(state.getBlock())) {
                level.setBlock(pos, PathBlockUtil.AXE_PATHS.get(state.getBlock()).defaultBlockState(), 1);
            }

        } else if (event.getItemStack().getItem() instanceof PickaxeItem) {

            if (PathBlockUtil.PICKAXE_PATHS.containsKey(state.getBlock())) {
                level.setBlock(pos, PathBlockUtil.PICKAXE_PATHS.get(state.getBlock()).defaultBlockState(), 1);
            }
        } else if (event.getItemStack().getItem() instanceof ShovelItem) {

            if (PathBlockUtil.SHOVEL_PATHS.containsKey(state.getBlock())) {
                level.setBlock(pos, PathBlockUtil.SHOVEL_PATHS.get(state.getBlock()).defaultBlockState(), 1);
            }
        }
    }
}