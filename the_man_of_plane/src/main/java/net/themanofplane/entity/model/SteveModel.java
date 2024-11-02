package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.SteveEntity;

import net.minecraft.resources.ResourceLocation;

public class SteveModel extends GeoModel<SteveEntity> {
	@Override
	public ResourceLocation getAnimationResource(SteveEntity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/steve.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteveEntity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/steve.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteveEntity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
