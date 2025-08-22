package com.shim.decorandmore.events;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.CopperLanternBlock;
import com.shim.decorandmore.util.WeatheringUtil;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.HoneycombItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
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

        if (itemStack.getItem() instanceof HoneycombItem) {
            Level level = event.getWorld();
            BlockPos pos = event.getHitVec().getBlockPos();
            BlockState state = level.getBlockState(pos);

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
            }
        }
    }
}