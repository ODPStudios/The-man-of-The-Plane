
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.client.renderer.Stevehorrorphase1Renderer;
import net.themanofplane.client.renderer.SteveblesserRenderer;
import net.themanofplane.client.renderer.SteveRenderer;
import net.themanofplane.client.renderer.SteveHorrorPhase2Renderer;
import net.themanofplane.client.renderer.PlaneRenderer;
import net.themanofplane.client.renderer.Cadavre2Renderer;
import net.themanofplane.client.renderer.Cadavre1Renderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheManOfPlaneModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheManOfPlaneModEntities.PLANE.get(), PlaneRenderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.CADAVRE_1.get(), Cadavre1Renderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.CADAVRE_2.get(), Cadavre2Renderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.STEVE.get(), SteveRenderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.STEVEBLESSER.get(), SteveblesserRenderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.STEVEHORRORPHASE_1.get(), Stevehorrorphase1Renderer::new);
		event.registerEntityRenderer(TheManOfPlaneModEntities.STEVE_HORROR_PHASE_2.get(), SteveHorrorPhase2Renderer::new);
	}
}
