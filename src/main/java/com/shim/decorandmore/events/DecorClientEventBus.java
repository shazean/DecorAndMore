package com.shim.decorandmore.events;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.RedstoneChainBlock;
import com.shim.decorandmore.registry.DecorBlocks;
import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.Tag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = DecorAndMore.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DecorClientEventBus {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

        event.enqueueWork(() -> {
            registerColor(DecorBlocks.OAK_STOOL.get());
            registerColor(DecorBlocks.DARK_OAK_STOOL.get());
            registerColor(DecorBlocks.SPRUCE_STOOL.get());
            registerColor(DecorBlocks.JUNGLE_STOOL.get());
            registerColor(DecorBlocks.ACACIA_STOOL.get());
            registerColor(DecorBlocks.BIRCH_STOOL.get());
            registerColor(DecorBlocks.CRIMSON_STOOL.get());
            registerColor(DecorBlocks.WARPED_STOOL.get());

            registerColor(DecorBlocks.OAK_LOG_STOOL.get());
            registerColor(DecorBlocks.DARK_OAK_LOG_STOOL.get());
            registerColor(DecorBlocks.SPRUCE_LOG_STOOL.get());
            registerColor(DecorBlocks.JUNGLE_LOG_STOOL.get());
            registerColor(DecorBlocks.ACACIA_LOG_STOOL.get());
            registerColor(DecorBlocks.BIRCH_LOG_STOOL.get());
            registerColor(DecorBlocks.CRIMSON_STEM_STOOL.get());
            registerColor(DecorBlocks.WARPED_STEM_STOOL.get());

            registerColor(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get());
            registerColor(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get());

        });


        renderCutout(DecorBlocks.GOLD_LANTERN.get());
        renderCutout(DecorBlocks.GOLD_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.COPPER_LANTERN.get());
        renderCutout(DecorBlocks.COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.NETHERITE_LANTERN.get());
        renderCutout(DecorBlocks.NETHERITE_SOUL_LANTERN.get());

        renderCutout(DecorBlocks.WAXED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get());

        renderCutout(DecorBlocks.REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.GOLD_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get());
        renderCutout(DecorBlocks.NETHERITE_REDSTONE_LANTERN.get());

        renderCutout(DecorBlocks.REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.GOLD_CHAIN.get());
        renderCutout(DecorBlocks.GOLD_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.NETHERITE_CHAIN.get());
        renderCutout(DecorBlocks.NETHERITE_REDSTONE_CHAIN.get());

        renderCutout(DecorBlocks.COPPER_CHAIN.get());
        renderCutout(DecorBlocks.COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get());

        renderCutout(DecorBlocks.WAXED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get());

        renderCutout(DecorBlocks.RED_CARPET_EDGE.get());
        renderCutout(DecorBlocks.ORANGE_CARPET_EDGE.get());
        renderCutout(DecorBlocks.YELLOW_CARPET_EDGE.get());
        renderCutout(DecorBlocks.LIME_CARPET_EDGE.get());
        renderCutout(DecorBlocks.GREEN_CARPET_EDGE.get());
        renderCutout(DecorBlocks.CYAN_CARPET_EDGE.get());
        renderCutout(DecorBlocks.BLUE_CARPET_EDGE.get());
        renderCutout(DecorBlocks.LIGHT_BLUE_CARPET_EDGE.get());
        renderCutout(DecorBlocks.PURPLE_CARPET_EDGE.get());
        renderCutout(DecorBlocks.MAGENTA_CARPET_EDGE.get());
        renderCutout(DecorBlocks.PINK_CARPET_EDGE.get());
        renderCutout(DecorBlocks.BROWN_CARPET_EDGE.get());
        renderCutout(DecorBlocks.BLACK_CARPET_EDGE.get());
        renderCutout(DecorBlocks.GRAY_CARPET_EDGE.get());
        renderCutout(DecorBlocks.LIGHT_GRAY_CARPET_EDGE.get());
        renderCutout(DecorBlocks.WHITE_CARPET_EDGE.get());

        renderCutout(DecorBlocks.IRON_GRATE.get());
        renderCutout(DecorBlocks.GOLD_GRATE.get());
        renderCutout(DecorBlocks.NETHERITE_GRATE.get());

        renderCutout(DecorBlocks.COPPER_GRATE.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_GRATE.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_GRATE.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_GRATE.get());

        renderCutout(DecorBlocks.WAXED_COPPER_GRATE.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE.get());

        renderCutout(DecorBlocks.IRON_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.GOLD_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.NETHERITE_GRATE_TRAPDOOR.get());

        renderCutout(DecorBlocks.COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.EXPOSED_COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.WEATHERED_COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.OXIDIZED_COPPER_GRATE_TRAPDOOR.get());

        renderCutout(DecorBlocks.WAXED_COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR.get());
        renderCutout(DecorBlocks.WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR.get());


        RecipeBookCategories.create("decorandmore:dyed_crafting", new ItemStack(Items.RED_DYE));

    }

    public static void registerColor(Block block) {
        ItemProperties.register(block.asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack));
    }

    public static void renderCutout(Block block) {
        ItemBlockRenderTypes.setRenderLayer(block, RenderType.cutout());
    }


    public static float getDyeColor(ItemStack stack) {
        CompoundTag nbt = stack.getOrCreateTag().getCompound("BlockStateTag");

        try {
            Tag tag = nbt.get("dye_color");
            if (tag != null) return (float) Integer.parseInt(tag.getAsString());
        } catch (NumberFormatException ignored) {}
        return 0.0F;
    }

    @SubscribeEvent
    public static void registerBlockColors(ColorHandlerEvent.Block event) {

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.GOLD_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.NETHERITE_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get());

        event.getBlockColors().register((state, world, pos, tintIndex) ->
                        RedstoneChainBlock.getColorForPower(state.getValue(RedstoneChainBlock.POWER)),
                DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get());


    }
}
