package net.luis.nero.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModServerConfig {

	private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static ForgeConfigSpec CONFIG;

	static {
		BUILDER.comment("This is a working default configuration.");
		BUILDER.comment("\nChanges of the default values can lead to problems!");
		BUILDER.push("\n\nNero Server Config");
		BUILDER.pop();
		CONFIG = BUILDER.build();
	}

}