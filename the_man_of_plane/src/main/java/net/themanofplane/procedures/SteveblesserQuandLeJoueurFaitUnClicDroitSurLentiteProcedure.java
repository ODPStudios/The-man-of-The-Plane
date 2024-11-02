package net.themanofplane.procedures;

import net.themanofplane.world.inventory.DemandeouiounonMenu;
import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.init.TheManOfPlaneModEntities;
import net.themanofplane.entity.SteveblesserEntity;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import io.netty.buffer.Unpooled;

public class SteveblesserQuandLeJoueurFaitUnClicDroitSurLentiteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (TheManOfPlaneModVariables.MapVariables.get(world).displaychoice == false) {
			if (sourceentity instanceof ServerPlayer _ent) {
				BlockPos _bpos = BlockPos.containing(x, y, z);
				NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
					@Override
					public Component getDisplayName() {
						return Component.literal("Demandeouiounon");
					}

					@Override
					public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
						return new DemandeouiounonMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
		if (TheManOfPlaneModVariables.MapVariables.get(world).animationdeathesteve == true) {
			if (entity instanceof SteveblesserEntity) {
				((SteveblesserEntity) entity).setAnimation("deathe");
			}
			TheManOfPlaneMod.queueServerWork(40, () -> {
				if (!entity.level().isClientSide())
					entity.discard();
			});
		}
		if (TheManOfPlaneModVariables.MapVariables.get(world).aniamtionyessteve == true) {
			if (!entity.level().isClientSide())
				entity.discard();
			TheManOfPlaneModVariables.MapVariables.get(world).animationsuitesteve = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
			TheManOfPlaneMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = TheManOfPlaneModEntities.STEVE.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
					if (entityToSpawn != null) {
						entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
					}
				}
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"effect give @e[type=the_man_of_plane:steve] minecraft:slowness 2 255 true");
			});
		}
	}
}
