package xyz.cimetieredesinnocents.npccore.loaders

import net.minecraft.client.renderer.entity.EntityRenderers
import net.neoforged.bus.api.SubscribeEvent
import net.neoforged.fml.common.EventBusSubscriber
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent
import xyz.cimetieredesinnocents.npccore.NPCCore
import xyz.cimetieredesinnocents.npccore.entity.NPCEntityRenderer
import xyz.cimetieredesinnocents.npccore.utils.FpUtils

@EventBusSubscriber(modid = NPCCore.ID, bus = EventBusSubscriber.Bus.MOD)
object EntityModelLoader {

    @SubscribeEvent
    fun registerEntityRenderers(event: FMLClientSetupEvent) =
        FpUtils.discard(event.enqueueWork {
            EntityRenderers.register(EntityLoader.NPC, ::NPCEntityRenderer)
        })
}
