package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PanneauspawnProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "say ccaca");
		TheManOfPlaneMod.queueServerWork(200, () -> {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"say ccacdfdfddfa");
			if (TheManOfPlaneModVariables.MapVariables.get(world).languagefrench == true) {
				if (Mth.nextDouble(RandomSource.create(), 1, 3) == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauvf1"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"say ccacdfdfddfa");
				} else if (Mth.nextDouble(RandomSource.create(), 1, 3) == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauvf2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"say ccacdfdfddfa");
				} else if (Mth.nextDouble(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));;
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"say ccacdfdfddfa");
				}
			}
			if (TheManOfPlaneModVariables.MapVariables.get(world).languageenglish == true) {
				if (Mth.nextDouble(RandomSource.create(), 1, 3) == 1) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauen2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 3) == 2) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauen2"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				} else if (Mth.nextDouble(RandomSource.create(), 1, 3) == 3) {
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("the_man_of_plane", "panneauen3"));
						if (template != null) {
							template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.getRandom(_serverworld.random)).setMirror(Mirror.values()[_serverworld.random.nextInt(2)]).setIgnoreEntities(false), _serverworld.random, 3);
						}
					}
				}
			}
		});
	}
}
