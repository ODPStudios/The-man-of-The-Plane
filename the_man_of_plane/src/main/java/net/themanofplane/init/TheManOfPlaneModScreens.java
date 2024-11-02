
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.client.gui.DemandeouiounonScreen;
import net.themanofplane.client.gui.ChoicelanguageScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheManOfPlaneModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TheManOfPlaneModMenus.CHOICELANGUAGE.get(), ChoicelanguageScreen::new);
			MenuScreens.register(TheManOfPlaneModMenus.DEMANDEOUIOUNON.get(), DemandeouiounonScreen::new);
		});
	}
}
