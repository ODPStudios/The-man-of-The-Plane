package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnScreamerProcedure {
	@SubscribeEvent
	public static void onEntityEndSleep(PlayerWakeUpEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		boolean trueflase = false;
		TheManOfPlaneMod.queueServerWork(200, () -> {
			TheManOfPlaneModVariables.MapVariables.get(world).Screamer3_1 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer3")), SoundSource.NEUTRAL, 4, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer3")), SoundSource.NEUTRAL, 4, 1, false);
				}
			}
			TheManOfPlaneMod.queueServerWork(20, () -> {
				TheManOfPlaneModVariables.MapVariables.get(world).Screamer3_1 = false;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			});
		});
	}
}
