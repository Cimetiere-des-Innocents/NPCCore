package xyz.cimetieredesinnocents.npccore

import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

/**
 * Main mod class.
 *
 * An example for blocks is in the `blocks` package of this mod.
 */
@Mod(NpcCore.ID)
object NpcCore {
    const val ID = "npccore"

    // the logger for our mod
    val LOGGER: Logger = LogManager.getLogger(ID)
}
