package xyz.cimetieredesinnocents.npccore.entity

import net.minecraft.core.registries.Registries
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.MobCategory
import net.neoforged.bus.api.IEventBus
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent
import net.neoforged.neoforge.registries.DeferredHolder
import net.neoforged.neoforge.registries.DeferredRegister
import thedarkcolour.kotlinforforge.neoforge.forge.getValue
import xyz.cimetieredesinnocents.npccore.NPCCore

@EventBusSubscriber(modid = NPCCore.ID, bus = EventBusSubscriber.Bus.MOD)
object EntityLoader {
    private val ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, NPCCore.ID)

    private fun <T : Entity> register(
        name: String,
        builder: EntityType.Builder<T>
    ): DeferredHolder<EntityType<*>, EntityType<T>> {
        return ENTITY_TYPES.register(name) { -> builder.build(name) }
    }

    fun register(bus: IEventBus) {
        ENTITY_TYPES.register(bus)
    }

    val NPC by register("npc", EntityType.Builder.of(::NPCEntity, MobCategory.MISC))

    @SubscribeEvent
    fun onAttributesSetup(event: EntityAttributeCreationEvent) {
        event.put(NPC, NPCEntity.attributeBuilder().build())
    }
}