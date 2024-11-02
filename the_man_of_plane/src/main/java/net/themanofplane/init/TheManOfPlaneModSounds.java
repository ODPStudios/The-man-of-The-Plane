
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class TheManOfPlaneModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheManOfPlaneMod.MODID);
	public static final RegistryObject<SoundEvent> CRASH = REGISTRY.register("crash", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "crash")));
	public static final RegistryObject<SoundEvent> TOUSSE1 = REGISTRY.register("tousse1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "tousse1")));
	public static final RegistryObject<SoundEvent> BLOOD = REGISTRY.register("blood", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "blood")));
	public static final RegistryObject<SoundEvent> HORRRORSOUND1 = REGISTRY.register("horrrorsound1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "horrrorsound1")));
	public static final RegistryObject<SoundEvent> HELP2 = REGISTRY.register("help2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "help2")));
	public static final RegistryObject<SoundEvent> STEVEHORRORE1 = REGISTRY.register("stevehorrore1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "stevehorrore1")));
	public static final RegistryObject<SoundEvent> FDFGGG = REGISTRY.register("fdfggg", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "fdfggg")));
	public static final RegistryObject<SoundEvent> SOUNDSCREAMER1 = REGISTRY.register("soundscreamer1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "soundscreamer1")));
	public static final RegistryObject<SoundEvent> SCREAMER3 = REGISTRY.register("screamer3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "screamer3")));
	public static final RegistryObject<SoundEvent> HELP = REGISTRY.register("help", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "help")));
	public static final RegistryObject<SoundEvent> SCREAMER2 = REGISTRY.register("screamer2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_man_of_plane", "screamer2")));
}
