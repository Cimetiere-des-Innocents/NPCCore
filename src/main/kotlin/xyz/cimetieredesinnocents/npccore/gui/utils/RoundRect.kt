package xyz.cimetieredesinnocents.npccore.gui.utils

import icyllis.modernui.graphics.Canvas
import icyllis.modernui.graphics.Paint
import icyllis.modernui.graphics.Rect
import icyllis.modernui.graphics.drawable.Drawable
import icyllis.modernui.view.View
import kotlin.math.ceil

class RoundRect(
    private val borderWidth: Int,
    private val borderRadius: Int,
    private val backgroundColor: Int,
    private val borderColor: Int
) : Drawable() {
    constructor(view: View, borderWidth: Float, borderRadius: Float, backgroundColor: Int, borderColor: Int) : this(
        view.dp(borderWidth),
        view.dp(borderRadius),
        backgroundColor,
        borderColor
    )
    override fun draw(canvas: Canvas) {
        val paint = Paint.obtain()
        paint.style = Paint.FILL
        paint.color = backgroundColor
        val inner = borderWidth * 0.5f

        canvas.drawRoundRect(
            bounds.left + inner,
            bounds.top + inner,
            bounds.right - inner,
            bounds.bottom - inner,
            borderRadius.toFloat(),
            paint
        )

        paint.style = Paint.STROKE
        paint.color = borderColor
        paint.strokeWidth = borderWidth.toFloat()

        canvas.drawRoundRect(
            bounds.left + inner,
            bounds.top + inner,
            bounds.right - inner,
            bounds.bottom - inner,
            borderRadius.toFloat(),
            paint
        )

        paint.recycle()
        invalidateSelf()
    }

    override fun getPadding(padding: Rect): Boolean {
        val inner = ceil((borderWidth * 0.5f)).toInt()
        padding.set(inner, inner, inner, inner)
        return true
    }
}