package net.luis.nero.init.world.biome;

import java.util.Map;

import com.google.common.collect.Maps;

import net.luis.nero.Nero;
import net.luis.nero.api.common.world.biome.IBiome;
import net.luis.nero.common.enums.BiomeEffects;
import net.luis.nero.common.world.biome.deepslate.DeepslateBiome;
import net.luis.nero.common.world.biome.deepslate.DeepslateLavaLakeBiome;
import net.luis.nero.common.world.biome.deepslate.DeepslateOceanBiome;
import net.luis.nero.common.world.biome.deepslate.cave.DeepslateDeepdarkCaveBiome;
import net.luis.nero.common.world.biome.deepslate.cave.DeepslateDripstoneCaveBiome;
import net.luis.nero.common.world.biome.deepslate.cave.DeepslateLushCaveBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.BadlandsBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.BeachBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.DesertBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.ForestBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.JungleBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.MushroomFieldsBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.OceanBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.OldGrowthBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.PeakBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.PlainsBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.RiverBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.SavannaBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.SwampBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.TempBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.WindsweptBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.cave.DeepdarkOceanBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.cave.DripstoneCaveBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.cave.LushCavesBiome;
import net.luis.nero.common.world.biome.vanilla.overworld.type.BadlandsBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.BeachBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.CaveBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.DesertBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.ForestBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.JungleBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.MushroomFieldsBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.OceanBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.OldGrowthBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.PeakBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.PlainsBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.RiverBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.SavannaBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.SwampBiomeType;
import net.luis.nero.common.world.biome.vanilla.overworld.type.WindsweptBiomeType;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {
	
	public static final DeferredRegister<Biome> BIOME_REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, Nero.MOD_ID);
	public static final Map<String, IBiome> BIOMES = Maps.newHashMap();
	
	
	public static final DeepslateBiome DEEPSLATE = register("deepslate", new DeepslateBiome(BiomeEffects.DEEPSLATE));
	public static final DeepslateOceanBiome DEEPSLATE_OCEAN = register("deepslate_ocean", new DeepslateOceanBiome(BiomeEffects.DEEPSLATE_OCEAN));
	public static final DeepslateLavaLakeBiome DEEPSLATE_LAVA_LAKE = register("deepslate_lava_lake", new DeepslateLavaLakeBiome(BiomeEffects.DEEPSLATE_LAVA_LAKE));
	public static final DeepslateDeepdarkCaveBiome DEEPSLATE_DEEPDARK = register("deepslate_deepdark", new DeepslateDeepdarkCaveBiome(BiomeEffects.DEEPSLATE_DEEPDARK));
	public static final DeepslateLushCaveBiome DEEPSLATE_LUSH_CAVES = register("deepslate_lush_caves", new DeepslateLushCaveBiome(BiomeEffects.DEEPSLATE_LUSH_CAVES));
	public static final DeepslateDripstoneCaveBiome DEEPSLATE_DRIPSTONE_CAVE = register("deepslate_dripstone_cave", new DeepslateDripstoneCaveBiome(BiomeEffects.DEEPSLATE_DRIPSTONE_CAVE));
	
	public static final TempBiome CLIMATE_ICY = register("climate_icy", new TempBiome(BiomeEffects.CLIMATE_ICY));
	public static final TempBiome CLIMATE_COLD = register("climate_cold", new TempBiome(BiomeEffects.CLIMATE_COLD));
	public static final TempBiome CLIMATE_MEDIUM = register("climate_medium", new TempBiome(BiomeEffects.CLIMATE_MEDIUM));
	public static final TempBiome CLIMATE_WARM = register("climate_warm", new TempBiome(BiomeEffects.CLIMATE_WARM));
	public static final TempBiome CLIMATE_HOT = register("climate_hot", new TempBiome(BiomeEffects.CLIMATE_HOT));
	
	public static final TempBiome CLIMATE_DRIZZLE = register("climate_drizzle", new TempBiome(BiomeEffects.CLIMATE_DRIZZLE));
	public static final TempBiome CLIMATE_LIGHT = register("climate_light", new TempBiome(BiomeEffects.CLIMATE_LIGHT));
	public static final TempBiome CLIMATE_MODERATE = register("climate_moderate", new TempBiome(BiomeEffects.CLIMATE_MODERATE));
	public static final TempBiome CLIMATE_STRONG = register("climate_strong", new TempBiome(BiomeEffects.CLIMATE_STRONG));
	public static final TempBiome CLIMATE_MONSOON = register("climate_monsoon", new TempBiome(BiomeEffects.CLIMATE_MONSOON));
	
	public static final BadlandsBiome BADLANDS = register("badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.BADLANDS));
	public static final BadlandsBiome WINDSWEPT_BADLANDS = register("windswept_badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.WINDSWEPT_BADLANDS));
	public static final BadlandsBiome ERODED_BADLANDS = register("eroded_badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.ERODED_BADLANDS));
	public static final BadlandsBiome MODIFIED_WINDSWEPT_BADLANDS = register("modified_windswept_badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.MODIFIED_WINDSWEPT_BADLANDS));
	public static final BadlandsBiome WOODED_WINDSWEPT_BADLANDS = register("wooded_windswept_badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.WOODED_WINDSWEPT_BADLANDS));
	public static final BadlandsBiome MODIFIED_WOODED_WINDSWEPT_BADLANDS = register("modified_wooded_windswept_badlands", new BadlandsBiome(BiomeEffects.BADLANDS, BadlandsBiomeType.MODIFIED_WOODED_WINDSWEPT_BADLANDS));
	
	public static final DesertBiome DESERT = register("desert", new DesertBiome(BiomeEffects.DESERT, DesertBiomeType.DESERT));
	public static final DesertBiome DESERT_HILLS = register("desert_hills", new DesertBiome(BiomeEffects.DESERT, DesertBiomeType.DESERT_HILLS));
	public static final DesertBiome DESERT_LAKES = register("desert_lakes", new DesertBiome(BiomeEffects.DESERT, DesertBiomeType.DESERT_LAKES));
	
	public static final SavannaBiome SAVANNA = register("savanna", new SavannaBiome(BiomeEffects.SAVANNA, SavannaBiomeType.SAVANNA));
	public static final SavannaBiome WINDSWEPT_SAVANNA = register("windswept_savanna", new SavannaBiome(BiomeEffects.SAVANNA, SavannaBiomeType.WINDSWEPT_SAVANNA));
	public static final SavannaBiome SHATTERED_SAVANNA = register("shattered_savanna", new SavannaBiome(BiomeEffects.SAVANNA, SavannaBiomeType.SHATTERED_SAVANNA));
	public static final SavannaBiome SHATTERED_WINDSWEPT_SAVANNA = register("shattered_windswept_savanna", new SavannaBiome(BiomeEffects.SAVANNA, SavannaBiomeType.SHATTERED_WINDSWEPT_SAVANNA));
	
	public static final JungleBiome JUNGLE = register("jungle", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.JUNGLE));
	public static final JungleBiome JUNGLE_HILLS = register("jungle_hills", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.JUNGLE_HILLS));
	public static final JungleBiome MODIFIED_JUNGLE = register("modified_jungle", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.MODIFIED_JUNGLE));
	public static final JungleBiome BAMBOO_JUNGLE = register("bamboo_jungle", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.BAMBOO_JUNGLE));
	public static final JungleBiome BAMBOO_JUNGLE_HILLS = register("bamboo_jungle_hills", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.BAMBOO_JUNGLE_HILLS));
	public static final JungleBiome SPARSE_JUNGLE = register("sparse_jungle", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.SPARSE_JUNGLE));
	public static final JungleBiome MODIFIED_SPARSE_JUNGLE = register("modified_sparse_jungle", new JungleBiome(BiomeEffects.JUNGLE, JungleBiomeType.MODIFIED_SPARSE_JUNGLE));
	
	public static final ForestBiome FOREST = register("forest", new ForestBiome(BiomeEffects.FOREST, ForestBiomeType.FOREST));
	public static final ForestBiome FLOWER_FOREST = register("flower_forest", new ForestBiome(BiomeEffects.FOREST, ForestBiomeType.FLOWER_FOREST));
	public static final ForestBiome HILLY_FOREST = register("hilly_forest", new ForestBiome(BiomeEffects.FOREST, ForestBiomeType.HILLY_FOREST));
	
	public static final ForestBiome BIRCH_FOREST = register("birch_forest", new ForestBiome(BiomeEffects.BIRCH_FOREST, ForestBiomeType.BIRCH_FOREST));
	public static final ForestBiome BIRCH_FOREST_HILLS = register("birch_forest_hills", new ForestBiome(BiomeEffects.BIRCH_FOREST, ForestBiomeType.BIRCH_FOREST_HILLS));
	public static final ForestBiome OLD_GROWTH_BIRCH_FOREST = register("old_growth_birch_forest", new ForestBiome(BiomeEffects.BIRCH_FOREST, ForestBiomeType.OLD_GROWTH_BIRCH_FOREST));
	public static final ForestBiome OLD_GROWTH_BIRCH_FOREST_HILLS = register("old_growth_birch_forest_hills", new ForestBiome(BiomeEffects.BIRCH_FOREST, ForestBiomeType.OLD_GROWTH_BIRCH_FOREST_HILLS));
	
	public static final ForestBiome DARK_FOREST = register("dark_forest", new ForestBiome(BiomeEffects.DARK_FOREST, ForestBiomeType.DARK_FOREST));
	public static final ForestBiome DARK_FOREST_HILLS = register("dark_forest_hills", new ForestBiome(BiomeEffects.DARK_FOREST, ForestBiomeType.DARK_FOREST_HILLS));
	
	public static final SwampBiome SWAMP = register("swamp", new SwampBiome(BiomeEffects.SWAMP, SwampBiomeType.SWAMP));
	public static final SwampBiome SWAMP_HILLS = register("swamp_hills", new SwampBiome(BiomeEffects.SWAMP, SwampBiomeType.SWAMP_HILLS));
	
	public static final PlainsBiome PLAINS = register("plains", new PlainsBiome(BiomeEffects.PLAINS, PlainsBiomeType.PLAINS));
	public static final PlainsBiome HILLY_PLAINS = register("hilly_plains", new PlainsBiome(BiomeEffects.PLAINS, PlainsBiomeType.HILLY_PLAINS));
	public static final PlainsBiome SUNFLOWER_PLAINS = register("sunflower_plains", new PlainsBiome(BiomeEffects.PLAINS, PlainsBiomeType.SUNFLOWER_PLAINS));
	public static final PlainsBiome SNOWY_PLAINS = register("snowy_plains", new PlainsBiome(BiomeEffects.SNOWY_PLAINS, PlainsBiomeType.SNOWY_PLAINS));
	public static final PlainsBiome SNOWY_HILLY_PLAINS = register("snowy_hilly_plains", new PlainsBiome(BiomeEffects.SNOWY_PLAINS, PlainsBiomeType.SNOWY_HILLY_PLAINS));
	public static final PlainsBiome ICE_SPIKES_PLAINS = register("ice_spikes_plains", new PlainsBiome(BiomeEffects.SNOWY_PLAINS, PlainsBiomeType.ICE_SPIKES_PLAINS));
	
	public static final OceanBiome OCEAN = register("ocean", new OceanBiome(BiomeEffects.OCEAN, OceanBiomeType.OCEAN));
	public static final OceanBiome DEEP_OCEAN = register("deep_ocean", new OceanBiome(BiomeEffects.OCEAN, OceanBiomeType.DEEP_OCEAN));
	public static final OceanBiome WARM_OCEAN = register("warm_ocean", new OceanBiome(BiomeEffects.WARM_OCEAN, OceanBiomeType.WARM_OCEAN));
	public static final OceanBiome DEEP_WARM_OCEAN = register("deep_warm_ocean", new OceanBiome(BiomeEffects.WARM_OCEAN, OceanBiomeType.DEEP_WARM_OCEAN));
	public static final OceanBiome LUKEWARM_OCEAN = register("lukewarm_ocean", new OceanBiome(BiomeEffects.LUKEWARM_OCEAN, OceanBiomeType.LUKEWARM_OCEAN));
	public static final OceanBiome DEEP_LUKEWARM_OCEAN = register("deep_lukewarm_ocean", new OceanBiome(BiomeEffects.LUKEWARM_OCEAN, OceanBiomeType.DEEP_LUKEWARM_OCEAN));
	public static final OceanBiome COLD_OCEAN = register("cold_ocean", new OceanBiome(BiomeEffects.COLD_OCEAN, OceanBiomeType.COLD_OCEAN));
	public static final OceanBiome DEEP_COLD_OCEAN = register("deep_cold_ocean", new OceanBiome(BiomeEffects.COLD_OCEAN, OceanBiomeType.DEEP_COLD_OCEAN));
	public static final OceanBiome FROZEN_OCEAN = register("frozen_ocean", new OceanBiome(BiomeEffects.FROZEN_OCEAN, OceanBiomeType.FROZEN_OCEAN));
	public static final OceanBiome DEEP_FROZEN_OCEAN = register("deep_frozen_ocean", new OceanBiome(BiomeEffects.FROZEN_OCEAN, OceanBiomeType.DEEP_FROZEN_OCEAN));
	public static final OceanBiome LEGACY_FORZEN_OCEAN = register("leagacy_frozen_ocean", new OceanBiome(BiomeEffects.FROZEN_OCEAN, OceanBiomeType.LEGACY_FORZEN_OCEAN));
	
	public static final MushroomFieldsBiome MUSHROOM_FIELDS = register("mushroom_fields", new MushroomFieldsBiome(BiomeEffects.MUSHROOM_FIELDS, MushroomFieldsBiomeType.MUSHROOM_FIELDS));
	public static final MushroomFieldsBiome MUSHROOM_FIELD_SHORE = register("mushroom_field_shore", new MushroomFieldsBiome(BiomeEffects.MUSHROOM_FIELDS, MushroomFieldsBiomeType.MUSHROOM_FIELD_SHORE));
	
	public static final WindsweptBiome WINDSWEPT_HILLS = register("windswept_hills", new WindsweptBiome(BiomeEffects.WINDSWEPT_HILLS, WindsweptBiomeType.WINDSWEPT_HILLS));
	public static final WindsweptBiome WINDSWEPT_EDGE_HILLS = register("windswept_edge_hills", new WindsweptBiome(BiomeEffects.WINDSWEPT_HILLS, WindsweptBiomeType.WINDSWEPT_EDGE_HILLS));
	public static final WindsweptBiome WINDSWEPT_GRAVELLY_HILLS = register("windswept_gravelly_hills", new WindsweptBiome(BiomeEffects.WINDSWEPT_HILLS, WindsweptBiomeType.WINDSWEPT_GRAVELLY_HILLS));
	public static final WindsweptBiome MODIFIED_WINDSWEPT_GRAVELLY_HILLS = register("modified_windswept_gravelly_hills", new WindsweptBiome(BiomeEffects.WINDSWEPT_HILLS, WindsweptBiomeType.MODIFIED_WINDSWEPT_GRAVELLY_HILLS));
	public static final WindsweptBiome WOODED_WINDSWEPT_HILLS = register("wooded_windswept_hills", new WindsweptBiome(BiomeEffects.WINDSWEPT_HILLS, WindsweptBiomeType.WOODED_WINDSWEPT_HILLS));
	public static final WindsweptBiome SNOWY_WINDSWEPT_HILLS = register("snowy_windswept_hills", new WindsweptBiome(BiomeEffects.SNOWY_WINDSWEPT_HILLS, WindsweptBiomeType.SNOWY_WINDSWEPT_HILLS));
	
	public static final PeakBiome MEADOW = register("meadow", new PeakBiome(BiomeEffects.MEADOW, PeakBiomeType.MEADOW));
	public static final PeakBiome GROVE = register("grove", new PeakBiome(BiomeEffects.GROVE, PeakBiomeType.GROVE));
	public static final PeakBiome SNOWY_GROVE = register("snowy_grove", new PeakBiome(BiomeEffects.GROVE, PeakBiomeType.SNOWY_GROVE));
	public static final PeakBiome SNOWY_SLOPES = register("snowy_slopes", new PeakBiome(BiomeEffects.SNOWY_SLOPES, PeakBiomeType.SNOWY_SLOPES));
	public static final PeakBiome JAGGED_PEAKS = register("jagged_peaks", new PeakBiome(BiomeEffects.JAGGED_PEAKS, PeakBiomeType.JAGGED_PEAKS));
	public static final PeakBiome FROZEN_PEAKS = register("frozen_peaks", new PeakBiome(BiomeEffects.FROZEN_PEAKS, PeakBiomeType.FROZEN_PEAKS));
	public static final PeakBiome STONY_PEAKS = register("stony_peaks", new PeakBiome(BiomeEffects.STONY_PEAKS, PeakBiomeType.STONY_PEAKS));
	
	public static final BeachBiome BEACH = register("beach", new BeachBiome(BiomeEffects.BEACH, BeachBiomeType.BEACH));
	public static final BeachBiome SNOWY_BEACH = register("snowy_beach", new BeachBiome(BiomeEffects.SNOWY_BEACH, BeachBiomeType.SNOWY_BEACH));
	public static final BeachBiome STONY_SHORE = register("stony_shore", new BeachBiome(BiomeEffects.STONY_SHORE, BeachBiomeType.STONY_SHORE));
	
	public static final ForestBiome TAIGA = register("taiga", new ForestBiome(BiomeEffects.TAIGA, ForestBiomeType.TAIGA));
	public static final ForestBiome TAIGA_HILLS = register("taiga_hills", new ForestBiome(BiomeEffects.TAIGA, ForestBiomeType.TAIGA_HILLS));
	public static final ForestBiome SNOWY_TAIGA = register("snowy_taiga", new ForestBiome(BiomeEffects.SNOWY_TAIGA, ForestBiomeType.SNOWY_TAIGA));
	public static final ForestBiome SNOWY_TAIGA_HILLS = register("snowy_taiga_hills", new ForestBiome(BiomeEffects.SNOWY_TAIGA, ForestBiomeType.SNOWY_TAIGA_HILLS));
	public static final ForestBiome WINDSWEPT_TAIGA_HILLS = register("windswept_taiga_hills", new ForestBiome(BiomeEffects.SNOWY_TAIGA, ForestBiomeType.WINDSWEPT_TAIGA_HILLS));
	public static final ForestBiome SNOWY_WINDSWEPT_TAIGA_HILLS = register("snowy_windswept_taiga_hills", new ForestBiome(BiomeEffects.SNOWY_TAIGA, ForestBiomeType.SNOWY_WINDSWEPT_TAIGA_HILLS));
	
	public static final OldGrowthBiome OLD_GROWTH_SPRUCE_TAIGA = register("old_growth_spruce_taiga", new OldGrowthBiome(BiomeEffects.OLD_GROWTH_TAIGA, OldGrowthBiomeType.OLD_GROWTH_SPRUCE_TAIGA));
	public static final OldGrowthBiome OLD_GROWTH_SPRUCE_TAIGA_HILLS = register("old_growth_spruce_taiga_hills", new OldGrowthBiome(BiomeEffects.OLD_GROWTH_TAIGA, OldGrowthBiomeType.OLD_GROWTH_SPRUCE_TAIGA_HILLS));
	public static final OldGrowthBiome OLD_GROWTH_PINE_TAIGA = register("old_growth_pine_taiga", new OldGrowthBiome(BiomeEffects.OLD_GROWTH_TAIGA, OldGrowthBiomeType.OLD_GROWTH_PINE_TAIGA));
	public static final OldGrowthBiome OLD_GROWTH_PINE_TAIGA_HILLS = register("old_growth_pine_taiga_hills", new OldGrowthBiome(BiomeEffects.OLD_GROWTH_TAIGA, OldGrowthBiomeType.OLD_GROWTH_PINE_TAIGA_HILLS));
	
	public static final RiverBiome RIVER = register("river", new RiverBiome(BiomeEffects.RIVER, RiverBiomeType.RIVER));
	public static final RiverBiome FROZEN_RIVER = register("frozen_river", new RiverBiome(BiomeEffects.FROZEN_RIVER, RiverBiomeType.FROZEN_RIVER));
	
	public static final DripstoneCaveBiome DRIPSTONE_CAVE = register("dripstone_cave", new DripstoneCaveBiome(BiomeEffects.DRIPSTONE_CAVE, CaveBiomeType.DRIPSTONE_CAVE));
	public static final LushCavesBiome LUSH_CAVES = register("lush_caves", new LushCavesBiome(BiomeEffects.LUSH_CAVES, CaveBiomeType.LUSH_CAVES));
	public static final DeepdarkOceanBiome DEEPDARK_OCEAN = register("deepdark_ocean", new DeepdarkOceanBiome(BiomeEffects.DEEPDARK_OCEAN, CaveBiomeType.DEEPDARK_OCEAN));
	
	protected static <T extends IBiome> T register(String name, T biome) {
		BIOME_REGISTRY.register(name, IBiome.createBiome(biome));
		BIOMES.put(name, biome);
		return biome;
	}
	
}
