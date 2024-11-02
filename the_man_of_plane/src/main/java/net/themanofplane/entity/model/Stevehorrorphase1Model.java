package net.themanofplane.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.themanofplane.entity.Stevehorrorphase1Entity;

import net.minecraft.resources.ResourceLocation;

public class Stevehorrorphase1Model extends GeoModel<Stevehorrorphase1Entity> {
	@Override
	public ResourceLocation getAnimationResource(Stevehorrorphase1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "animations/stevehorrorphase1.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(Stevehorrorphase1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "geo/stevehorrorphase1.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(Stevehorrorphase1Entity entity) {
		return new ResourceLocation("the_man_of_plane", "textures/entities/" + entity.getTexture() + ".png");
	}

}
