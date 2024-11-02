package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.init.TheManOfPlaneModEntities;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class Stevehorrorphase1LorsDeLapparitionInitialeDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean yesno = false;
		TheManOfPlaneMod.queueServerWork(12000, () -> {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = TheManOfPlaneModEntities.STEVE_HORROR_PHASE_2.get().spawn(_level, BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 13, 30), y,
						z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 14, 35)), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		});
		TheManOfPlaneMod.queueServerWork(20, () -> {
			TheManOfPlaneModVariables.MapVariables.get(world).TrueOrFlalseScreamer1 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:soundscreamer1")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:soundscreamer1")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			TheManOfPlaneMod.queueServerWork(20, () -> {
				TheManOfPlaneModVariables.MapVariables.get(world).TrueOrFlalseScreamer1 = false;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			});
		});
		TheManOfPlaneMod.queueServerWork(200, () -> {
			TheManOfPlaneModVariables.MapVariables.get(world).TrueOrFlalseScreamer1 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:soundscreamer1")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:soundscreamer1")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			TheManOfPlaneMod.queueServerWork(20, () -> {
				TheManOfPlaneModVariables.MapVariables.get(world).TrueOrFlalseScreamer1 = false;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			});
		});
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:stevehorrore1")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:stevehorrore1")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\u00A74 Hi... "), false);
		TheManOfPlaneMod.queueServerWork(1200, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:fdfggg")), SoundSource.MASTER, 2, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:fdfggg")), SoundSource.MASTER, 2, 1, false);
				}
			}
		});
	}
}
