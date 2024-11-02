package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;
import net.themanofplane.entity.SteveEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class SteveQuandLeJoueurEntreEnCollisionAvecLentiteProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (TheManOfPlaneModVariables.MapVariables.get(world).animationsuitesteve == true) {
			if (entity instanceof SteveEntity) {
				((SteveEntity) entity).setAnimation("help");
			}
			TheManOfPlaneModVariables.MapVariables.get(world).animationsuitesteve = false;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
