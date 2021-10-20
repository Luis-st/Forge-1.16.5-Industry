package net.luis.nero.common.world.biome.vanilla.overworld.type;

import net.luis.nero.api.common.world.biome.IBiomeType;
import net.luis.nero.api.common.world.biome.noise.OverworldBiomeNoise;
import net.luis.nero.api.common.world.biome.noise.IBiomeNoise;
import net.luis.nero.api.common.world.biome.util.BiomeGenerationBuilder;
import net.luis.nero.common.world.biome.util.BiomeSettings;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;

public enum BadlandsBiomeType implements IBiomeType {
	
	BADLANDS(OverworldBiomeNoise.of(0.1, 0.2), BiomeSettings.getBadlandsFeatures(false, false, false), false),
	WINDSWEPT_BADLANDS(OverworldBiomeNoise.of(1.5, 0.025), BiomeSettings.getBadlandsFeatures(true, false, false), true),
	ERODED_BADLANDS(OverworldBiomeNoise.of(0.1, 0.2), BiomeSettings.getBadlandsFeatures(true, false, true), false),
	MODIFIED_WINDSWEPT_BADLANDS(OverworldBiomeNoise.of(0.45, 0.3), BiomeSettings.getBadlandsFeatures(true, false, false), true),
	WOODED_WINDSWEPT_BADLANDS(OverworldBiomeNoise.of(1.5, 0.025), BiomeSettings.getBadlandsFeatures(true, true, false), true),
	MODIFIED_WOODED_WINDSWEPT_BADLANDS(OverworldBiomeNoise.of(0.45, 0.3), BiomeSettings.getBadlandsFeatures(true, true, false), true);
	
	private final IBiomeNoise biomeNoise;
	private final BiomeGenerationSettings generationSettings;
	private final boolean windswept;
	
	private BadlandsBiomeType(IBiomeNoise biomeNoise, BiomeGenerationBuilder generationBuilder, boolean windswept) {
		this(biomeNoise, generationBuilder.build(), windswept);
	}
	
	private BadlandsBiomeType(IBiomeNoise biomeNoise, BiomeGenerationSettings generationSettings, boolean windswept) {
		this.biomeNoise = biomeNoise;
		this.generationSettings = generationSettings;
		this.windswept = windswept;
	}
	
	@Override
	public float getTemperature() {
		return 2.0F;
	}
	
	@Override
	public IBiomeNoise getBiomeNoise() {
		return this.biomeNoise;
	}
	
	@Override
	public MobSpawnSettings getMobSpawnSettings() {
		return BiomeSettings.getBadlandsSpawns().build();
	}
	
	@Override
	public BiomeGenerationSettings getBiomeGenerationSettings() {
		return this.generationSettings;
	}
	
	@Override
	public boolean isUnderground() {
		return false;
	}
	
	@Override
	public boolean isOcean() {
		return false;
	}
	
	@Override
	public boolean isBeach() {
		return false;
	}
	
	@Override
	public boolean isMushroomIsland() {
		return false;
	}
	
	@Override
	public boolean isHilly() {
		return false;
	}

	@Override
	public boolean isWindswept() {
		return this.windswept;
	}
	
}
