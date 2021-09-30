package net.luis.nero.common.world.biome.util;

import net.luis.nero.api.common.world.biome.util.BiomeGenerationBuilder;
import net.luis.nero.api.common.world.biome.util.MobSpawnBuilder;
import net.luis.nero.common.world.levelgen.feature.biome.DefaultVanillaBiomeFeatures;
import net.luis.nero.common.world.levelgen.feature.biome.DefaultVanillaBiomeSpawns;
import net.minecraft.data.worldgen.Features;
import net.minecraft.data.worldgen.SurfaceBuilders;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;

public class BiomeUtil {
	
	protected static BiomeGenerationBuilder getFeatures() {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		
		return generationBuilder;
	}
	
	protected static MobSpawnBuilder getSpawns() {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		
		return mobBuilder;
	}
	
	public static float getBeachTemperature(boolean shore, boolean snowy) {
		if (snowy) {
			return 0.05F;
		}
		return shore ? 0.2F : 0.8F;
	}
	
	public static BiomeGenerationBuilder getBadlandsFeatures(boolean plateau, boolean wooded) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		DefaultVanillaBiomeFeatures.addMesaStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, plateau);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addExtraGold(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addBadlandGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addBadlandExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		if (wooded) {
			generationBuilder.surfaceBuilder(() -> SurfaceBuilders.WOODED_BADLANDS);
			DefaultVanillaBiomeFeatures.addBadlandsTrees(generationBuilder);
		} else {
			generationBuilder.surfaceBuilder(() -> SurfaceBuilders.BADLANDS);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getBadlandsSpawns() {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getBeachFeatures(boolean shore) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, shore);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		if (shore) {
			generationBuilder.surfaceBuilder(() -> SurfaceBuilders.STONE);
			DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		} else {
			generationBuilder.surfaceBuilder(() -> SurfaceBuilders.DESERT);
			DefaultVanillaBiomeFeatures.addBeachStructures(generationBuilder);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getBeachSpawns(boolean turtle) {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		if (turtle) {
			DefaultVanillaBiomeSpawns.addBeachSpawns(mobBuilder);
		}
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getDesertFeatures(boolean hilly, boolean lakey) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		generationBuilder.surfaceBuilder(() -> SurfaceBuilders.DESERT);
		DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDesertVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDesertExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		DefaultVanillaBiomeFeatures.addDesertStructures(generationBuilder, hilly, lakey);
		if (!lakey && !hilly) {
			DefaultVanillaBiomeFeatures.addFossilDecoration(generationBuilder);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getDesertSpawns() {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addDesertSpawns(mobBuilder);
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getTaigaFeatures(boolean hilly, boolean snowy, boolean mountain) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		generationBuilder.surfaceBuilder(() -> SurfaceBuilders.GRASS);
		DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addFerns(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addTaigaTrees(generationBuilder);
		DefaultVanillaBiomeFeatures.addTaigaGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, mountain);
		DefaultVanillaBiomeFeatures.addTaigaBerryBushes(generationBuilder, snowy);
		if (!hilly && !snowy && !mountain) {
			DefaultVanillaBiomeFeatures.addTagiaStructures(generationBuilder);
		} else if (!hilly && !mountain) {
			DefaultVanillaBiomeFeatures.addSnowyTagiaStructures(generationBuilder);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getTaigaSpawns(boolean canPlayerSpawn) {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addFarmAnimalSpawns(mobBuilder);
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		DefaultVanillaBiomeSpawns.addTaigaSpawns(mobBuilder);
		if (canPlayerSpawn) {
			mobBuilder.enablePlayerSpawn();
		} else {
			mobBuilder.disablePlayerSpawn();
		}
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getForestFeatures(boolean flower) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		generationBuilder.surfaceBuilder(() -> SurfaceBuilders.GRASS);
		DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, false);
		if (flower) {
			generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.FOREST_FLOWER_VEGETATION_COMMON);
			generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.FOREST_FLOWER_TREES);
			generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.FLOWER_FOREST);
			DefaultVanillaBiomeFeatures.addDefaultGrass(generationBuilder);
		} else {
			DefaultVanillaBiomeFeatures.addForestFlowers(generationBuilder);
			DefaultVanillaBiomeFeatures.addOtherBirchTrees(generationBuilder);
			DefaultVanillaBiomeFeatures.addForestGrass(generationBuilder);
			DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getForestSpawns(boolean flower) {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addFarmAnimalSpawns(mobBuilder);
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		if (flower) {
			mobBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.RABBIT, 4, 2, 3));
		} else {
			mobBuilder.addSpawn(MobCategory.CREATURE, new MobSpawnSettings.SpawnerData(EntityType.WOLF, 5, 4, 4));
			mobBuilder.enablePlayerSpawn();
		}
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getBirchForestFeatures(boolean tall) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		generationBuilder.surfaceBuilder(() -> SurfaceBuilders.GRASS);
		DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		DefaultVanillaBiomeFeatures.addForestGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, false);
		if (tall) {
			DefaultVanillaBiomeFeatures.addTallBirchTrees(generationBuilder);
		} else {
			DefaultVanillaBiomeFeatures.addBirchTrees(generationBuilder);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getBirchForestSpawns() {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addFarmAnimalSpawns(mobBuilder);
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		return mobBuilder;
	}
	
	public static BiomeGenerationBuilder getDarkForestFeatures(boolean hilly) {
		BiomeGenerationBuilder generationBuilder = new BiomeGenerationBuilder();
		generationBuilder.surfaceBuilder(() -> SurfaceBuilders.GRASS);
		DefaultVanillaBiomeFeatures.addDefaultStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultCarvers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultLakes(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultAmethystGeode(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMonsterRoom(generationBuilder);
		DefaultVanillaBiomeFeatures.addForestFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultUndergroundVariety(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultOres(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSoftDisks(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultFlowers(generationBuilder);
		DefaultVanillaBiomeFeatures.addForestGrass(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultMushrooms(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultExtraVegetation(generationBuilder);
		DefaultVanillaBiomeFeatures.addDefaultSprings(generationBuilder);
		DefaultVanillaBiomeFeatures.addSurfaceFreezing(generationBuilder);
		DefaultVanillaBiomeFeatures.addDarkForestStructures(generationBuilder);
		DefaultVanillaBiomeFeatures.addRuinedPortal(generationBuilder, false);
		if (hilly) {
			generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.DARK_FOREST_VEGETATION_RED);
		} else {
			generationBuilder.addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, Features.DARK_FOREST_VEGETATION_BROWN);
		}
		return generationBuilder;
	}
	
	public static MobSpawnBuilder getDarkForestSpawns() {
		MobSpawnBuilder mobBuilder = new MobSpawnBuilder();
		DefaultVanillaBiomeSpawns.addFarmAnimalSpawns(mobBuilder);
		DefaultVanillaBiomeSpawns.addCommonMonsterSpawns(mobBuilder);
		return mobBuilder;
	}
	
}
