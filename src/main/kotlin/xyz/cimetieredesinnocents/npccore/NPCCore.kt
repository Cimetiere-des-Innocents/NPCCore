package xyz.cimetieredesinnocents.npccore

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import xyz.cimetieredesinnocents.npccore.entity.EntityLoader

@Mod(NPCCore.ID)
object NPCCore {
    const val ID = "npccore"

    val LOGGER = LogManager.getLogger(ID)

    init {
        EntityLoader.register(MOD_BUS)
    }
}
