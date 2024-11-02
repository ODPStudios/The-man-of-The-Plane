package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.PlaneEntity;

import net.minecraft.resources.ResourceLocation;

public class PlaneModel extends GeoModel<PlaneEntity> {
	@Override
	public ResourceLocation getAnimationResource(PlaneEntity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/plane.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PlaneEntity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/plane.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PlaneEntity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
