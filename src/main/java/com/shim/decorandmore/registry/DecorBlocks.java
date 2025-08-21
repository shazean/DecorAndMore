package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.*;
import com.shim.decorandmore.items.SlabStoolItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
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
    public static final LinkedList<RegistryObject<? extends Block>> BLOCKS_ITEM_MODELS = new LinkedList<>();

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn) {
        return registerBlock(nameIn, localizationIn, blockIn, tabIn, false, false);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn, boolean dropSelf, boolean useBlockItemModel) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        DecorItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tabIn)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        if (dropSelf) BLOCKS_LOOT_TABLE.add(block);
        if (useBlockItemModel) BLOCKS_ITEM_MODELS.add(block);
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

    public static final RegistryObject<StairBlock> OAK_BENCH = registerBlock("oak_bench", "Oak Bench", () -> new StairBlock(Blocks.OAK_WOOD::defaultBlockState, OAK), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> DARK_OAK_BENCH = registerBlock("dark_oak_bench", "Dark Oak Bench", () -> new StairBlock(Blocks.DARK_OAK_WOOD::defaultBlockState, DARK_OAK), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> SPRUCE_BENCH = registerBlock("spruce_bench", "Spruce Bench", () -> new StairBlock(Blocks.SPRUCE_WOOD::defaultBlockState, SPRUCE), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> JUNGLE_BENCH = registerBlock("jungle_bench", "Jungle Bench", () -> new StairBlock(Blocks.JUNGLE_WOOD::defaultBlockState, JUNGLE), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> ACACIA_BENCH = registerBlock("acacia_bench", "Acacia Bench", () -> new StairBlock(Blocks.ACACIA_WOOD::defaultBlockState, ACACIA), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> BIRCH_BENCH = registerBlock("birch_bench", "Birch Bench", () -> new StairBlock(Blocks.BIRCH_WOOD::defaultBlockState, BIRCH), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> WARPED_BENCH = registerBlock("warped_bench", "Warped Bench", () -> new StairBlock(Blocks.WARPED_HYPHAE::defaultBlockState, WARPED), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<StairBlock> CRIMSON_BENCH = registerBlock("crimson_bench", "Crimson Bench", () -> new StairBlock(Blocks.CRIMSON_HYPHAE::defaultBlockState, CRIMSON), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<HalfBlock> HALF_OAK_BENCH = registerBlock("half_oak_bench", "Half Oak Bench", () -> new HalfBlock(OAK), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_DARK_OAK_BENCH = registerBlock("half_dark_oak_bench", "Half Dark Oak Bench", () -> new HalfBlock(DARK_OAK), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_SPRUCE_BENCH = registerBlock("half_spruce_bench", "Half Spruce Bench", () -> new HalfBlock(SPRUCE), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_JUNGLE_BENCH = registerBlock("half_jungle_bench", "Half Jungle Bench", () -> new HalfBlock(JUNGLE), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_ACACIA_BENCH = registerBlock("half_acacia_bench", "Half Acacia Bench", () -> new HalfBlock(ACACIA), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_BIRCH_BENCH = registerBlock("half_birch_bench", "Half Birch Bench", () -> new HalfBlock(BIRCH), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_WARPED_BENCH = registerBlock("half_warped_bench", "Half Warped Bench", () -> new HalfBlock(WARPED), CreativeModeTab.TAB_DECORATIONS, false, true);
    public static final RegistryObject<HalfBlock> HALF_CRIMSON_BENCH = registerBlock("half_crimson_bench", "Half Crimson Bench", () -> new HalfBlock(CRIMSON), CreativeModeTab.TAB_DECORATIONS, false, true);

    public static final RegistryObject<LanternBlock> GOLD_LANTERN = registerBlock("gold_lantern", "Gold Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", "Gold Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<CopperLanternBlock> COPPER_LANTERN = registerBlock("copper_lantern", "Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern", "Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern", "Exposed Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern", "Exposed Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern", "Weathered Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern", "Weathered Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern", "Oxidized Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern", "Oxidized Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<LanternBlock> WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", "Waxed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", "Waxed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", "Waxed Exposed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", "Waxed Exposed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", "Waxed Weathered Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", "Waxed Weathered Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", "Waxed Oxidized Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", "Waxed Oxidized Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<LanternBlock> NETHERITE_LANTERN = registerBlock("netherite_lantern", "Netherite Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> NETHERITE_SOUL_LANTERN = registerBlock("netherite_soul_lantern", "Netherite Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<LanternBlock> REDSTONE_LANTERN = registerBlock("redstone_lantern", "Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> GOLD_REDSTONE_LANTERN = registerBlock("gold_redstone_lantern", "Gold Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<LanternBlock> COPPER_REDSTONE_LANTERN = registerBlock("copper_redstone_lantern", "Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("exposed_copper_redstone_lantern", "Exposed Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("weathered_copper_redstone_lantern", "Weathered Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<LanternBlock> OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("oxidized_copper_redstone_lantern", "Oxidized Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED,  true, LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<RedstoneLanternBlock> WAXED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_copper_redstone_lantern", "Waxed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_exposed_copper_redstone_lantern", "Waxed Exposed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_weathered_copper_redstone_lantern", "Waxed Weathered Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_oxidized_copper_redstone_lantern", "Waxed Oxidized Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<LanternBlock> NETHERITE_REDSTONE_LANTERN = registerBlock("netherite_redstone_lantern", "Netherite Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), CreativeModeTab.TAB_DECORATIONS, true, false);

    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS = registerBlock("oak_table_planks", "Oak Table (Planks)", () -> new TableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_LOGS = registerBlock("oak_table_log", "Oak Table (Logs)", () -> new LogTableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_STRIPPED_LOGS = registerBlock("oak_table_stripped_log", "Oak Table (Stripped Logs)", () -> new LogTableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS_LOGS = registerBlock("oak_table_planks_logs", "Oak Table (Planks & Logs)", () -> new TableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("oak_table_planks_stripped_logs", "Oak Table (Planks & Stripped Logs)", () -> new TableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_STRIPPED_LOGS_LOGS = registerBlock("oak_table_stripped_logs_logs", "Oak Table (Stripped Logs & Logs)", () -> new LogTableBlock(OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS = registerBlock("dark_oak_table_planks", "Dark Oak Table (Planks)", () -> new TableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_LOGS = registerBlock("dark_oak_table_log", "Dark Oak Table (Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_STRIPPED_LOGS = registerBlock("dark_oak_table_stripped_log", "Dark Oak Table (Stripped Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS_LOGS = registerBlock("dark_oak_table_planks_logs", "Dark Oak Table (Planks & Logs)", () -> new TableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("dark_oak_table_planks_stripped_logs", "Dark Oak Table (Planks & Stripped Logs)", () -> new TableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_STRIPPED_LOGS_LOGS = registerBlock("dark_oak_table_stripped_logs_logs", "Dark Oak Table (Stripped Logs & Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS = registerBlock("spruce_table_planks", "Spruce Table (Planks)", () -> new TableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_LOGS = registerBlock("spruce_table_log", "Spruce Table (Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_STRIPPED_LOGS = registerBlock("spruce_table_stripped_log", "Spruce Table (Stripped Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS_LOGS = registerBlock("spruce_table_planks_logs", "Spruce Table (Planks & Logs)", () -> new TableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("spruce_table_planks_stripped_logs", "Spruce Table (Planks & Stripped Logs)", () -> new TableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_STRIPPED_LOGS_LOGS = registerBlock("spruce_table_stripped_logs_logs", "Spruce Table (Stripped Logs & Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS = registerBlock("jungle_table_planks", "Jungle Table (Planks)", () -> new TableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_LOGS = registerBlock("jungle_table_log", "Jungle Table (Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_STRIPPED_LOGS = registerBlock("jungle_table_stripped_log", "Jungle Table (Stripped Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS_LOGS = registerBlock("jungle_table_planks_logs", "Jungle Table (Planks & Logs)", () -> new TableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("jungle_table_planks_stripped_logs", "Jungle Table (Planks & Stripped Logs)", () -> new TableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_STRIPPED_LOGS_LOGS = registerBlock("jungle_table_stripped_logs_logs", "Jungle Table (Stripped Logs & Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS = registerBlock("acacia_table_planks", "Acacia Table (Planks)", () -> new TableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_LOGS = registerBlock("acacia_table_log", "Acacia Table (Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_STRIPPED_LOGS = registerBlock("acacia_table_stripped_log", "Acacia Table (Stripped Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS_LOGS = registerBlock("acacia_table_planks_logs", "Acacia Table (Planks & Logs)", () -> new TableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("acacia_table_planks_stripped_logs", "Acacia Table (Planks & Stripped Logs)", () -> new TableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_STRIPPED_LOGS_LOGS = registerBlock("acacia_table_stripped_logs_logs", "Acacia Table (Stripped Logs & Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS = registerBlock("birch_table_planks", "Birch Table (Planks)", () -> new TableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_LOGS = registerBlock("birch_table_log", "Birch Table (Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_STRIPPED_LOGS = registerBlock("birch_table_stripped_log", "Birch Table (Stripped Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS_LOGS = registerBlock("birch_table_planks_logs", "Birch Table (Planks & Logs)", () -> new TableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("birch_table_planks_stripped_logs", "Birch Table (Planks & Stripped Logs)", () -> new TableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_STRIPPED_LOGS_LOGS = registerBlock("birch_table_stripped_logs_logs", "Birch Table (Stripped Logs & Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS = registerBlock("warped_table_planks", "Warped Table (Planks)", () -> new TableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STEMS = registerBlock("warped_table_stem", "Warped Table (Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STRIPPED_STEMS = registerBlock("warped_table_stripped_stem", "Warped Table (Stripped Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS_STEMS = registerBlock("warped_table_planks_stems", "Warped Table (Planks & Stems)", () -> new TableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS_STRIPPED_STEMS = registerBlock("warped_table_planks_stripped_stems", "Warped Table (Planks & Stripped Stems)", () -> new TableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STRIPPED_STEMS_STEMS = registerBlock("warped_table_stripped_stems_stems", "Warped Table (Stripped Stems & Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS = registerBlock("crimson_table_planks", "Crimson Table (Planks)", () -> new TableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STEMS = registerBlock("crimson_table_stem", "Crimson Table (Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STRIPPED_STEMS = registerBlock("crimson_table_stripped_stem", "Crimson Table (Stripped Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS_STEMS = registerBlock("crimson_table_planks_stems", "Crimson Table (Planks & Stems)", () -> new TableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS_STRIPPED_STEMS = registerBlock("crimson_table_planks_stripped_stems", "Crimson Table (Planks & Stripped Stems)", () -> new TableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STRIPPED_STEMS_STEMS = registerBlock("crimson_table_stripped_stems_stems", "Crimson Table (Stripped Stems & Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), CreativeModeTab.TAB_DECORATIONS, true, true);

    public static final RegistryObject<RedstoneLampBlock> RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", "Red Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", "Orange Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", "Yellow Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", "Lime Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", "Green Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", "Cyan Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", "Blue Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", "Light Blue Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", "Purple Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", "Magenta Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", "Pink Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp", "Brown Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", "Black Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp", "Gray Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp", "Light Gray Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);
    public static final RegistryObject<RedstoneLampBlock> WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", "White Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), CreativeModeTab.TAB_DECORATIONS, true, true);



    private static Boolean always(BlockState p_50810_, BlockGetter p_50811_, BlockPos p_50812_, EntityType<?> p_50813_) {
        return (boolean)true;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}