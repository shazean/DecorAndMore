package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.CopperLanternBlock;
import com.shim.decorandmore.blocks.HalfBlock;
import com.shim.decorandmore.blocks.RedstoneLanternBlock;
import com.shim.decorandmore.blocks.SlabStoolBlock;
import com.shim.decorandmore.items.SlabStoolItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.redstone.Redstone;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class DecorBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DecorAndMore.MODID);

    public static final Map<RegistryObject<? extends Block>, String> BLOCK_LANG_EN_US = new HashMap<>();
    public static final LinkedList<RegistryObject<? extends Block>> BLOCKS_LOOT_TABLE = new LinkedList<>();

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        DecorItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tabIn)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }

    private static <T extends Block> RegistryObject<T> registerSlabStool(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        DecorItems.ITEMS.register(block.getId().getPath(), () -> new SlabStoolItem(block.get(), new Item.Properties().tab(tabIn))); //.stacksTo(1)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        return block;
    }


    private static final BlockBehaviour.Properties OAK = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.WOOD).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties SPRUCE = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.PODZOL).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties BIRCH = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.SAND).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties JUNGLE = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.DIRT).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties ACACIA = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_GRAY).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties DARK_OAK = BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.COLOR_BROWN).strength(2.0F).sound(SoundType.WOOD);
    private static final BlockBehaviour.Properties WARPED = BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.WARPED_HYPHAE).strength(2.0F).sound(SoundType.STEM);
    private static final BlockBehaviour.Properties CRIMSON = BlockBehaviour.Properties.of(Material.NETHER_WOOD, MaterialColor.CRIMSON_HYPHAE).strength(2.0F).sound(SoundType.STEM);
    private static final BlockBehaviour.Properties LANTERN = BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(3.5F).sound(SoundType.LANTERN).noOcclusion();

    public static final RegistryObject<SlabBlock> OAK_STOOL = registerSlabStool("oak_stool", "Oak Stool", () -> new SlabStoolBlock(OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> DARK_OAK_STOOL = registerSlabStool("dark_oak_stool", "Dark Oak Stool", () -> new SlabStoolBlock(DARK_OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> JUNGLE_STOOL = registerSlabStool("jungle_stool", "Jungle Stool", () -> new SlabStoolBlock(JUNGLE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> SPRUCE_STOOL = registerSlabStool("spruce_stool", "Spruce Stool", () -> new SlabStoolBlock(SPRUCE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> ACACIA_STOOL = registerSlabStool("acacia_stool", "Acacia Stool", () -> new SlabStoolBlock(ACACIA), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> BIRCH_STOOL = registerSlabStool("birch_stool", "Birch Stool", () -> new SlabStoolBlock(BIRCH), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> WARPED_STOOL = registerSlabStool("warped_stool", "Warped Stool", () -> new SlabStoolBlock(WARPED), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> CRIMSON_STOOL = registerSlabStool("crimson_stool", "Crimson Stool", () -> new SlabStoolBlock(CRIMSON), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<SlabBlock> OAK_LOG_STOOL = registerSlabStool("oak_log_stool", "Oak Log Stool", () -> new SlabStoolBlock(OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> DARK_OAK_LOG_STOOL = registerSlabStool("dark_oak_log_stool", "Dark Oak Log Stool", () -> new SlabStoolBlock(DARK_OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> JUNGLE_LOG_STOOL = registerSlabStool("jungle_log_stool", "Jungle Log Stool", () -> new SlabStoolBlock(JUNGLE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> SPRUCE_LOG_STOOL = registerSlabStool("spruce_log_stool", "Spruce Log Stool", () -> new SlabStoolBlock(SPRUCE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> ACACIA_LOG_STOOL = registerSlabStool("acacia_log_stool", "Acacia Log Stool", () -> new SlabStoolBlock(ACACIA), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> BIRCH_LOG_STOOL = registerSlabStool("birch_log_stool", "Birch Log Stool", () -> new SlabStoolBlock(BIRCH), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> WARPED_STEM_STOOL = registerSlabStool("warped_stem_stool", "Warped Stem Stool", () -> new SlabStoolBlock(WARPED), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> CRIMSON_STEM_STOOL = registerSlabStool("crimson_stem_stool", "Crimson Stem Stool", () -> new SlabStoolBlock(CRIMSON), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<SlabBlock> STRIPPED_OAK_LOG_STOOL = registerSlabStool("stripped_oak_log_stool", "Stripped Oak Log Stool", () -> new SlabStoolBlock(OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_LOG_STOOL = registerSlabStool("stripped_dark_oak_log_stool", "Stripped Dark Oak Log Stool", () -> new SlabStoolBlock(DARK_OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_LOG_STOOL = registerSlabStool("stripped_jungle_log_stool", "Stripped Jungle Log Stool", () -> new SlabStoolBlock(JUNGLE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_LOG_STOOL = registerSlabStool("stripped_spruce_log_stool", "Stripped Spruce Log Stool", () -> new SlabStoolBlock(SPRUCE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_LOG_STOOL = registerSlabStool("stripped_acacia_log_stool", "Stripped Acacia Log Stool", () -> new SlabStoolBlock(ACACIA), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_LOG_STOOL = registerSlabStool("stripped_birch_log_stool", "Stripped Birch Log Stool", () -> new SlabStoolBlock(BIRCH), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_STEM_STOOL = registerSlabStool("stripped_warped_stem_stool", "Stripped Warped Stem Stool", () -> new SlabStoolBlock(WARPED), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_STEM_STOOL = registerSlabStool("stripped_crimson_stem_stool", "Stripped Crimson Stem Stool", () -> new SlabStoolBlock(CRIMSON), CreativeModeTab.TAB_DECORATIONS);


    public static final RegistryObject<StairBlock> OAK_BENCH = registerBlock("oak_bench", "Oak Bench", () -> new StairBlock(Blocks.OAK_WOOD::defaultBlockState, OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> DARK_OAK_BENCH = registerBlock("dark_oak_bench", "Dark Oak Bench", () -> new StairBlock(Blocks.DARK_OAK_WOOD::defaultBlockState, DARK_OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> SPRUCE_BENCH = registerBlock("spruce_bench", "Spruce Bench", () -> new StairBlock(Blocks.SPRUCE_WOOD::defaultBlockState, SPRUCE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> JUNGLE_BENCH = registerBlock("jungle_bench", "Jungle Bench", () -> new StairBlock(Blocks.JUNGLE_WOOD::defaultBlockState, JUNGLE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> ACACIA_BENCH = registerBlock("acacia_bench", "Acacia Bench", () -> new StairBlock(Blocks.ACACIA_WOOD::defaultBlockState, ACACIA), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> BIRCH_BENCH = registerBlock("birch_bench", "Birch Bench", () -> new StairBlock(Blocks.BIRCH_WOOD::defaultBlockState, BIRCH), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> WARPED_BENCH = registerBlock("warped_bench", "Warped Bench", () -> new StairBlock(Blocks.WARPED_HYPHAE::defaultBlockState, WARPED), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<StairBlock> CRIMSON_BENCH = registerBlock("crimson_bench", "Crimson Bench", () -> new StairBlock(Blocks.CRIMSON_HYPHAE::defaultBlockState, CRIMSON), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<HalfBlock> HALF_OAK_BENCH = registerBlock("half_oak_bench", "Half Oak Bench", () -> new HalfBlock(OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_DARK_OAK_BENCH = registerBlock("half_dark_oak_bench", "Half Dark Oak Bench", () -> new HalfBlock(DARK_OAK), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_SPRUCE_BENCH = registerBlock("half_spruce_bench", "Half Spruce Bench", () -> new HalfBlock(SPRUCE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_JUNGLE_BENCH = registerBlock("half_jungle_bench", "Half Jungle Bench", () -> new HalfBlock(JUNGLE), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_ACACIA_BENCH = registerBlock("half_acacia_bench", "Half Acacia Bench", () -> new HalfBlock(ACACIA), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_BIRCH_BENCH = registerBlock("half_birch_bench", "Half Birch Bench", () -> new HalfBlock(BIRCH), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_WARPED_BENCH = registerBlock("half_warped_bench", "Half Warped Bench", () -> new HalfBlock(WARPED), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<HalfBlock> HALF_CRIMSON_BENCH = registerBlock("half_crimson_bench", "Half Crimson Bench", () -> new HalfBlock(CRIMSON), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> GOLD_LANTERN = registerBlock("gold_lantern", "Gold Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", "Gold Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<CopperLanternBlock> COPPER_LANTERN = registerBlock("copper_lantern", "Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern", "Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern", "Exposed Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern", "Exposed Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern", "Weathered Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern", "Weathered Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern", "Oxidized Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern", "Oxidized Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", "Waxed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", "Waxed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", "Waxed Exposed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", "Waxed Exposed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", "Waxed Weathered Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", "Waxed Weathered Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", "Waxed Oxidized Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", "Waxed Oxidized Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> NETHERITE_LANTERN = registerBlock("netherite_lantern", "Netherite Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> NETHERITE_SOUL_LANTERN = registerBlock("netherite_soul_lantern", "Netherite Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> REDSTONE_LANTERN = registerBlock("redstone_lantern", "Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> GOLD_REDSTONE_LANTERN = registerBlock("gold_redstone_lantern", "Gold Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> COPPER_REDSTONE_LANTERN = registerBlock("copper_redstone_lantern", "Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("exposed_copper_redstone_lantern", "Exposed Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("weathered_copper_redstone_lantern", "Weathered Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<LanternBlock> OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("oxidized_copper_redstone_lantern", "Oxidized Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<RedstoneLanternBlock> WAXED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_copper_redstone_lantern", "Waxed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_exposed_copper_redstone_lantern", "Waxed Exposed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_weathered_copper_redstone_lantern", "Waxed Weathered Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_oxidized_copper_redstone_lantern", "Waxed Oxidized Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);

    public static final RegistryObject<LanternBlock> NETHERITE_REDSTONE_LANTERN = registerBlock("netherite_redstone_lantern", "Netherite Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS);


    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}