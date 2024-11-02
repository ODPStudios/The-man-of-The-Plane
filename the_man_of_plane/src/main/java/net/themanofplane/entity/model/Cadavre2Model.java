package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.Cadavre2Entity;

import net.minecraft.resources.ResourceLocation;

public class Cadavre2Model extends GeoModel<Cadavre2Entity> {
	@Override
	public ResourceLocation getAnimationResource(Cadavre2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/cadavred.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Cadavre2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/cadavred.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Cadavre2Entity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
