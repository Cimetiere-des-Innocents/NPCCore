package xyz.cimetieredesinnocents.npccore.gui

import icyllis.modernui.fragment.Fragment
import icyllis.modernui.util.DataSet
import icyllis.modernui.view.LayoutInflater
import icyllis.modernui.view.View
import icyllis.modernui.view.ViewGroup
import icyllis.modernui.view.ViewGroup.LayoutParams.MATCH_PARENT
import icyllis.modernui.widget.LinearLayout
import xyz.cimetieredesinnocents.npccore.gui.utils.RoundRect
import xyz.cimetieredesinnocents.npccore.utils.ColorUtils

class NPCFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: DataSet?): View {
        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL
        val content = LinearLayout(context)
        content.background = RoundRect(
            layout,
            2f,
            8f,
            ColorUtils.rgb(0xd0d0d0),
            ColorUtils.rgb(0x303030)
        )
        val params = LinearLayout.LayoutParams(MATCH_PARENT, MATCH_PARENT)
        val dp8 = layout.dp(32f)
        params.setMargins(dp8, dp8, dp8, dp8)
        layout.addView(content, params)
        return layout
    }
}