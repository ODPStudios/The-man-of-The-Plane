package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.SteveblesserEntity;

import net.minecraft.resources.ResourceLocation;

public class SteveblesserModel extends GeoModel<SteveblesserEntity> {
	@Override
	public ResourceLocation getAnimationResource(SteveblesserEntity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/steve.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SteveblesserEntity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/steve.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SteveblesserEntity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
