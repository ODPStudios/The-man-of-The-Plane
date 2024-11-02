package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.entity.SteveHorrorPhase2Entity;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SteveHorrorPhase2LorsDeLapparitionInitialeDeLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		TheManOfPlaneMod.queueServerWork(20, () -> {
			TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer2")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer2")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			TheManOfPlaneMod.queueServerWork(25, () -> {
				TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 = false;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			});
		});
		TheManOfPlaneMod.queueServerWork(400, () -> {
			TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer2")), SoundSource.HOSTILE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:screamer2")), SoundSource.HOSTILE, 1, 1, false);
				}
			}
			TheManOfPlaneMod.queueServerWork(30, () -> {
				TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 = false;
				TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			});
		});
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"effect give minecraft:slowness 4 255 true");
		if (entity instanceof SteveHorrorPhase2Entity) {
			((SteveHorrorPhase2Entity) entity).setAnimation("Transform");
		}
		if (world instanceof ServerLevel _level) {
			LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
			entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
			entityToSpawn.setVisualOnly(true);
			_level.addFreshEntity(entityToSpawn);
		}
		TheManOfPlaneMod.queueServerWork(1200, () -> {
			if (!entity.level().isClientSide())
				entity.discard();
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
				entityToSpawn.setVisualOnly(true);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
				}
			}
		});
	}
}
