package net.benwoodworth.fastcraft.platform.text

import net.benwoodworth.fastcraft.util.Extensible

interface FcText : Extensible {

    interface Text : FcText

    interface Translate : FcText
}
