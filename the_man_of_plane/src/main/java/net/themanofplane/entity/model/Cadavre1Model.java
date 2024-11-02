package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.Cadavre1Entity;

import net.minecraft.resources.ResourceLocation;

public class Cadavre1Model extends GeoModel<Cadavre1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Cadavre1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/cadavre.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cadavre1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/cadavre.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cadavre1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
