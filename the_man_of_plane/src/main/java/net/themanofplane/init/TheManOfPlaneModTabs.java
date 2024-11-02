
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class TheManOfPlaneModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TheManOfPlaneMod.MODID);
	public static final RegistryObject<CreativeModeTab> THE_MAN_OF_PLANE = REGISTRY.register("the_man_of_plane",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.the_man_of_plane.the_man_of_plane")).icon(() -> new ItemStack(TheManOfPlaneModItems.DDDD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(TheManOfPlaneModItems.PLANE_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModItems.CADAVRE_1_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModItems.CADAVRE_2_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModBlocks.BLOOD_1.get().asItem());
				tabData.accept(TheManOfPlaneModBlocks.BLOOD_2.get().asItem());
				tabData.accept(TheManOfPlaneModBlocks.BLOOD_3.get().asItem());
				tabData.accept(TheManOfPlaneModItems.STEVE_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModItems.STEVEBLESSER_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModItems.STEVEHORRORPHASE_1_SPAWN_EGG.get());
				tabData.accept(TheManOfPlaneModItems.STEVE_HORROR_PHASE_2_SPAWN_EGG.get());
			}).withSearchBar().build());
}
