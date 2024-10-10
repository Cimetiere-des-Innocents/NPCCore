package xyz.cimetieredesinnocents.npccore.entity

import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.PathfinderMob
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.level.Level

class NPCEntity(entityType: EntityType<out PathfinderMob>, level: Level) : PathfinderMob(entityType, level) {
    companion object {
        fun attributeBuilder() = createMobAttributes()
            .add(Attributes.MAX_HEALTH, 20.0)
            .add(Attributes.MOVEMENT_SPEED, 0.5)
            .add(Attributes.ATTACK_DAMAGE, 2.0)
    }
}