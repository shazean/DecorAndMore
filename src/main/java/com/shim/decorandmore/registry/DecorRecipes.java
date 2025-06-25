package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.recipe.DyedRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DecorRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, DecorAndMore.MODID);

    public static final RegistryObject<RecipeSerializer<DyedRecipe>> DYED_CRAFTING_SERIALIZER = SERIALIZERS.register("dyed_crafting", () -> DyedRecipe.Serializer.INSTANCE);

}
