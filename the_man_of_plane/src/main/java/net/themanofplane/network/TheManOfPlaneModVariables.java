package net.themanofplane.network;

import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.CompoundTag;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheManOfPlaneModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		TheManOfPlaneMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level());
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (mapdata != null)
					TheManOfPlaneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					TheManOfPlaneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level());
				if (worlddata != null)
					TheManOfPlaneMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "the_man_of_plane_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				TheManOfPlaneMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "the_man_of_plane_mapvars";
		public boolean trueofflaseplane = false;
		public boolean languagefrench = false;
		public boolean languageenglish = false;
		public boolean langualeallow = false;
		public double changedifficult = 0;
		public boolean displaychoice = false;
		public boolean animationdeathesteve = false;
		public boolean aniamtionyessteve = false;
		public boolean animationsuitesteve = false;
		public boolean CYCLENIGHJT = false;
		public boolean cycleflas = true;
		public double teste1 = 0;
		public double teste2 = 0;
		public boolean tueorfalse1A = false;
		public boolean TrueOrFlalseScreamer1 = false;
		public boolean TureorFalsescreamer1_2 = false;
		public boolean Screamer2_1 = false;
		public boolean Screamer2_2 = false;
		public boolean Screamer3_1 = false;
		public boolean Screamer3_2 = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			trueofflaseplane = nbt.getBoolean("trueofflaseplane");
			languagefrench = nbt.getBoolean("languagefrench");
			languageenglish = nbt.getBoolean("languageenglish");
			langualeallow = nbt.getBoolean("langualeallow");
			changedifficult = nbt.getDouble("changedifficult");
			displaychoice = nbt.getBoolean("displaychoice");
			animationdeathesteve = nbt.getBoolean("animationdeathesteve");
			aniamtionyessteve = nbt.getBoolean("aniamtionyessteve");
			animationsuitesteve = nbt.getBoolean("animationsuitesteve");
			CYCLENIGHJT = nbt.getBoolean("CYCLENIGHJT");
			cycleflas = nbt.getBoolean("cycleflas");
			teste1 = nbt.getDouble("teste1");
			teste2 = nbt.getDouble("teste2");
			tueorfalse1A = nbt.getBoolean("tueorfalse1A");
			TrueOrFlalseScreamer1 = nbt.getBoolean("TrueOrFlalseScreamer1");
			TureorFalsescreamer1_2 = nbt.getBoolean("TureorFalsescreamer1_2");
			Screamer2_1 = nbt.getBoolean("Screamer2_1");
			Screamer2_2 = nbt.getBoolean("Screamer2_2");
			Screamer3_1 = nbt.getBoolean("Screamer3_1");
			Screamer3_2 = nbt.getBoolean("Screamer3_2");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("trueofflaseplane", trueofflaseplane);
			nbt.putBoolean("languagefrench", languagefrench);
			nbt.putBoolean("languageenglish", languageenglish);
			nbt.putBoolean("langualeallow", langualeallow);
			nbt.putDouble("changedifficult", changedifficult);
			nbt.putBoolean("displaychoice", displaychoice);
			nbt.putBoolean("animationdeathesteve", animationdeathesteve);
			nbt.putBoolean("aniamtionyessteve", aniamtionyessteve);
			nbt.putBoolean("animationsuitesteve", animationsuitesteve);
			nbt.putBoolean("CYCLENIGHJT", CYCLENIGHJT);
			nbt.putBoolean("cycleflas", cycleflas);
			nbt.putDouble("teste1", teste1);
			nbt.putDouble("teste2", teste2);
			nbt.putBoolean("tueorfalse1A", tueorfalse1A);
			nbt.putBoolean("TrueOrFlalseScreamer1", TrueOrFlalseScreamer1);
			nbt.putBoolean("TureorFalsescreamer1_2", TureorFalsescreamer1_2);
			nbt.putBoolean("Screamer2_1", Screamer2_1);
			nbt.putBoolean("Screamer2_2", Screamer2_2);
			nbt.putBoolean("Screamer3_1", Screamer3_1);
			nbt.putBoolean("Screamer3_2", Screamer3_2);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				TheManOfPlaneMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
