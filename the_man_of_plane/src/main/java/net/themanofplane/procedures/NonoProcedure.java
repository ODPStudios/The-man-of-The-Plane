package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class NonoProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheManOfPlaneModVariables.MapVariables.get(world).displaychoice = true;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
		TheManOfPlaneModVariables.MapVariables.get(world).changedifficult = 2;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		TheManOfPlaneModVariables.MapVariables.get(world).animationdeathesteve = true;
		TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "stopsound @p");
		TheManOfPlaneMod.queueServerWork(2, () -> {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:horrrorsound1")), SoundSource.HOSTILE, 5, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:horrrorsound1")), SoundSource.HOSTILE, 5, 1, false);
				}
			}
		});
	}
}
