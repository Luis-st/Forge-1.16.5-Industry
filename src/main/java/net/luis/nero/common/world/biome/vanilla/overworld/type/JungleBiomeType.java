package net.luis.nero.common.world.biome.vanilla.overworld.type;

import net.luis.nero.api.common.world.biome.IBiomeType;
import net.luis.nero.api.common.world.biome.noise.OverworldBiomeNoise;
import net.luis.nero.api.common.world.biome.noise.IBiomeNoise;
import net.luis.nero.api.common.world.biome.util.BiomeGenerationBuilder;
import net.luis.nero.api.common.world.biome.util.MobSpawnBuilder;
import net.luis.nero.common.world.biome.util.BiomeSettings;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.biome.MobSpawnSettings;

public enum JungleBiomeType implements IBiomeType {
	
	JUNGLE(OverworldBiomeNoise.of(0.1, 0.2), BiomeSettings.getJungleSpawns(false, false), BiomeSettings.getJungleFeatures(false, false, false), false),
	JUNGLE_HILLS(OverworldBiomeNoise.of(0.45, 0.3), BiomeSettings.getJungleSpawns(true, false), BiomeSettings.getJungleFeatures(false, false, false), true),
	MODIFIED_JUNGLE(OverworldBiomeNoise.of(0.2, 0.4), BiomeSettings.getJungleSpawns(false, true), BiomeSettings.getJungleFeatures(false, false, true), false),
	SPARSE_JUNGLE(OverworldBiomeNoise.of(0.1, 0.2), BiomeSettings.getJungleSparseSpawns(), BiomeSettings.getJungleFeatures(false, true, false), false),
	MODIFIED_SPARSE_JUNGLE(OverworldBiomeNoise.of(0.2, 0.4), BiomeSettings.getJungleSparseSpawns(), BiomeSettings.getJungleFeatures(false, true, true), true),
	BAMBOO_JUNGLE(OverworldBiomeNoise.of(0.1, 0.2), BiomeSettings.getBambooJungleSpawns(false), BiomeSettings.getJungleFeatures(true, false, false), false),
	BAMBOO_JUNGLE_HILLS(OverworldBiomeNoise.of(0.45, 0.3), BiomeSettings.getBambooJungleSpawns(true), BiomeSettings.getJungleFeatures(true, false, false), true);
	
	private final IBiomeNoise biomeNoise;
	private final MobSpawnSettings mobSettings;
	private final BiomeGenerationSettings generationSettings;
	private final boolean hilly;
	
	private JungleBiomeType(IBiomeNoise biomeNoise, MobSpawnBuilder mobBuilder, BiomeGenerationBuilder generationBuilder, boolean hilly) {
		this(biomeNoise, mobBuilder.build(), generationBuilder.build(), hilly);
	}
	
	private JungleBiomeType(IBiomeNoise biomeNoise, MobSpawnSettings mobSettings, BiomeGenerationSettings generationSettings, boolean hilly) {
		this.biomeNoise = biomeNoise;
		this.mobSettings = mobSettings;
		this.generationSettings = generationSettings;
		this.hilly = hilly;
	}
	
	@Override
	public float getTemperature() {
		return 0.95F;
	}
	
	@Override
	public IBiomeNoise getBiomeNoise() {
		return this.biomeNoise;
	}
	
	@Override
	public MobSpawnSettings getMobSpawnSettings() {
		return this.mobSettings;
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
		return this.hilly;
	}

	@Override
	public boolean isWindswept() {
		return false;
	}
	
}
