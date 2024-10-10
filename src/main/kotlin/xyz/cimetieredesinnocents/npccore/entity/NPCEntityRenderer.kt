package xyz.cimetieredesinnocents.npccore.entity

import net.minecraft.client.renderer.entity.EntityRendererProvider
import software.bernie.geckolib.model.DefaultedEntityGeoModel
import software.bernie.geckolib.renderer.GeoEntityRenderer
import xyz.cimetieredesinnocents.npccore.NPCCore

class NPCEntityRenderer(
    renderManager: EntityRendererProvider.Context?
) : GeoEntityRenderer<NPCEntity>(
    renderManager,
    DefaultedEntityGeoModel(NPCCore.rl("npc"))
)