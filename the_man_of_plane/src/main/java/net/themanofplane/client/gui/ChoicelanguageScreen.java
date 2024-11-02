package net.themanofplane.client.gui;

import net.themanofplane.world.inventory.ChoicelanguageMenu;
import net.themanofplane.network.ChoicelanguageButtonMessage;
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

public class ChoicelanguageScreen extends AbstractContainerScreen<ChoicelanguageMenu> {
	private final static HashMap<String, Object> guistate = ChoicelanguageMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_francais;
	Button button_english;

	public ChoicelanguageScreen(ChoicelanguageMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("the_man_of_plane:textures/screens/choicelanguage.png");

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

		guiGraphics.blit(new ResourceLocation("the_man_of_plane:textures/screens/sansdsffdsfffff_titre.png"), this.leftPos + 8, this.topPos + 10, 0, 0, 80, 80, 80, 80);

		guiGraphics.blit(new ResourceLocation("the_man_of_plane:textures/screens/dsds.png"), this.leftPos + 102, this.topPos + 35, 0, 0, 61, 32, 61, 32);

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
	}

	@Override
	public void init() {
		super.init();
		button_francais = Button.builder(Component.translatable("gui.the_man_of_plane.choicelanguage.button_francais"), e -> {
			if (true) {
				TheManOfPlaneMod.PACKET_HANDLER.sendToServer(new ChoicelanguageButtonMessage(0, x, y, z));
				ChoicelanguageButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 14, this.topPos + 77, 67, 20).build();
		guistate.put("button:button_francais", button_francais);
		this.addRenderableWidget(button_francais);
		button_english = Button.builder(Component.translatable("gui.the_man_of_plane.choicelanguage.button_english"), e -> {
			if (true) {
				TheManOfPlaneMod.PACKET_HANDLER.sendToServer(new ChoicelanguageButtonMessage(1, x, y, z));
				ChoicelanguageButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 101, this.topPos + 77, 61, 20).build();
		guistate.put("button:button_english", button_english);
		this.addRenderableWidget(button_english);
	}
}
