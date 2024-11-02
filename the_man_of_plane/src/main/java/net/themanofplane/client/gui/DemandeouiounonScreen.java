package net.themanofplane.client.gui;

import net.themanofplane.world.inventory.DemandeouiounonMenu;
import net.themanofplane.network.DemandeouiounonButtonMessage;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class DemandeouiounonScreen extends AbstractContainerScreen<DemandeouiounonMenu> {
	private final static HashMap<String, Object> guistate = DemandeouiounonMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_oui;
	Button button_non;

	public DemandeouiounonScreen(DemandeouiounonMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_man_of_plane:textures/screens/demandeouiounon.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.the_man_of_plane.demandeouiounon.label_aidezvous_le_survivant"), 15, 25, -3407872, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_man_of_plane.demandeouiounon.label_ou"), 79, 89, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_man_of_plane.demandeouiounon.label_ce_choix_aura_un_impacte_dans_le"), 4, 120, -10066330, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.the_man_of_plane.demandeouiounon.label_dans_le_future"), 30, 137, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_oui = Button.builder(Component.translatable("gui.the_man_of_plane.demandeouiounon.button_oui"), e -> {
			if (true) {
				TheManOfPlaneMod.PACKET_HANDLER.sendToServer(new DemandeouiounonButtonMessage(0, x, y, z));
				DemandeouiounonButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 20, this.topPos + 83, 40, 20).build();
		guistate.put("button:button_oui", button_oui);
		this.addRenderableWidget(button_oui);
		button_non = Button.builder(Component.translatable("gui.the_man_of_plane.demandeouiounon.button_non"), e -> {
			if (true) {
				TheManOfPlaneMod.PACKET_HANDLER.sendToServer(new DemandeouiounonButtonMessage(1, x, y, z));
				DemandeouiounonButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 110, this.topPos + 83, 40, 20).build();
		guistate.put("button:button_non", button_non);
		this.addRenderableWidget(button_non);
	}
}
