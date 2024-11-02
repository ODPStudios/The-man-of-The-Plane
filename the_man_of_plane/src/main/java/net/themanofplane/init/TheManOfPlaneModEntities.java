
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.themanofplane.init;

import net.themanofplane.entity.Stevehorrorphase1Entity;
import net.themanofplane.entity.SteveblesserEntity;
import net.themanofplane.entity.SteveHorrorPhase2Entity;
import net.themanofplane.entity.SteveEntity;
import net.themanofplane.entity.PlaneEntity;
import net.themanofplane.entity.Cadavre2Entity;
import net.themanofplane.entity.Cadavre1Entity;
import net.themanofplane.TheManOfPlaneMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheManOfPlaneModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TheManOfPlaneMod.MODID);
	public static final RegistryObject<EntityType<PlaneEntity>> PLANE = register("plane",
			EntityType.Builder.<PlaneEntity>of(PlaneEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(36).setUpdateInterval(3).setCustomClientFactory(PlaneEntity::new).fireImmune().sized(1.1f, 2.2f));
	public static final RegistryObject<EntityType<Cadavre1Entity>> CADAVRE_1 = register("cadavre_1",
			EntityType.Builder.<Cadavre1Entity>of(Cadavre1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cadavre1Entity::new).fireImmune().sized(0.6f, 1.6f));
	public static final RegistryObject<EntityType<Cadavre2Entity>> CADAVRE_2 = register("cadavre_2",
			EntityType.Builder.<Cadavre2Entity>of(Cadavre2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Cadavre2Entity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<SteveEntity>> STEVE = register("steve",
			EntityType.Builder.<SteveEntity>of(SteveEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveEntity::new).fireImmune().sized(2.1f, 1.8f));
	public static final RegistryObject<EntityType<SteveblesserEntity>> STEVEBLESSER = register("steveblesser", EntityType.Builder.<SteveblesserEntity>of(SteveblesserEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveblesserEntity::new).fireImmune().sized(2f, 2.1f));
	public static final RegistryObject<EntityType<Stevehorrorphase1Entity>> STEVEHORRORPHASE_1 = register("stevehorrorphase_1",
			EntityType.Builder.<Stevehorrorphase1Entity>of(Stevehorrorphase1Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Stevehorrorphase1Entity::new)

					.sized(0.9f, 1.8f));
	public static final RegistryObject<EntityType<SteveHorrorPhase2Entity>> STEVE_HORROR_PHASE_2 = register("steve_horror_phase_2",
			EntityType.Builder.<SteveHorrorPhase2Entity>of(SteveHorrorPhase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SteveHorrorPhase2Entity::new)

					.sized(0.9f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			PlaneEntity.init();
			Cadavre1Entity.init();
			Cadavre2Entity.init();
			SteveEntity.init();
			SteveblesserEntity.init();
			Stevehorrorphase1Entity.init();
			SteveHorrorPhase2Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(PLANE.get(), PlaneEntity.createAttributes().build());
		event.put(CADAVRE_1.get(), Cadavre1Entity.createAttributes().build());
		event.put(CADAVRE_2.get(), Cadavre2Entity.createAttributes().build());
		event.put(STEVE.get(), SteveEntity.createAttributes().build());
		event.put(STEVEBLESSER.get(), SteveblesserEntity.createAttributes().build());
		event.put(STEVEHORRORPHASE_1.get(), Stevehorrorphase1Entity.createAttributes().build());
		event.put(STEVE_HORROR_PHASE_2.get(), SteveHorrorPhase2Entity.createAttributes().build());
	}
}
