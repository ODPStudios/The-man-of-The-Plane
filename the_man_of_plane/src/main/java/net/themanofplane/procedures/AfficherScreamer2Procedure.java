package net.themanofplane.procedures;

import net.themanofplane.network.TheManOfPlaneModVariables;

import net.minecraft.world.level.LevelAccessor;

public class AfficherScreamer2Procedure {
	public static boolean execute(LevelAccessor world) {
		if (TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 == true) {
			TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_2 = true;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		}
		if (TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_1 == false) {
			TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_2 = false;
			TheManOfPlaneModVariables.MapVariables.get(world).syncData(world);
		}
		return TheManOfPlaneModVariables.MapVariables.get(world).Screamer2_2;
	}
}
