
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.block.Blood3Block;
import net.themanofplane.block.Blood2Block;
import net.themanofplane.block.Blood1Block;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class TheManOfPlaneModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheManOfPlaneMod.MODID);
	public static final RegistryObject<Block> BLOOD_1 = REGISTRY.register("blood_1", () -> new Blood1Block());
	public static final RegistryObject<Block> BLOOD_2 = REGISTRY.register("blood_2", () -> new Blood2Block());
	public static final RegistryObject<Block> BLOOD_3 = REGISTRY.register("blood_3", () -> new Blood3Block());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
