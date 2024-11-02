
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.world.inventory.DemandeouiounonMenu;
import net.themanofplane.world.inventory.ChoicelanguageMenu;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class TheManOfPlaneModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TheManOfPlaneMod.MODID);
	public static final RegistryObject<MenuType<ChoicelanguageMenu>> CHOICELANGUAGE = REGISTRY.register("choicelanguage", () -> IForgeMenuType.create(ChoicelanguageMenu::new));
	public static final RegistryObject<MenuType<DemandeouiounonMenu>> DEMANDEOUIOUNON = REGISTRY.register("demandeouiounon", () -> IForgeMenuType.create(DemandeouiounonMenu::new));
}
