package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpawnplaneProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (TheManOfPlaneModVariables.MapVariables.get(world).languagefrench == true) {
			TheManOfPlaneModVariables.MapVariables.get(world).languageenglish = false;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		}
		if (TheManOfPlaneModVariables.MapVariables.get(world).languageenglish == true) {
			TheManOfPlaneModVariables.MapVariables.get(world).languagefrench = false;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		}
		TheManOfPlaneMod.queueServerWork(12000, () -> {
			if (TheManOfPlaneModVariables.MapVariables.get(world).trueofflaseplane == false) {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((x + Mth.nextDouble(RandomSource.create(), 24, 40)), (y - 1), (z + Mth.nextDouble(RandomSource.create(), 24, 40))),
							Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "summon the_man_of_plane:plane");
				TheManOfPlaneModVariables.MapVariables.get(world).trueofflaseplane = true;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			}
		});
	}
}
