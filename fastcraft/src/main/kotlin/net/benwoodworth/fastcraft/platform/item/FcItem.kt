package net.benwoodworth.fastcraft.platform.item

import net.benwoodworth.fastcraft.platform.text.FcText
import net.benwoodworth.fastcraft.util.Extensible

/**
 * A Minecraft item.
 */
interface FcItem : Extensible {

    val type: FcItemType

    val amount: Int

    val name: FcText

    val displayName: FcText?

    val lore: List<FcText>?

    val maxStackSize: Int

    val durability: Int
}
