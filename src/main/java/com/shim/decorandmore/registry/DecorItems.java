package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DecorItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecorAndMore.MODID);

    public static final Map<RegistryObject<? extends Item>, String> ITEM_LANG_EN_US = new HashMap<>();

    public static <T extends Item> RegistryObject<T> registerItem(String nameIn, String localizationIn, Supplier<T> itemIn) {
        RegistryObject<T> item = ITEMS.register(nameIn, itemIn);
        ITEM_LANG_EN_US.put(item, localizationIn);
        return item;
    }

}
