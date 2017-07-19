package net.benwoodworth.fastcraft.dependencies.item.recipe

import net.benwoodworth.fastcraft.dependencies.item.Item
import net.benwoodworth.fastcraft.dependencies.player.Player

/**
 * A Minecraft crafting recipe.
 */
interface Recipe {

    /**
     * Get [RecipePrepared]s that are possible to craft with
     * the given items.
     *
     * @param items the items available to craft with
     * @return a list of possible recipes
     */
    fun prepare(player: Player, vararg items: Item): List<RecipePrepared>

    /**
     * Check if this recipe is equal to an object.
     *
     * @param other the object to compare to
     * @return `true` if the recipe are equal
     */
    override fun equals(other: Any?): Boolean

    /**
     * Generates a hash code for this recipe.
     *
     * @return the hash code
     */
    override fun hashCode(): Int
}

