
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.item.DDDDItem;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class TheManOfPlaneModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheManOfPlaneMod.MODID);
	public static final RegistryObject<Item> PLANE_SPAWN_EGG = REGISTRY.register("plane_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.PLANE, -16737895, -1, new Item.Properties()));
	public static final RegistryObject<Item> CADAVRE_1_SPAWN_EGG = REGISTRY.register("cadavre_1_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.CADAVRE_1, -6750208, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> CADAVRE_2_SPAWN_EGG = REGISTRY.register("cadavre_2_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.CADAVRE_2, -3407821, -16764109, new Item.Properties()));
	public static final RegistryObject<Item> BLOOD_1 = block(TheManOfPlaneModBlocks.BLOOD_1);
	public static final RegistryObject<Item> BLOOD_2 = block(TheManOfPlaneModBlocks.BLOOD_2);
	public static final RegistryObject<Item> BLOOD_3 = block(TheManOfPlaneModBlocks.BLOOD_3);
	public static final RegistryObject<Item> STEVE_SPAWN_EGG = REGISTRY.register("steve_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.STEVE, -16737895, -16777063, new Item.Properties()));
	public static final RegistryObject<Item> STEVEBLESSER_SPAWN_EGG = REGISTRY.register("steveblesser_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.STEVEBLESSER, -6750208, -16777063, new Item.Properties()));
	public static final RegistryObject<Item> DDDD = REGISTRY.register("dddd", () -> new DDDDItem());
	public static final RegistryObject<Item> STEVEHORRORPHASE_1_SPAWN_EGG = REGISTRY.register("stevehorrorphase_1_spawn_egg", () -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.STEVEHORRORPHASE_1, -16777216, -13434880, new Item.Properties()));
	public static final RegistryObject<Item> STEVE_HORROR_PHASE_2_SPAWN_EGG = REGISTRY.register("steve_horror_phase_2_spawn_egg",
			() -> new ForgeSpawnEggItem(TheManOfPlaneModEntities.STEVE_HORROR_PHASE_2, -16777216, -16777216, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
