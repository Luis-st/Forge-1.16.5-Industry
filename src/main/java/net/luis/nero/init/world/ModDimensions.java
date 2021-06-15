package net.luis.nero.init.world;

import net.luis.nero.Nero;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.Dimension;
import net.minecraft.world.DimensionType;
import net.minecraft.world.World;

public class ModDimensions {
	
    public static final RegistryKey<DimensionType> DEEPSLATE_TYPE = 
    		RegistryKey.create(Registry.DIMENSION_TYPE_REGISTRY, new ResourceLocation(Nero.MOD_ID, "deepslate"));
    public static final RegistryKey<World> DEEPSLATE_WORLD = 
    		RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Nero.MOD_ID, "deepslate"));
    public static final RegistryKey<Dimension> DEEPSLATE = 
    		RegistryKey.create(Registry.LEVEL_STEM_REGISTRY, new ResourceLocation(Nero.MOD_ID, "deepslate"));

}