package xyz.cimetieredesinnocents.npccore

import net.minecraft.resources.ResourceLocation
import net.neoforged.fml.common.Mod
import org.apache.logging.log4j.LogManager
import thedarkcolour.kotlinforforge.neoforge.forge.MOD_BUS
import xyz.cimetieredesinnocents.npccore.loaders.BlockLoader
import xyz.cimetieredesinnocents.npccore.loaders.CreativeTabLoader
import xyz.cimetieredesinnocents.npccore.loaders.EntityLoader
import xyz.cimetieredesinnocents.npccore.loaders.ItemLoader

@Mod(NPCCore.ID)
object NPCCore {
    const val ID = "npccore"

    val LOGGER = LogManager.getLogger(ID)

    init {
        CreativeTabLoader.register(MOD_BUS)
        ItemLoader.register(MOD_BUS)
        BlockLoader.register(MOD_BUS)
        EntityLoader.register(MOD_BUS)
    }

    fun rl(path: String) = ResourceLocation.fromNamespaceAndPath(ID, path)
}
