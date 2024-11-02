package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class OuiyesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheManOfPlaneModVariables.MapVariables.get(world).displaychoice = true;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
		TheManOfPlaneModVariables.MapVariables.get(world).changedifficult = 1;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		TheManOfPlaneModVariables.MapVariables.get(world).aniamtionyessteve = true;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @p");
		if (TheManOfPlaneModVariables.MapVariables.get(world).languagefrench == true) {
			TheManOfPlaneMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"execute as @e[type=the_man_of_plane:steve] run say Merci ! j'ai cru que j'allait mourir...");
			});
		}
		if (TheManOfPlaneModVariables.MapVariables.get(world).languageenglish == true) {
			TheManOfPlaneMod.queueServerWork(10, () -> {
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/execute as @e[type=the_man_of_plane:steve] run say THANKS ! I thought I was going to die....");
			});
		}
	}
}
