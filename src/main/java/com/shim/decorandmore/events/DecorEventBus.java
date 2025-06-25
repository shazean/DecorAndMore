package com.shim.decorandmore.events;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.recipe.DyedRecipe;
import net.minecraft.core.Registry;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecorAndMore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DecorEventBus {

//    @SubscribeEvent
//    public static void registerRecipeTypes(final RegistryEvent.Register<RecipeSerializer<?>> event) {
//        Registry.register(Registry.RECIPE_TYPE, DyedRecipe.Type.ID, DyedRecipe.Type.INSTANCE);
//    }
}