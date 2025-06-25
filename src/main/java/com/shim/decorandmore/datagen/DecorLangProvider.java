package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public class DecorLangProvider extends LanguageProvider {

    public DecorLangProvider(DataGenerator gen, String locale) {
        super(gen, DecorAndMore.MODID, locale);
    }


    @Override
    protected void addTranslations() {

        for (RegistryObject<? extends Block> block : DecorBlocks.BLOCK_LANG_EN_US.keySet())
            this.add(block.get(), DecorBlocks.BLOCK_LANG_EN_US.get(block));
//        for (RegistryObject<? extends Item> item : CelestialItems.ITEM_LANG_EN_US.keySet())
//            this.add(item.get(), CelestialItems.ITEM_LANG_EN_US.get(item));

    }
}
