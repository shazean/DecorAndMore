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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedStoneWireBlock;
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

        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.OAK_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.DARK_OAK_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.SPRUCE_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.JUNGLE_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.ACACIA_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.BIRCH_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.CRIMSON_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.WARPED_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));

        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.OAK_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.DARK_OAK_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.SPRUCE_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.JUNGLE_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.ACACIA_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.BIRCH_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.CRIMSON_STEM_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.WARPED_STEM_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));

        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_OAK_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_DARK_OAK_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_SPRUCE_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_JUNGLE_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_ACACIA_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_BIRCH_LOG_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_CRIMSON_STEM_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));
        event.enqueueWork(() -> ItemProperties.register(DecorBlocks.STRIPPED_WARPED_STEM_STOOL.get().asItem(), new ResourceLocation("color"), (stack, level, living, id) -> getDyeColor(stack)));

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.GOLD_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.GOLD_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.EXPOSED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.EXPOSED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WEATHERED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WEATHERED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.OXIDIZED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.OXIDIZED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.NETHERITE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.NETHERITE_SOUL_LANTERN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_EXPOSED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_WEATHERED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_OXIDIZED_COPPER_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.GOLD_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.EXPOSED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WEATHERED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.OXIDIZED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.NETHERITE_REDSTONE_LANTERN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.GOLD_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.GOLD_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.NETHERITE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.NETHERITE_REDSTONE_CHAIN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.EXPOSED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.EXPOSED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WEATHERED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WEATHERED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.OXIDIZED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.OXIDIZED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_EXPOSED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_EXPOSED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_WEATHERED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_WEATHERED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_OXIDIZED_COPPER_CHAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(DecorBlocks.WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN.get(), RenderType.cutout());


        RecipeBookCategories.create("decorandmore:dyed_crafting", new ItemStack(Items.RED_DYE));

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
