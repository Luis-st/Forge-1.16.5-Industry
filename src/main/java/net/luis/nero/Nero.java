package net.luis.nero;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.luis.nero.client.model.ModEntityModelSet;
import net.luis.nero.init.block.ModBlocks;
import net.luis.nero.init.block.item.ModBlockItems;
import net.luis.nero.init.block.util.ModBlockEntityTypes;
import net.luis.nero.init.block.util.ModMenuTypes;
import net.luis.nero.init.enchantment.ModEnchantments;
import net.luis.nero.init.entity.ModEntityTypes;
import net.luis.nero.init.items.ModItems;
import net.luis.nero.init.potion.ModEffects;
import net.luis.nero.init.potion.ModPotions;
import net.luis.nero.init.recipe.ModRecipeSerializer;
import net.luis.nero.init.villager.ModPoiTypes;
import net.luis.nero.init.villager.ModVillagerProfessions;
import net.luis.nero.init.world.biome.ModBiomes;
import net.luis.nero.init.world.levelgen.carver.ModWorldCarvers;
import net.luis.nero.init.world.levelgen.decorator.ModFeatureDecorators;
import net.luis.nero.init.world.levelgen.feature.ModFeatures;
import net.luis.nero.init.world.levelgen.feature.structure.ModStructures;
import net.luis.nero.init.world.levelgen.surfacebuilder.ModSurfaceBuilders;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;

@Mod(Nero.MOD_ID)
public class Nero {
	
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MOD_ID = "nero";
	public static final String MINECRAFT_ID = "minecraft";
	public static final boolean RUN_IN_IDE = FMLEnvironment.production;
	
	public static final int WORLD_Y_MIN = 0;
	public static final int WORLD_Y_MAX = 512;
	public static final double WORLD_NOISE_SCALE = 0.0625;
	
	private static Nero nero;
	
	protected final ModEntityModelSet modModelSet;
	
	public Nero() {
		nero = this;
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.BLOCKS.register(eventBus);
		ModBlockItems.ITEMS.register(eventBus);
		ModMenuTypes.CONTAINERS.register(eventBus);
		ModBlockEntityTypes.BLOCK_ENTITIES.register(eventBus);
		
		ModItems.ITEMS.register(eventBus);
		
		ModRecipeSerializer.RECIPE_SERIALIZERS.register(eventBus);
		
		ModPoiTypes.POI_TYPES.register(eventBus);
		ModVillagerProfessions.PROFESSIONS.register(eventBus);
		
		ModEnchantments.ENCHANTMENTS.register(eventBus);
		
		ModEntityTypes.ENTITIES.register(eventBus);
		
		ModEffects.MOB_EFFECTS.register(eventBus);
		ModPotions.POTIONS.register(eventBus);
		
		ModFeatureDecorators.DECORATORS.register(eventBus);
		ModFeatures.FEATURES.register(eventBus);
		ModSurfaceBuilders.SURFACE_BUILDERS.register(eventBus);
		ModWorldCarvers.WORLD_CARVERS.register(eventBus);
		ModStructures.STRUCTURES.register(eventBus);
		ModBiomes.BIOMES.register(eventBus);
		
		this.modModelSet = new ModEntityModelSet();
	}
	
	public static Nero getInstance() {
		return nero;
	}
	
	public ModEntityModelSet getModModelSet() {
		return this.modModelSet;
	}
	
}