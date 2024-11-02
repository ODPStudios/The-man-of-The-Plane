package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.SteveHorrorPhase2Entity;

import net.minecraft.resources.ResourceLocation;

public class SteveHorrorPhase2Model extends GeoModel<SteveHorrorPhase2Entity> {
	@Override
	public ResourceLocation getAnimationResource(SteveHorrorPhase2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/stevehorrorphase2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteveHorrorPhase2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/stevehorrorphase2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteveHorrorPhase2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
