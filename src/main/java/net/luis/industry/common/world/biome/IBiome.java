package net.luis.industry.common.world.biome;

import net.luis.industry.common.world.surfacebuilder.ConfiguredModSurfaceBuilders;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;

public interface IBiome {
	
	Biome createBiome();
	
	default Biome.RainType getRainType() {
		return RainType.NONE;
	}
	
	default Category getCategory() {
		return Category.NONE;
	}
	
	default float getDepth() {
		return 0.0F;
	}
	
	default float getScale() {
		return 0.0F;
	}
	
	default float getTemperature() {
		return 1.0F;
	}
	
	default float getDownfall() {
		return 0.0F;
	}
	
	BiomeAmbience getBiomeAmbience();
	
	default int calculateSkyColor(float f) {
		float g = f / 3.0F;
		g = MathHelper.clamp(g, -1.0F, 1.0F);
		return MathHelper.hsvToRgb(0.62222224F - g * 0.05F, 0.5F + g * 0.1F, 1.0F);
	}
	
	MobSpawnInfo getMobSpawnSettings();
	
	default BiomeGenerationSettings getBiomeGenerationSettings() {
		BiomeGenerationSettings.Builder generationBuilder = new BiomeGenerationSettings.Builder();
		generationBuilder.surfaceBuilder(() -> ConfiguredModSurfaceBuilders.DEEPSLATE);
		return generationBuilder.build();
	}

}
