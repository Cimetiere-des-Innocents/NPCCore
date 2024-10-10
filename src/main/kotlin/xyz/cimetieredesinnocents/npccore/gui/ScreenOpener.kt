package xyz.cimetieredesinnocents.npccore.gui

import net.minecraft.client.Minecraft
import net.minecraft.client.gui.screens.Screen

object ScreenOpener {
    fun open(screen: Screen) =
        Minecraft.getInstance().setScreen(screen)
}