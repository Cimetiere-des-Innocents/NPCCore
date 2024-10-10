package xyz.cimetieredesinnocents.npccore.entity

import icyllis.modernui.mc.neoforge.MuiForgeApi
import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResult
import net.minecraft.world.entity.EntityType
import net.minecraft.world.entity.PathfinderMob
import net.minecraft.world.entity.ai.attributes.Attributes
import net.minecraft.world.entity.player.Player
import net.minecraft.world.level.Level
import net.minecraft.world.phys.Vec3
import software.bernie.geckolib.animatable.GeoEntity
import software.bernie.geckolib.animation.AnimatableManager
import software.bernie.geckolib.util.GeckoLibUtil
import xyz.cimetieredesinnocents.npccore.gui.NPCFragment

class NPCEntity(entityType: EntityType<out PathfinderMob>, level: Level) : PathfinderMob(entityType, level), GeoEntity {
    companion object {
        fun attributeBuilder() = createMobAttributes()
            .add(Attributes.MAX_HEALTH, 20.0)
            .add(Attributes.MOVEMENT_SPEED, 0.5)
            .add(Attributes.ATTACK_DAMAGE, 2.0)
    }

    private val geoCache = GeckoLibUtil.createInstanceCache(this)

    override fun registerControllers(controllers: AnimatableManager.ControllerRegistrar?) {
    }

    override fun getAnimatableInstanceCache() = geoCache

    override fun interactAt(player: Player, vec: Vec3, hand: InteractionHand): InteractionResult {
        val isClientSide = player.level().isClientSide
        if (!isClientSide) {
            return InteractionResult.SUCCESS
        }
        MuiForgeApi.openScreen(NPCFragment())
        return InteractionResult.SUCCESS
    }
}