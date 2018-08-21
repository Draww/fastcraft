package net.benwoodworth.fastcraft.platform.item

/**
 * A factory for creating item types.
 */
interface FcItemTypeFactory {

    fun getIronSword(): FcItemType

    fun getCraftingTable(): FcItemType

    fun getAnvil(): FcItemType

    fun getNetherStar(): FcItemType
}