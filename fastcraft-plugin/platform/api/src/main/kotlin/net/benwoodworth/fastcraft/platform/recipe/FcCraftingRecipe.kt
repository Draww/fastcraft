package net.benwoodworth.fastcraft.platform.recipe

import net.benwoodworth.fastcraft.platform.item.FcItem
import net.benwoodworth.fastcraft.platform.player.FcPlayer
import net.benwoodworth.fastcraft.util.Grid

/**
 * A Minecraft crafting recipe.
 */
interface FcCraftingRecipe {

    /**
     * An ID unique to this recipe. `namespace:id`
     */
    val id: String

    /**
     * The ingredients required to craft this recipe.
     */
    val ingredients: Grid<FcIngredient>

    /**
     * Get the preview results, before actually crafting the recipe.
     *
     * @param player the player preparing the recipe.
     * @param items the grid of items used to prepare the recipe.
     * @return the prepared recipe, or `null` if unable to prepare.
     */
    fun prepare(player: FcPlayer, items: Grid<FcItem>): Prepared?

    /**
     * Check if this recipe is equal to an object.
     *
     * @param other the object to compare to.
     * @return `true` iff the recipes are equal.
     */
    override fun equals(other: Any?): Boolean

    /**
     * Generates a hash code for this recipe.
     *
     * @return the hash code.
     */
    override fun hashCode(): Int

    /**
     * A prepared recipe. Represents a recipe that has been put
     * into a crafting table, with crafting grid items and results
     * given an opportunity to be modified by other plugins.
     */
    interface Prepared {

        /**
         * The player the recipe was prepared for.
         */
        val player: FcPlayer

        /**
         * The recipe being prepared.
         */
        val recipe: FcCraftingRecipe

        /**
         * The prepared item grid.
         */
        val items: Grid<FcItem>

        /**
         * The prepared results.
         */
        val results: List<FcItem>

        /**
         * Craft the prepared recipe. Simulates crafting as if shift
         * clicking the result slot of the crafting inventory.
         *
         * @return the crafted items, or null if unable to craft.
         */
        fun craft(): List<FcItem>?
    }
}

