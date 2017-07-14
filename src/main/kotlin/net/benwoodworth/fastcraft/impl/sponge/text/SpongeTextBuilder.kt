package net.benwoodworth.fastcraft.impl.sponge.text

import net.benwoodworth.fastcraft.dependencies.text.Text
import net.benwoodworth.fastcraft.dependencies.text.TextBuilder
import net.benwoodworth.fastcraft.dependencies.text.TextColor
import net.benwoodworth.fastcraft.util.Adapter
import org.spongepowered.api.text.LiteralText

/**
 * Adapts the Sponge LiteralText builder.
 */
class SpongeTextBuilder(
        baseBuilder: LiteralText.Builder
) : TextBuilder, Adapter<LiteralText.Builder>(baseBuilder) {

    override fun build(): Text {
        return SpongeText(base.build())
    }

    override fun text(text: String): TextBuilder {
        base.content(text)
        return this
    }

    override fun addExtra(vararg extra: Text): TextBuilder {
        base.append(extra.map {
            (it as SpongeText).base
        })
        return this
    }

    override fun color(color: TextColor?): TextBuilder {
        base.color((color as SpongeTextColor).base)
        return this
    }

    override fun bold(bold: Boolean): TextBuilder {
        base.style.bold(bold)
        return this
    }

    override fun italic(italic: Boolean): TextBuilder {
        base.style.italic(italic)
        return this
    }

    override fun underlined(underlined: Boolean): TextBuilder {
        base.style.underline(underlined)
        return this
    }

    override fun strikeThrough(strikeThrough: Boolean): TextBuilder {
        base.style.strikethrough(strikeThrough)
        return this
    }

    override fun obfuscated(obfuscated: Boolean): TextBuilder {
        base.style.obfuscated(obfuscated)
        return this
    }
}