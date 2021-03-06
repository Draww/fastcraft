package net.benwoodworth.fastcraft.platform

import net.benwoodworth.fastcraft.platform.config.FcConfigBuilder
import net.benwoodworth.fastcraft.platform.gui.FcGuiBuilder
import net.benwoodworth.fastcraft.platform.item.FcItemBuilder
import net.benwoodworth.fastcraft.platform.item.FcItemTypes
import net.benwoodworth.fastcraft.platform.player.FcPlayerProvider
import net.benwoodworth.fastcraft.platform.recipe.FcRecipeService
import net.benwoodworth.fastcraft.platform.server.FcLogger
import net.benwoodworth.fastcraft.platform.server.FcPluginData
import net.benwoodworth.fastcraft.platform.server.FcTaskBuilder
import net.benwoodworth.fastcraft.platform.text.FcTextBuilder
import net.benwoodworth.fastcraft.util.Extensible

interface PlatformDependencies : Extensible {

    fun getLogger(): FcLogger

    fun getPluginData(): FcPluginData

    fun createConfigBuilder(): FcConfigBuilder

    fun createGuiBuilder(): FcGuiBuilder

    fun createItemBuilder(): FcItemBuilder

    fun getItemTypes(): FcItemTypes

    fun getPlayerProvider(): FcPlayerProvider

    fun getRecipeService(): FcRecipeService

    fun createTaskBuilder(): FcTaskBuilder

    fun createTextBuilder(): FcTextBuilder
}
