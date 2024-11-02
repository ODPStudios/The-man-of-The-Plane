
package net.themanofplane.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.themanofplane.entity.model.SteveHorrorPhase2Model;
import net.themanofplane.entity.SteveHorrorPhase2Entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SteveHorrorPhase2Renderer extends GeoEntityRenderer<SteveHorrorPhase2Entity> {
	public SteveHorrorPhase2Renderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new SteveHorrorPhase2Model());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(SteveHorrorPhase2Entity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, SteveHorrorPhase2Entity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(SteveHorrorPhase2Entity entityLivingBaseIn) {
		return 0.0F;
	}
}
