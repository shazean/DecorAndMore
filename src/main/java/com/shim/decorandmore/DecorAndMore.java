package com.shim.decorandmore;

import com.mojang.logging.LogUtils;
import com.shim.decorandmore.registry.DecorBlocks;
import com.shim.decorandmore.registry.DecorItems;
import com.shim.decorandmore.registry.DecorRecipes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

@Mod(DecorAndMore.MODID)
public class DecorAndMore
{
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "decorandmore";

    public DecorAndMore() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus bus = MinecraftForge.EVENT_BUS;

        MinecraftForge.EVENT_BUS.register(this);

        DecorItems.ITEMS.register(modEventBus);
        DecorBlocks.BLOCKS.register(modEventBus);
        DecorRecipes.SERIALIZERS.register(modEventBus);

    }
}