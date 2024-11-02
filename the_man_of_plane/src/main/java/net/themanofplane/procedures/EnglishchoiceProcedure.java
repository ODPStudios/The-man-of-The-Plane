package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class EnglishchoiceProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		TheManOfPlaneModVariables.MapVariables.get(world).languageenglish = true;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
