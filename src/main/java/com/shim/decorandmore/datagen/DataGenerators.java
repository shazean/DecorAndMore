package com.shim.decorandmore.datagen;

import com.shim.decorandmore.DecorAndMore;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = DecorAndMore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeServer()) {
            generator.addProvider(new DecorRecipeGen(generator));
            generator.addProvider(new DecorLootTables(generator));
            DecorBlockTags blockTags = new DecorBlockTags(generator, helper);

            generator.addProvider(blockTags);
            generator.addProvider(new DecorItemTags(generator, blockTags, helper));

        }
        if (event.includeClient()) {
            generator.addProvider(new DecorBlockstates(generator, helper));
            generator.addProvider(new DecorItemModels(generator, helper));
            generator.addProvider(new DecorLangProvider(generator, "en_us"));

        }
    }

}
