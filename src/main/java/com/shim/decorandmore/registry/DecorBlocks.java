package com.shim.decorandmore.registry;

import com.shim.decorandmore.DecorAndMore;
import com.shim.decorandmore.blocks.*;
import com.shim.decorandmore.items.SlabStoolItem;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
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

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn) {
        return registerBlock(nameIn, localizationIn, blockIn, CreativeModeTab.TAB_DECORATIONS, false, false);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, boolean dropSelf, boolean useBlockItemModel) {
        return registerBlock(nameIn, localizationIn, blockIn, CreativeModeTab.TAB_DECORATIONS, dropSelf, useBlockItemModel);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String nameIn, String localizationIn, Supplier<T> blockIn, CreativeModeTab tabIn, boolean dropSelf, boolean useBlockItemModel) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        DecorItems.ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tabIn)));
        BLOCK_LANG_EN_US.put(block, localizationIn);
        if (dropSelf) BLOCKS_LOOT_TABLE.add(block);
        if (useBlockItemModel) BLOCKS_ITEM_MODELS.add(block);
        return block;
    }

    private static <T extends Block> RegistryObject<T> registerSlabStool(String nameIn, String localizationIn, Supplier<T> blockIn) {
        RegistryObject<T> block = BLOCKS.register(nameIn, blockIn);
        DecorItems.ITEMS.register(block.getId().getPath(), () -> new SlabStoolItem(block.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS))); //.stacksTo(1)));
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
    private static final BlockBehaviour.Properties DIORITE = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.QUARTZ).requiresCorrectToolForDrops().strength(1.5F, 6.0F);
    private static final BlockBehaviour.Properties GRANITE = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F);
    private static final BlockBehaviour.Properties ANDESITE = BlockBehaviour.Properties.of(Material.STONE, MaterialColor.DIRT).requiresCorrectToolForDrops().strength(1.5F, 6.0F);

    private static final BlockBehaviour.Properties OXIDIZED_COPPER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_NYLIUM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER);
    private static final BlockBehaviour.Properties WEATHERED_COPPER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.WARPED_STEM).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER);
    private static final BlockBehaviour.Properties EXPOSED_COPPER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.TERRACOTTA_LIGHT_GRAY).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER);
    private static final BlockBehaviour.Properties COPPER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).requiresCorrectToolForDrops().strength(3.0F, 6.0F).sound(SoundType.COPPER);

    private static final BlockBehaviour.Properties CHAIN = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.NONE).requiresCorrectToolForDrops().strength(5.0F, 6.0F).sound(SoundType.CHAIN).noOcclusion();

    public static final RegistryObject<SlabBlock> OAK_STOOL = registerSlabStool("oak_stool", "Oak Stool", () -> new SlabStoolBlock(OAK));
    public static final RegistryObject<SlabBlock> DARK_OAK_STOOL = registerSlabStool("dark_oak_stool", "Dark Oak Stool", () -> new SlabStoolBlock(DARK_OAK));
    public static final RegistryObject<SlabBlock> JUNGLE_STOOL = registerSlabStool("jungle_stool", "Jungle Stool", () -> new SlabStoolBlock(JUNGLE));
    public static final RegistryObject<SlabBlock> SPRUCE_STOOL = registerSlabStool("spruce_stool", "Spruce Stool", () -> new SlabStoolBlock(SPRUCE));
    public static final RegistryObject<SlabBlock> ACACIA_STOOL = registerSlabStool("acacia_stool", "Acacia Stool", () -> new SlabStoolBlock(ACACIA));
    public static final RegistryObject<SlabBlock> BIRCH_STOOL = registerSlabStool("birch_stool", "Birch Stool", () -> new SlabStoolBlock(BIRCH));
    public static final RegistryObject<SlabBlock> WARPED_STOOL = registerSlabStool("warped_stool", "Warped Stool", () -> new SlabStoolBlock(WARPED));
    public static final RegistryObject<SlabBlock> CRIMSON_STOOL = registerSlabStool("crimson_stool", "Crimson Stool", () -> new SlabStoolBlock(CRIMSON));

    public static final RegistryObject<SlabBlock> OAK_LOG_STOOL = registerSlabStool("oak_log_stool", "Oak Log Stool", () -> new SlabStoolBlock(OAK));
    public static final RegistryObject<SlabBlock> DARK_OAK_LOG_STOOL = registerSlabStool("dark_oak_log_stool", "Dark Oak Log Stool", () -> new SlabStoolBlock(DARK_OAK));
    public static final RegistryObject<SlabBlock> JUNGLE_LOG_STOOL = registerSlabStool("jungle_log_stool", "Jungle Log Stool", () -> new SlabStoolBlock(JUNGLE));
    public static final RegistryObject<SlabBlock> SPRUCE_LOG_STOOL = registerSlabStool("spruce_log_stool", "Spruce Log Stool", () -> new SlabStoolBlock(SPRUCE));
    public static final RegistryObject<SlabBlock> ACACIA_LOG_STOOL = registerSlabStool("acacia_log_stool", "Acacia Log Stool", () -> new SlabStoolBlock(ACACIA));
    public static final RegistryObject<SlabBlock> BIRCH_LOG_STOOL = registerSlabStool("birch_log_stool", "Birch Log Stool", () -> new SlabStoolBlock(BIRCH));
    public static final RegistryObject<SlabBlock> WARPED_STEM_STOOL = registerSlabStool("warped_stem_stool", "Warped Stem Stool", () -> new SlabStoolBlock(WARPED));
    public static final RegistryObject<SlabBlock> CRIMSON_STEM_STOOL = registerSlabStool("crimson_stem_stool", "Crimson Stem Stool", () -> new SlabStoolBlock(CRIMSON));

    public static final RegistryObject<SlabBlock> STRIPPED_OAK_LOG_STOOL = registerSlabStool("stripped_oak_log_stool", "Stripped Oak Log Stool", () -> new SlabStoolBlock(OAK));
    public static final RegistryObject<SlabBlock> STRIPPED_DARK_OAK_LOG_STOOL = registerSlabStool("stripped_dark_oak_log_stool", "Stripped Dark Oak Log Stool", () -> new SlabStoolBlock(DARK_OAK));
    public static final RegistryObject<SlabBlock> STRIPPED_JUNGLE_LOG_STOOL = registerSlabStool("stripped_jungle_log_stool", "Stripped Jungle Log Stool", () -> new SlabStoolBlock(JUNGLE));
    public static final RegistryObject<SlabBlock> STRIPPED_SPRUCE_LOG_STOOL = registerSlabStool("stripped_spruce_log_stool", "Stripped Spruce Log Stool", () -> new SlabStoolBlock(SPRUCE));
    public static final RegistryObject<SlabBlock> STRIPPED_ACACIA_LOG_STOOL = registerSlabStool("stripped_acacia_log_stool", "Stripped Acacia Log Stool", () -> new SlabStoolBlock(ACACIA));
    public static final RegistryObject<SlabBlock> STRIPPED_BIRCH_LOG_STOOL = registerSlabStool("stripped_birch_log_stool", "Stripped Birch Log Stool", () -> new SlabStoolBlock(BIRCH));
    public static final RegistryObject<SlabBlock> STRIPPED_WARPED_STEM_STOOL = registerSlabStool("stripped_warped_stem_stool", "Stripped Warped Stem Stool", () -> new SlabStoolBlock(WARPED));
    public static final RegistryObject<SlabBlock> STRIPPED_CRIMSON_STEM_STOOL = registerSlabStool("stripped_crimson_stem_stool", "Stripped Crimson Stem Stool", () -> new SlabStoolBlock(CRIMSON));

    public static final RegistryObject<StairBlock> OAK_BENCH = registerBlock("oak_bench", "Oak Bench", () -> new StairBlock(Blocks.OAK_WOOD::defaultBlockState, OAK), true, true);
    public static final RegistryObject<StairBlock> DARK_OAK_BENCH = registerBlock("dark_oak_bench", "Dark Oak Bench", () -> new StairBlock(Blocks.DARK_OAK_WOOD::defaultBlockState, DARK_OAK), true, true);
    public static final RegistryObject<StairBlock> SPRUCE_BENCH = registerBlock("spruce_bench", "Spruce Bench", () -> new StairBlock(Blocks.SPRUCE_WOOD::defaultBlockState, SPRUCE), true, true);
    public static final RegistryObject<StairBlock> JUNGLE_BENCH = registerBlock("jungle_bench", "Jungle Bench", () -> new StairBlock(Blocks.JUNGLE_WOOD::defaultBlockState, JUNGLE), true, true);
    public static final RegistryObject<StairBlock> ACACIA_BENCH = registerBlock("acacia_bench", "Acacia Bench", () -> new StairBlock(Blocks.ACACIA_WOOD::defaultBlockState, ACACIA), true, true);
    public static final RegistryObject<StairBlock> BIRCH_BENCH = registerBlock("birch_bench", "Birch Bench", () -> new StairBlock(Blocks.BIRCH_WOOD::defaultBlockState, BIRCH), true, true);
    public static final RegistryObject<StairBlock> WARPED_BENCH = registerBlock("warped_bench", "Warped Bench", () -> new StairBlock(Blocks.WARPED_HYPHAE::defaultBlockState, WARPED), true, true);
    public static final RegistryObject<StairBlock> CRIMSON_BENCH = registerBlock("crimson_bench", "Crimson Bench", () -> new StairBlock(Blocks.CRIMSON_HYPHAE::defaultBlockState, CRIMSON), true, true);

    public static final RegistryObject<HalfBlock> HALF_OAK_BENCH = registerBlock("half_oak_bench", "Half Oak Bench", () -> new HalfBlock(OAK), false, true);
    public static final RegistryObject<HalfBlock> HALF_DARK_OAK_BENCH = registerBlock("half_dark_oak_bench", "Half Dark Oak Bench", () -> new HalfBlock(DARK_OAK), false, true);
    public static final RegistryObject<HalfBlock> HALF_SPRUCE_BENCH = registerBlock("half_spruce_bench", "Half Spruce Bench", () -> new HalfBlock(SPRUCE), false, true);
    public static final RegistryObject<HalfBlock> HALF_JUNGLE_BENCH = registerBlock("half_jungle_bench", "Half Jungle Bench", () -> new HalfBlock(JUNGLE), false, true);
    public static final RegistryObject<HalfBlock> HALF_ACACIA_BENCH = registerBlock("half_acacia_bench", "Half Acacia Bench", () -> new HalfBlock(ACACIA), false, true);
    public static final RegistryObject<HalfBlock> HALF_BIRCH_BENCH = registerBlock("half_birch_bench", "Half Birch Bench", () -> new HalfBlock(BIRCH), false, true);
    public static final RegistryObject<HalfBlock> HALF_WARPED_BENCH = registerBlock("half_warped_bench", "Half Warped Bench", () -> new HalfBlock(WARPED), false, true);
    public static final RegistryObject<HalfBlock> HALF_CRIMSON_BENCH = registerBlock("half_crimson_bench", "Half Crimson Bench", () -> new HalfBlock(CRIMSON), false, true);

    public static final RegistryObject<LanternBlock> GOLD_LANTERN = registerBlock("gold_lantern", "Gold Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);

    public static final RegistryObject<CopperLanternBlock> COPPER_LANTERN = registerBlock("copper_lantern", "Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_LANTERN = registerBlock("exposed_copper_lantern", "Exposed Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_LANTERN = registerBlock("weathered_copper_lantern", "Weathered Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_LANTERN = registerBlock("oxidized_copper_lantern", "Oxidized Copper Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 15)), true, false);

    public static final RegistryObject<LanternBlock> WAXED_COPPER_LANTERN = registerBlock("waxed_copper_lantern", "Waxed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_LANTERN = registerBlock("waxed_exposed_copper_lantern", "Waxed Exposed Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_LANTERN = registerBlock("waxed_weathered_copper_lantern", "Waxed Weathered Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_LANTERN = registerBlock("waxed_oxidized_copper_lantern", "Waxed Oxidized Copper Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);

    public static final RegistryObject<LanternBlock> NETHERITE_LANTERN = registerBlock("netherite_lantern", "Netherite Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 15)), true, false);

    public static final RegistryObject<LanternBlock> GOLD_SOUL_LANTERN = registerBlock("gold_soul_lantern", "Gold Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);

    public static final RegistryObject<CopperLanternBlock> COPPER_SOUL_LANTERN = registerBlock("copper_soul_lantern", "Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<CopperLanternBlock> EXPOSED_COPPER_SOUL_LANTERN = registerBlock("exposed_copper_soul_lantern", "Exposed Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED, LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<CopperLanternBlock> WEATHERED_COPPER_SOUL_LANTERN = registerBlock("weathered_copper_soul_lantern", "Weathered Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED, LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<CopperLanternBlock> OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("oxidized_copper_soul_lantern", "Oxidized Copper Soul Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED, LANTERN.lightLevel((p_187433_) -> 10)), true, false);

    public static final RegistryObject<LanternBlock> WAXED_COPPER_SOUL_LANTERN = registerBlock("waxed_copper_soul_lantern", "Waxed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock("waxed_exposed_copper_soul_lantern", "Waxed Exposed Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock("waxed_weathered_copper_soul_lantern", "Waxed Weathered Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);
    public static final RegistryObject<LanternBlock> WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock("waxed_oxidized_copper_soul_lantern", "Waxed Oxidized Copper Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);

    public static final RegistryObject<LanternBlock> NETHERITE_SOUL_LANTERN = registerBlock("netherite_soul_lantern", "Netherite Soul Lantern", () -> new LanternBlock(LANTERN.lightLevel((p_187433_) -> 10)), true, false);


    public static final RegistryObject<LanternBlock> REDSTONE_LANTERN = registerBlock("redstone_lantern", "Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<LanternBlock> GOLD_REDSTONE_LANTERN = registerBlock("gold_redstone_lantern", "Gold Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);

    public static final RegistryObject<LanternBlock> COPPER_REDSTONE_LANTERN = registerBlock("copper_redstone_lantern", "Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.UNAFFECTED, true, LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<LanternBlock> EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("exposed_copper_redstone_lantern", "Exposed Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.EXPOSED,  true, LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<LanternBlock> WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("weathered_copper_redstone_lantern", "Weathered Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.WEATHERED,  true, LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<LanternBlock> OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("oxidized_copper_redstone_lantern", "Oxidized Copper Redstone Lantern", () -> new CopperLanternBlock(WeatheringCopper.WeatherState.OXIDIZED,  true, LANTERN.lightLevel(litBlockEmission(15))), true, false);

    public static final RegistryObject<RedstoneLanternBlock> WAXED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_copper_redstone_lantern", "Waxed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_EXPOSED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_exposed_copper_redstone_lantern", "Waxed Exposed Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_WEATHERED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_weathered_copper_redstone_lantern", "Waxed Weathered Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);
    public static final RegistryObject<RedstoneLanternBlock> WAXED_OXIDIZED_COPPER_REDSTONE_LANTERN = registerBlock("waxed_oxidized_copper_redstone_lantern", "Waxed Oxidized Copper Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);

    public static final RegistryObject<LanternBlock> NETHERITE_REDSTONE_LANTERN = registerBlock("netherite_redstone_lantern", "Netherite Redstone Lantern", () -> new RedstoneLanternBlock(LANTERN.lightLevel(litBlockEmission(15))), true, false);

    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS = registerBlock("oak_table_planks", "Oak Table (Planks)", () -> new TableBlock(OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_LOGS = registerBlock("oak_table_log", "Oak Table (Logs)", () -> new LogTableBlock(OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_STRIPPED_LOGS = registerBlock("oak_table_stripped_log", "Oak Table (Stripped Logs)", () -> new LogTableBlock(OAK.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS_LOGS = registerBlock("oak_table_planks_logs", "Oak Table (Planks & Logs)", () -> new TableBlock(OAK.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> OAK_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("oak_table_planks_stripped_logs", "Oak Table (Planks & Stripped Logs)", () -> new TableBlock(OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> OAK_TABLE_STRIPPED_LOGS_LOGS = registerBlock("oak_table_stripped_logs_logs", "Oak Table (Stripped Logs & Logs)", () -> new LogTableBlock(OAK.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS = registerBlock("dark_oak_table_planks", "Dark Oak Table (Planks)", () -> new TableBlock(DARK_OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_LOGS = registerBlock("dark_oak_table_log", "Dark Oak Table (Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_STRIPPED_LOGS = registerBlock("dark_oak_table_stripped_log", "Dark Oak Table (Stripped Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS_LOGS = registerBlock("dark_oak_table_planks_logs", "Dark Oak Table (Planks & Logs)", () -> new TableBlock(DARK_OAK.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DARK_OAK_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("dark_oak_table_planks_stripped_logs", "Dark Oak Table (Planks & Stripped Logs)", () -> new TableBlock(DARK_OAK.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> DARK_OAK_TABLE_STRIPPED_LOGS_LOGS = registerBlock("dark_oak_table_stripped_logs_logs", "Dark Oak Table (Stripped Logs & Logs)", () -> new LogTableBlock(DARK_OAK.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS = registerBlock("spruce_table_planks", "Spruce Table (Planks)", () -> new TableBlock(SPRUCE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_LOGS = registerBlock("spruce_table_log", "Spruce Table (Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_STRIPPED_LOGS = registerBlock("spruce_table_stripped_log", "Spruce Table (Stripped Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS_LOGS = registerBlock("spruce_table_planks_logs", "Spruce Table (Planks & Logs)", () -> new TableBlock(SPRUCE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SPRUCE_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("spruce_table_planks_stripped_logs", "Spruce Table (Planks & Stripped Logs)", () -> new TableBlock(SPRUCE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> SPRUCE_TABLE_STRIPPED_LOGS_LOGS = registerBlock("spruce_table_stripped_logs_logs", "Spruce Table (Stripped Logs & Logs)", () -> new LogTableBlock(SPRUCE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS = registerBlock("jungle_table_planks", "Jungle Table (Planks)", () -> new TableBlock(JUNGLE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_LOGS = registerBlock("jungle_table_log", "Jungle Table (Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_STRIPPED_LOGS = registerBlock("jungle_table_stripped_log", "Jungle Table (Stripped Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS_LOGS = registerBlock("jungle_table_planks_logs", "Jungle Table (Planks & Logs)", () -> new TableBlock(JUNGLE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> JUNGLE_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("jungle_table_planks_stripped_logs", "Jungle Table (Planks & Stripped Logs)", () -> new TableBlock(JUNGLE.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> JUNGLE_TABLE_STRIPPED_LOGS_LOGS = registerBlock("jungle_table_stripped_logs_logs", "Jungle Table (Stripped Logs & Logs)", () -> new LogTableBlock(JUNGLE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS = registerBlock("acacia_table_planks", "Acacia Table (Planks)", () -> new TableBlock(ACACIA.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_LOGS = registerBlock("acacia_table_log", "Acacia Table (Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_STRIPPED_LOGS = registerBlock("acacia_table_stripped_log", "Acacia Table (Stripped Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS_LOGS = registerBlock("acacia_table_planks_logs", "Acacia Table (Planks & Logs)", () -> new TableBlock(ACACIA.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> ACACIA_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("acacia_table_planks_stripped_logs", "Acacia Table (Planks & Stripped Logs)", () -> new TableBlock(ACACIA.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> ACACIA_TABLE_STRIPPED_LOGS_LOGS = registerBlock("acacia_table_stripped_logs_logs", "Acacia Table (Stripped Logs & Logs)", () -> new LogTableBlock(ACACIA.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS = registerBlock("birch_table_planks", "Birch Table (Planks)", () -> new TableBlock(BIRCH.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_LOGS = registerBlock("birch_table_log", "Birch Table (Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_STRIPPED_LOGS = registerBlock("birch_table_stripped_log", "Birch Table (Stripped Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS_LOGS = registerBlock("birch_table_planks_logs", "Birch Table (Planks & Logs)", () -> new TableBlock(BIRCH.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> BIRCH_TABLE_PLANKS_STRIPPED_LOGS = registerBlock("birch_table_planks_stripped_logs", "Birch Table (Planks & Stripped Logs)", () -> new TableBlock(BIRCH.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> BIRCH_TABLE_STRIPPED_LOGS_LOGS = registerBlock("birch_table_stripped_logs_logs", "Birch Table (Stripped Logs & Logs)", () -> new LogTableBlock(BIRCH.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS = registerBlock("warped_table_planks", "Warped Table (Planks)", () -> new TableBlock(WARPED.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STEMS = registerBlock("warped_table_stem", "Warped Table (Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STRIPPED_STEMS = registerBlock("warped_table_stripped_stem", "Warped Table (Stripped Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS_STEMS = registerBlock("warped_table_planks_stems", "Warped Table (Planks & Stems)", () -> new TableBlock(WARPED.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WARPED_TABLE_PLANKS_STRIPPED_STEMS = registerBlock("warped_table_planks_stripped_stems", "Warped Table (Planks & Stripped Stems)", () -> new TableBlock(WARPED.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> WARPED_TABLE_STRIPPED_STEMS_STEMS = registerBlock("warped_table_stripped_stems_stems", "Warped Table (Stripped Stems & Stems)", () -> new LogTableBlock(WARPED.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS = registerBlock("crimson_table_planks", "Crimson Table (Planks)", () -> new TableBlock(CRIMSON.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STEMS = registerBlock("crimson_table_stem", "Crimson Table (Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STRIPPED_STEMS = registerBlock("crimson_table_stripped_stem", "Crimson Table (Stripped Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS_STEMS = registerBlock("crimson_table_planks_stems", "Crimson Table (Planks & Stems)", () -> new TableBlock(CRIMSON.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> CRIMSON_TABLE_PLANKS_STRIPPED_STEMS = registerBlock("crimson_table_planks_stripped_stems", "Crimson Table (Planks & Stripped Stems)", () -> new TableBlock(CRIMSON.noOcclusion()), true, true);
    public static final RegistryObject<LogTableBlock> CRIMSON_TABLE_STRIPPED_STEMS_STEMS = registerBlock("crimson_table_stripped_stems_stems", "Crimson Table (Stripped Stems & Stems)", () -> new LogTableBlock(CRIMSON.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> DIORITE_TABLE = registerBlock("diorite_table", "Diorite Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DIORITE_TABLE_POLISHED = registerBlock("diorite_table_polished", "Diorite Table (Polished)", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
//    public static final RegistryObject<TableBlock> DIORITE_TABLE_TOP_POLISHED = registerBlock("diorite_table_top_polished", "Diorite Table (Top Polished)", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
//    public static final RegistryObject<TableBlock> DIORITE_TABLE_BOTTOM_POLISHED = registerBlock("diorite_table_bottom_polished", "Diorite Table (Bottom Polished)", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> GRANITE_TABLE = registerBlock("granite_table", "Granite Table", () -> new TableBlock(GRANITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> GRANITE_TABLE_POLISHED = registerBlock("granite_table_polished", "Granite Table (Polished)", () -> new TableBlock(GRANITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> ANDESITE_TABLE = registerBlock("andesite_table", "Andesite Table", () -> new TableBlock(ANDESITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> ANDESITE_TABLE_POLISHED = registerBlock("andesite_table_polished", "Andesite Table (Polished)", () -> new TableBlock(ANDESITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> STONE_BRICKS_TABLE = registerBlock("stone_bricks_table", "Stone Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SMOOTH_STONE_TABLE = registerBlock("smooth_stone_table", "Smooth Stone Table (Polished)", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> QUARTZ_BRICK_TABLE = registerBlock("quartz_brick_table", "Quartz Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SMOOTH_QUARTZ_TABLE = registerBlock("smooth_quartz_table", "Smooth Quartz Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> NETHER_BRICK_TABLE = registerBlock("nether_brick_table", "Nether Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> RED_NETHER_BRICK_TABLE = registerBlock("red_nether_brick_table", "Red Nether Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> POLISHED_BLACKSTONE_BRICKS_TABLE = registerBlock("polished_blackstone_brick_table", "Polished Blackstone Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> POLISHED_BLACKSTONE_TABLE = registerBlock("polished_blackstone_table", "Polished Blackstone Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> BRICK_TABLE = registerBlock("brick_table", "Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> PURPUR_TABLE = registerBlock("purpur_table", "Purpur Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> END_STONE_BRICKS_TABLE = registerBlock("end_stone_brick_table", "End Stone Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> CUT_COPPER_TABLE = registerBlock("cut_copper_table", "Cut Copper Table", () -> new CopperTableBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WEATHERED_CUT_COPPER_TABLE = registerBlock("weathered_cut_copper_table", "Weathered Cut Copper Table", () -> new CopperTableBlock(WeatheringCopper.WeatherState.UNAFFECTED, WEATHERED_COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> EXPOSED_CUT_COPPER_TABLE = registerBlock("exposed_cut_copper_table", "Exposed Cut Copper Table", () -> new CopperTableBlock(WeatheringCopper.WeatherState.UNAFFECTED, EXPOSED_COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> OXIDIZED_CUT_COPPER_TABLE = registerBlock("oxidized_cut_copper_table", "Oxidized Cut Copper Table", () -> new CopperTableBlock(WeatheringCopper.WeatherState.UNAFFECTED, OXIDIZED_COPPER.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> WAXED_CUT_COPPER_TABLE = registerBlock("waxed_cut_copper_table", "Waxed Cut Copper Table", () -> new TableBlock(COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WAXED_WEATHERED_CUT_COPPER_TABLE = registerBlock("waxed_weathered_cut_copper_table", "Waxed Weathered Cut Copper Table", () -> new TableBlock(WEATHERED_COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WAXED_EXPOSED_CUT_COPPER_TABLE = registerBlock("waxed_exposed_cut_copper_table", "Waxed Exposed Cut Copper Table", () -> new TableBlock(EXPOSED_COPPER.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> WAXED_OXIDIZED_CUT_COPPER_TABLE = registerBlock("waxed_oxidized_cut_copper_table", "Waxed Oxidized Cut Copper Table", () -> new TableBlock(OXIDIZED_COPPER.noOcclusion()), true, true);


    public static final RegistryObject<TableBlock> CUT_SANDSTONE_TABLE = registerBlock("cut_sandstone_table", "Cut Sandstone Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SMOOTH_SANDSTONE_TABLE = registerBlock("smooth_sandstone_table", "Smooth Sandstone Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> RED_CUT_SANDSTONE_TABLE = registerBlock("red_cut_sandstone_table", "Red Cut Sandstone Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> SMOOTH_RED_SANDSTONE_TABLE = registerBlock("smooth_red_sandstone_table", "Smooth Red Sandstone Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> POLISHED_DEEPSLATE_TABLE = registerBlock("polished_deepslate_table", "Polished Deepslate Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DEEPSLATE_BRICK_TABLE = registerBlock("deepslate_brick_table", "Deepslate Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DEEPSLATE_TILE_TABLE = registerBlock("deepslate_tile_table", "Deepslate Tile Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);

    public static final RegistryObject<TableBlock> PRISMARINE_BRICK_TABLE = registerBlock("prismarine_brick_table", "Prismarine Brick Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);
    public static final RegistryObject<TableBlock> DARK_PRISMARINE_TABLE = registerBlock("dark_prismarine_table", "Dark Prismarine Table", () -> new TableBlock(DIORITE.noOcclusion()), true, true);



    public static final RegistryObject<RedstoneLampBlock> RED_REDSTONE_LAMP = registerBlock("red_redstone_lamp", "Red Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> ORANGE_REDSTONE_LAMP = registerBlock("orange_redstone_lamp", "Orange Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> YELLOW_REDSTONE_LAMP = registerBlock("yellow_redstone_lamp", "Yellow Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> LIME_REDSTONE_LAMP = registerBlock("lime_redstone_lamp", "Lime Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> GREEN_REDSTONE_LAMP = registerBlock("green_redstone_lamp", "Green Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> CYAN_REDSTONE_LAMP = registerBlock("cyan_redstone_lamp", "Cyan Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> BLUE_REDSTONE_LAMP = registerBlock("blue_redstone_lamp", "Blue Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> LIGHT_BLUE_REDSTONE_LAMP = registerBlock("light_blue_redstone_lamp", "Light Blue Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> PURPLE_REDSTONE_LAMP = registerBlock("purple_redstone_lamp", "Purple Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> MAGENTA_REDSTONE_LAMP = registerBlock("magenta_redstone_lamp", "Magenta Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> PINK_REDSTONE_LAMP = registerBlock("pink_redstone_lamp", "Pink Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> BROWN_REDSTONE_LAMP = registerBlock("brown_redstone_lamp", "Brown Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> BLACK_REDSTONE_LAMP = registerBlock("black_redstone_lamp", "Black Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> GRAY_REDSTONE_LAMP = registerBlock("gray_redstone_lamp", "Gray Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> LIGHT_GRAY_REDSTONE_LAMP = registerBlock("light_gray_redstone_lamp", "Light Gray Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);
    public static final RegistryObject<RedstoneLampBlock> WHITE_REDSTONE_LAMP = registerBlock("white_redstone_lamp", "White Redstone Lamp", () -> new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(litBlockEmission(15)).strength(0.3F).sound(SoundType.GLASS).isValidSpawn(DecorBlocks::always)), true, true);


    public static final RegistryObject<ChainBlock> GOLD_CHAIN = registerBlock("gold_chain", "Gold Chain", () -> new ChainBlock(CHAIN), true, false);
    public static final RegistryObject<ChainBlock> COPPER_CHAIN = registerBlock("copper_chain", "Copper Chain", () -> new CopperChainBlock(WeatheringCopper.WeatherState.UNAFFECTED, CHAIN), true, false);
    public static final RegistryObject<ChainBlock> EXPOSED_COPPER_CHAIN = registerBlock("exposed_copper_chain", "Exposed Copper Chain", () -> new CopperChainBlock(WeatheringCopper.WeatherState.EXPOSED, CHAIN), true, false);
    public static final RegistryObject<ChainBlock> WEATHERED_COPPER_CHAIN = registerBlock("weathered_copper_chain", "Weathered Copper Chain", () -> new CopperChainBlock(WeatheringCopper.WeatherState.WEATHERED, CHAIN), true, false);
    public static final RegistryObject<ChainBlock> OXIDIZED_COPPER_CHAIN = registerBlock("oxidized_copper_chain", "Oxidized Copper Chain", () -> new CopperChainBlock(WeatheringCopper.WeatherState.OXIDIZED, CHAIN), true, false);

    public static final RegistryObject<ChainBlock> WAXED_COPPER_CHAIN = registerBlock("waxed_copper_chain", "Waxed Copper Chain", () -> new ChainBlock(CHAIN), true, false);
    public static final RegistryObject<ChainBlock> WAXED_EXPOSED_COPPER_CHAIN = registerBlock("waxed_exposed_copper_chain", "Waxed Exposed Copper Chain", () -> new ChainBlock(CHAIN), true, false);
    public static final RegistryObject<ChainBlock> WAXED_WEATHERED_COPPER_CHAIN = registerBlock("waxed_weathered_copper_chain", "Waxed Weathered Copper Chain", () -> new ChainBlock(CHAIN), true, false);
    public static final RegistryObject<ChainBlock> WAXED_OXIDIZED_COPPER_CHAIN = registerBlock("waxed_oxidized_copper_chain", "Waxed Oxidized Copper Chain", () -> new ChainBlock(CHAIN), true, false);

    public static final RegistryObject<ChainBlock> NETHERITE_CHAIN = registerBlock("netherite_chain", "Netherite Chain", () -> new ChainBlock(CHAIN), true, false);

    public static final RegistryObject<RedstoneChainBlock> REDSTONE_CHAIN = registerBlock("redstone_chain", "Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> GOLD_REDSTONE_CHAIN = registerBlock("gold_redstone_chain", "Gold Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> COPPER_REDSTONE_CHAIN = registerBlock("copper_redstone_chain", "Copper Redstone Chain", () -> new CopperRedstoneChainBlock(WeatheringCopper.WeatherState.UNAFFECTED, CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> EXPOSED_COPPER_REDSTONE_CHAIN = registerBlock("exposed_copper_redstone_chain", "Exposed Copper Redstone Chain", () -> new CopperRedstoneChainBlock(WeatheringCopper.WeatherState.EXPOSED, CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> WEATHERED_COPPER_REDSTONE_CHAIN = registerBlock("weathered_copper_redstone_chain", "Weathered Copper Redstone Chain", () -> new CopperRedstoneChainBlock(WeatheringCopper.WeatherState.WEATHERED, CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> OXIDIZED_COPPER_REDSTONE_CHAIN = registerBlock("oxidized_copper_redstone_chain", "Oxidized Copper Redstone Chain", () -> new CopperRedstoneChainBlock(WeatheringCopper.WeatherState.OXIDIZED, CHAIN), true, false);

    public static final RegistryObject<RedstoneChainBlock> WAXED_COPPER_REDSTONE_CHAIN = registerBlock("waxed_copper_redstone_chain", "Waxed Copper Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> WAXED_EXPOSED_COPPER_REDSTONE_CHAIN = registerBlock("waxed_exposed_copper_redstone_chain", "Waxed Exposed Copper Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> WAXED_WEATHERED_COPPER_REDSTONE_CHAIN = registerBlock("waxed_weathered_copper_redstone_chain", "Waxed Weathered Copper Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);
    public static final RegistryObject<RedstoneChainBlock> WAXED_OXIDIZED_COPPER_REDSTONE_CHAIN = registerBlock("waxed_oxidized_copper_redstone_chain", "Waxed Oxidized Copper Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);

    public static final RegistryObject<RedstoneChainBlock> NETHERITE_REDSTONE_CHAIN = registerBlock("netherite_redstone_chain", "Netherite Redstone Chain", () -> new RedstoneChainBlock(CHAIN), true, false);



    public static final RegistryObject<RugBlock> RED_RUG = registerBlock("red_rug", "Red Rug", () -> new RugBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> ORANGE_RUG = registerBlock("orange_rug", "Orange Rug", () -> new RugBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> YELLOW_RUG = registerBlock("yellow_rug", "Yellow Rug", () -> new RugBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> LIME_RUG = registerBlock("lime_rug", "Lime Rug", () -> new RugBlock(DyeColor.LIME, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> GREEN_RUG = registerBlock("green_rug", "Green Rug", () -> new RugBlock(DyeColor.GREEN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> CYAN_RUG = registerBlock("cyan_rug", "Cyan Rug", () -> new RugBlock(DyeColor.CYAN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> BLUE_RUG = registerBlock("blue_rug", "Blue Rug", () -> new RugBlock(DyeColor.BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> LIGHT_BLUE_RUG = registerBlock("light_blue_rug", "Light Blue Rug", () -> new RugBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> PURPLE_RUG = registerBlock("purple_rug", "Purple Rug", () -> new RugBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> MAGENTA_RUG = registerBlock("magenta_rug", "Magenta Rug", () -> new RugBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> PINK_RUG = registerBlock("pink_rug", "Pink Rug", () -> new RugBlock(DyeColor.PINK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> BROWN_RUG = registerBlock("brown_rug", "Brown Rug", () -> new RugBlock(DyeColor.BROWN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> BLACK_RUG = registerBlock("black_rug", "Black Rug", () -> new RugBlock(DyeColor.BLACK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> GRAY_RUG = registerBlock("gray_rug", "Gray Rug", () -> new RugBlock(DyeColor.GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> LIGHT_GRAY_RUG = registerBlock("light_gray_rug", "Light Gray Rug", () -> new RugBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);
    public static final RegistryObject<RugBlock> WHITE_RUG = registerBlock("white_rug", "White Rug", () -> new RugBlock(DyeColor.WHITE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL)), true, true);

    public static final RegistryObject<RugBlock> RED_CARPET_EDGE = registerBlock("red_carpet_edge", "Red Carpet Edge", () -> new RugBlock(DyeColor.RED, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> ORANGE_CARPET_EDGE = registerBlock("orange_carpet_edge", "Orange Carpet Edge", () -> new RugBlock(DyeColor.ORANGE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> YELLOW_CARPET_EDGE = registerBlock("yellow_carpet_edge", "Yellow Carpet Edge", () -> new RugBlock(DyeColor.YELLOW, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> LIME_CARPET_EDGE = registerBlock("lime_carpet_edge", "Lime Carpet Edge", () -> new RugBlock(DyeColor.LIME, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> GREEN_CARPET_EDGE = registerBlock("green_carpet_edge", "Green Carpet Edge", () -> new RugBlock(DyeColor.GREEN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> CYAN_CARPET_EDGE = registerBlock("cyan_carpet_edge", "Cyan Carpet Edge", () -> new RugBlock(DyeColor.CYAN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> BLUE_CARPET_EDGE = registerBlock("blue_carpet_edge", "Blue Carpet Edge", () -> new RugBlock(DyeColor.BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> LIGHT_BLUE_CARPET_EDGE = registerBlock("light_blue_carpet_edge", "Light Blue Carpet Edge", () -> new RugBlock(DyeColor.LIGHT_BLUE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> PURPLE_CARPET_EDGE = registerBlock("purple_carpet_edge", "Purple Carpet Edge", () -> new RugBlock(DyeColor.PURPLE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> MAGENTA_CARPET_EDGE = registerBlock("magenta_carpet_edge", "Magenta Carpet Edge", () -> new RugBlock(DyeColor.MAGENTA, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> PINK_CARPET_EDGE = registerBlock("pink_carpet_edge", "Pink Carpet Edge", () -> new RugBlock(DyeColor.PINK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> BROWN_CARPET_EDGE = registerBlock("brown_carpet_edge", "Brown Carpet Edge", () -> new RugBlock(DyeColor.BROWN, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> BLACK_CARPET_EDGE = registerBlock("black_carpet_edge", "Black Carpet Edge", () -> new RugBlock(DyeColor.BLACK, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> GRAY_CARPET_EDGE = registerBlock("gray_carpet_edge", "Gray Carpet Edge", () -> new RugBlock(DyeColor.GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> LIGHT_GRAY_CARPET_EDGE = registerBlock("light_gray_carpet_edge", "Light Gray Carpet Edge", () -> new RugBlock(DyeColor.LIGHT_GRAY, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);
    public static final RegistryObject<RugBlock> WHITE_CARPET_EDGE = registerBlock("white_carpet_edge", "White Carpet Edge", () -> new RugBlock(DyeColor.WHITE, BlockBehaviour.Properties.of(Material.CLOTH_DECORATION).strength(0.1F).sound(SoundType.WOOL).noOcclusion()), true, false);


    public static final RegistryObject<PathBlock> COBBLESTONE_PATH = registerBlock("cobblestone_path", "Cobblestone Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.COBBLESTONE), false, true);
    public static final RegistryObject<PathBlock> MOSSY_COBBLESTONE_PATH = registerBlock("mossy_cobblestone_path", "Mossy Cobblestone Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.MOSSY_COBBLESTONE), false, true);
    public static final RegistryObject<PathBlock> STONE_BRICK_PATH = registerBlock("stone_brick_path", "Stone Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.STONE_BRICKS), false, true);
    public static final RegistryObject<PathBlock> BRICK_PATH = registerBlock("brick_path", "Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.BRICKS), false, true);
    public static final RegistryObject<PathBlock> DEEPSLATE_BRICK_PATH = registerBlock("deepslate_brick_path", "Deepslate Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.DEEPSLATE_BRICKS), false, true);
    public static final RegistryObject<PathBlock> NETHER_BRICK_PATH = registerBlock("nether_brick_path", "Nether Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.NETHER_BRICKS), false, true);
    public static final RegistryObject<PathBlock> END_STONE_BRICK_PATH = registerBlock("end_stone_brick_path", "End Stone Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.END_STONE_BRICKS), false, true);
    public static final RegistryObject<PathBlock> MOSSY_STONE_BRICK_PATH = registerBlock("mossy_stone_brick_path", "Mossy Stone Brick Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.MOSSY_STONE_BRICKS), false, true);
    public static final RegistryObject<PathBlock> OAK_PATH = registerBlock("oak_path", "Oak Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.STONE).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.OAK_PLANKS), false, true);
    public static final RegistryObject<PathBlock> DARK_OAK_PATH = registerBlock("dark_oak_path", "Dark Oak Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.DARK_OAK_PLANKS), false, true);
    public static final RegistryObject<PathBlock> SPRUCE_PATH = registerBlock("spruce_path", "Spruce Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.SPRUCE_PLANKS), false, true);
    public static final RegistryObject<PathBlock> BIRCH_PATH = registerBlock("birch_path", "Birch Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.BIRCH_PLANKS), false, true);
    public static final RegistryObject<PathBlock> ACACIA_PATH = registerBlock("acacia_path", "Acacia Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.ACACIA_PLANKS), false, true);
    public static final RegistryObject<PathBlock> JUNGLE_PATH = registerBlock("jungle_path", "Jungle Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.JUNGLE_PLANKS), false, true);
    public static final RegistryObject<PathBlock> CRIMSON_PATH = registerBlock("crimson_path", "Crimson Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.CRIMSON_PLANKS), false, true);
    public static final RegistryObject<PathBlock> WARPED_PATH = registerBlock("warped_path", "Warped Plank Path", () -> new PathBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(0.65F).sound(SoundType.STONE).isViewBlocking(DecorBlocks::always).isSuffocating(DecorBlocks::always), Blocks.WARPED_PLANKS), false, true);

    public static final RegistryObject<Block> BUTCHER_BLOCK = registerBlock("butcher_block", "Butcher Block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), true, true);
//    public static final RegistryObject<Block> BUTCHER_BLOCK = registerBlock("butcher_block", "Butcher Block", () -> new StairBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), true, true);
//    public static final RegistryObject<Block> BUTCHER_BLOCK = registerBlock("butcher_block", "Butcher Block", () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), true, true);

    public static final RegistryObject<Block> IRON_GRATE = registerBlock("iron_grate", "Iron Grate", () -> new GrateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> GOLD_GRATE = registerBlock("gold_grate", "Gold Grate", () -> new GrateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> NETHERITE_GRATE = registerBlock("netherite_grate", "Netherite Grate", () -> new GrateBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);

    public static final RegistryObject<Block> COPPER_GRATE = registerBlock("copper_grate", "Copper Grate", () -> new CopperGrateBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> EXPOSED_COPPER_GRATE = registerBlock("exposed_copper_grate", "Exposed Copper Grate", () -> new CopperGrateBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> WEATHERED_COPPER_GRATE = registerBlock("weathered_copper_grate", "Weathered Copper Grate", () -> new CopperGrateBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> OXIDIZED_COPPER_GRATE = registerBlock("oxidized_copper_grate", "Oxidized Copper Grate", () -> new CopperGrateBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);

    public static final RegistryObject<Block> WAXED_COPPER_GRATE = registerBlock("waxed_copper_grate", "Waxed Copper Grate", () -> new GrateBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> WAXED_EXPOSED_COPPER_GRATE = registerBlock("waxed_exposed_copper_grate", "Waxed Exposed Copper Grate", () -> new GrateBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> WAXED_WEATHERED_COPPER_GRATE = registerBlock("waxed_weathered_copper_grate", "Waxed Weathered Copper Grate", () -> new GrateBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);
    public static final RegistryObject<Block> WAXED_OXIDIZED_COPPER_GRATE = registerBlock("waxed_oxidized_copper_grate", "Waxed Oxidized Copper Grate", () -> new GrateBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, true);

    public static final RegistryObject<TrapDoorBlock> IRON_GRATE_TRAPDOOR = registerBlock("iron_grate_trapdoor", "Iron Grate Trapdoor", () -> new GrateTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> GOLD_GRATE_TRAPDOOR = registerBlock("gold_grate_trapdoor", "Gold Grate Trapdoor", () -> new GrateTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> NETHERITE_GRATE_TRAPDOOR = registerBlock("netherite_grate_trapdoor", "Netherite Grate Trapdoor", () -> new GrateTrapDoorBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F).sound(SoundType.METAL).isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);

    public static final RegistryObject<TrapDoorBlock> COPPER_GRATE_TRAPDOOR = registerBlock("copper_grate_trapdoor", "Copper Grate Trapdoor", () -> new CopperTrapdoorBlock(WeatheringCopper.WeatherState.UNAFFECTED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("exposed_copper_grate_trapdoor", "Exposed Copper Grate Trapdoor", () -> new CopperTrapdoorBlock(WeatheringCopper.WeatherState.EXPOSED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("weathered_copper_grate_trapdoor", "Weathered Copper Grate Trapdoor", () -> new CopperTrapdoorBlock(WeatheringCopper.WeatherState.WEATHERED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("oxidized_copper_grate_trapdoor", "Oxidized Copper Grate Trapdoor", () -> new CopperTrapdoorBlock(WeatheringCopper.WeatherState.OXIDIZED, COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);

    public static final RegistryObject<TrapDoorBlock> WAXED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_copper_grate_trapdoor", "Waxed Copper Grate Trapdoor", () -> new GrateTrapDoorBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> WAXED_EXPOSED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_exposed_copper_grate_trapdoor", "Waxed Exposed Copper Grate Trapdoor", () -> new GrateTrapDoorBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> WAXED_WEATHERED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_weathered_copper_grate_trapdoor", "Waxed Weathered Copper Grate Trapdoor", () -> new GrateTrapDoorBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);
    public static final RegistryObject<TrapDoorBlock> WAXED_OXIDIZED_COPPER_GRATE_TRAPDOOR = registerBlock("waxed_oxidized_copper_grate_trapdoor", "Waxed Oxidized Copper Grate Trapdoor", () -> new GrateTrapDoorBlock(COPPER.isViewBlocking(DecorBlocks::never).isSuffocating(DecorBlocks::never).isValidSpawn(DecorBlocks::never).noOcclusion()), true, false);


    public static final RegistryObject<FenceBlock> OAK_LOG_FENCE = registerBlock("oak_log_fence", "Oak Log Fence", () -> new FenceBlock(OAK.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> DARK_OAK_LOG_FENCE = registerBlock("dark_oak_log_fence", "Dark Oak Log Fence", () -> new FenceBlock(DARK_OAK.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> JUNGLE_LOG_FENCE = registerBlock("jungle_log_fence", "Jungle Log Fence", () -> new FenceBlock(JUNGLE.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> SPRUCE_LOG_FENCE = registerBlock("spruce_log_fence", "Spruce Log Fence", () -> new FenceBlock(SPRUCE.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> ACACIA_LOG_FENCE = registerBlock("acacia_log_fence", "Acacia Log Fence", () -> new FenceBlock(ACACIA.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> BIRCH_LOG_FENCE = registerBlock("birch_log_fence", "Birch Log Fence", () -> new FenceBlock(BIRCH.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> WARPED_STEM_FENCE = registerBlock("warped_stem_fence", "Warped Stem Fence", () -> new FenceBlock(WARPED.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> CRIMSON_STEM_FENCE = registerBlock("crimson_stem_fence", "Crimson Stem Fence", () -> new FenceBlock(CRIMSON.strength(2.0F, 3.0F)), true, false);

    public static final RegistryObject<FenceGateBlock> OAK_LOG_FENCE_GATE = registerBlock("oak_log_fence_gate", "Oak Log Fence Gate", () -> new FenceGateBlock(OAK.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> DARK_OAK_LOG_FENCE_GATE = registerBlock("dark_oak_log_fence_gate", "Dark Oak Log Fence Gate", () -> new FenceGateBlock(DARK_OAK.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> JUNGLE_LOG_FENCE_GATE = registerBlock("jungle_log_fence_gate", "Jungle Log Fence Gate", () -> new FenceGateBlock(JUNGLE.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> SPRUCE_LOG_FENCE_GATE = registerBlock("spruce_log_fence_gate", "Spruce Log Fence Gate", () -> new FenceGateBlock(SPRUCE.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> ACACIA_LOG_FENCE_GATE = registerBlock("acacia_log_fence_gate", "Acacia Log Fence Gate", () -> new FenceGateBlock(ACACIA.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> BIRCH_LOG_FENCE_GATE = registerBlock("birch_log_fence_gate", "Birch Log Fence Gate", () -> new FenceGateBlock(BIRCH.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> WARPED_STEM_FENCE_GATE = registerBlock("warped_stem_fence_gate", "Warped Stem Fence Gate", () -> new FenceGateBlock(WARPED.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> CRIMSON_STEM_FENCE_GATE = registerBlock("crimson_stem_fence_gate", "Crimson Stem Fence Gate", () -> new FenceGateBlock(CRIMSON.strength(2.0F, 3.0F)), true, true);

    public static final RegistryObject<FenceBlock> STRIPPED_OAK_LOG_FENCE = registerBlock("stripped_oak_log_fence", "Stripped Oak Log Fence", () -> new FenceBlock(OAK.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_DARK_OAK_LOG_FENCE = registerBlock("stripped_dark_oak_log_fence", "Stripped Dark Oak Log Fence", () -> new FenceBlock(DARK_OAK.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_JUNGLE_LOG_FENCE = registerBlock("stripped_jungle_log_fence", "Stripped Jungle Log Fence", () -> new FenceBlock(JUNGLE.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_SPRUCE_LOG_FENCE = registerBlock("stripped_spruce_log_fence", "Stripped Spruce Log Fence", () -> new FenceBlock(SPRUCE.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_ACACIA_LOG_FENCE = registerBlock("stripped_acacia_log_fence", "Stripped Acacia Log Fence", () -> new FenceBlock(ACACIA.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_BIRCH_LOG_FENCE = registerBlock("stripped_birch_log_fence", "Stripped Birch Log Fence", () -> new FenceBlock(BIRCH.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_WARPED_STEM_FENCE = registerBlock("stripped_warped_stem_fence", "Stripped Warped Stem Fence", () -> new FenceBlock(WARPED.strength(2.0F, 3.0F)), true, false);
    public static final RegistryObject<FenceBlock> STRIPPED_CRIMSON_STEM_FENCE = registerBlock("stripped_crimson_stem_fence", "Stripped Crimson Stem Fence", () -> new FenceBlock(CRIMSON.strength(2.0F, 3.0F)), true, false);

    public static final RegistryObject<FenceGateBlock> STRIPPED_OAK_LOG_FENCE_GATE = registerBlock("stripped_oak_log_fence_gate", "Stripped Oak Log Fence Gate", () -> new FenceGateBlock(OAK.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_DARK_OAK_LOG_FENCE_GATE = registerBlock("stripped_dark_oak_log_fence_gate", "Stripped Dark Oak Log Fence Gate", () -> new FenceGateBlock(DARK_OAK.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_JUNGLE_LOG_FENCE_GATE = registerBlock("stripped_jungle_log_fence_gate", "Stripped Jungle Log Fence Gate", () -> new FenceGateBlock(JUNGLE.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_SPRUCE_LOG_FENCE_GATE = registerBlock("stripped_spruce_log_fence_gate", "Stripped Spruce Log Fence Gate", () -> new FenceGateBlock(SPRUCE.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_ACACIA_LOG_FENCE_GATE = registerBlock("stripped_acacia_log_fence_gate", "Stripped Acacia Log Fence Gate", () -> new FenceGateBlock(ACACIA.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_BIRCH_LOG_FENCE_GATE = registerBlock("stripped_birch_log_fence_gate", "Stripped Birch Log Fence Gate", () -> new FenceGateBlock(BIRCH.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_WARPED_STEM_FENCE_GATE = registerBlock("stripped_warped_stem_fence_gate", "Stripped Warped Stem Fence Gate", () -> new FenceGateBlock(WARPED.strength(2.0F, 3.0F)), true, true);
    public static final RegistryObject<FenceGateBlock> STRIPPED_CRIMSON_STEM_FENCE_GATE = registerBlock("stripped_crimson_stem_fence_gate", "Stripped Crimson Stem Fence Gate", () -> new FenceGateBlock(CRIMSON.strength(2.0F, 3.0F)), true, true);



    private static boolean always(BlockState state, BlockGetter getter, BlockPos pos) {
        return true;
    }

    private static boolean never(BlockState state, BlockGetter getter, BlockPos pos) {
        return false;
    }

    private static Boolean always(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entity) {
        return true;
    }

    private static Boolean never(BlockState state, BlockGetter getter, BlockPos pos, EntityType<?> entity) {
        return false;
    }

    private static ToIntFunction<BlockState> litBlockEmission(int lightValue) {
        return (p_50763_) -> p_50763_.getValue(BlockStateProperties.LIT) ? lightValue : 0;
    }
}