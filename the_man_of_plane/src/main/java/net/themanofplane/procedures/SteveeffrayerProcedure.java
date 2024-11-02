package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.init.TheManOfPlaneModEntities;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class SteveeffrayerProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return false;
		if ((world instanceof Level _lvl0 && _lvl0.isDay()) == false) {
			TheManOfPlaneModVariables.MapVariables.get(world).CYCLENIGHJT = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			TheManOfPlaneMod.queueServerWork(100, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "kill @s");
					}
				}
				TheManOfPlaneMod.queueServerWork(600, () -> {
					if (TheManOfPlaneModVariables.MapVariables.get(world).languagefrench == true && TheManOfPlaneModVariables.MapVariables.get(world).tueorfalse1A == false) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauvf1"));
							if (template != null) {
								template.placeInWorld(_serverworld,
										BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 5, 15), y,
												z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 5, 15)),
										BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 5, 15), y,
												z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 5, 15)),
										new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = TheManOfPlaneModEntities.STEVEHORRORPHASE_1.get().spawn(_level, BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 17, 30), y,
									z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 14, 35)), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						TheManOfPlaneModVariables.MapVariables.get(world).tueorfalse1A = true;
						TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
					}
					if (TheManOfPlaneModVariables.MapVariables.get(world).languageenglish == true && TheManOfPlaneModVariables.MapVariables.get(world).tueorfalse1A == false) {
						if (world instanceof ServerLevel _serverworld) {
							StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauen1"));
							if (template != null) {
								template.placeInWorld(_serverworld,
										BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 5, 15), y,
												z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 5, 15)),
										BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 5, 15), y,
												z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 5, 15)),
										new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
							}
						}
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = TheManOfPlaneModEntities.STEVEHORRORPHASE_1.get().spawn(_level, BlockPos.containing(x + TheManOfPlaneModVariables.MapVariables.get(world).teste1 + Mth.nextDouble(RandomSource.create(), 17, 30), y,
									z + TheManOfPlaneModVariables.MapVariables.get(world).teste2 + Mth.nextDouble(RandomSource.create(), 14, 35)), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:stevehorrore1")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("the_man_of_plane:stevehorrore1")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						TheManOfPlaneModVariables.MapVariables.get(world).tueorfalse1A = true;
						TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
					}
				});
			});
		}
		return TheManOfPlaneModVariables.MapVariables.get(world).CYCLENIGHJT;
	}
}
