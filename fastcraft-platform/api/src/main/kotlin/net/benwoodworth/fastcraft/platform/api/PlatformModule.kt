package net.benwoodworth.fastcraft.platform.api

import net.benwoodworth.fastcraft.platform.api.config.FcConfigBuilder
import net.benwoodworth.fastcraft.platform.api.gui.FcGuiBuilder
import net.benwoodworth.fastcraft.platform.api.item.FcItemBuilder
import net.benwoodworth.fastcraft.platform.api.item.FcItemTypes
import net.benwoodworth.fastcraft.platform.api.player.FcPlayerProvider
import net.benwoodworth.fastcraft.platform.api.recipe.FcRecipeService
import net.benwoodworth.fastcraft.platform.api.server.FcLogger
import net.benwoodworth.fastcraft.platform.api.server.FcTaskBuilder
import java.nio.file.Path

interface PlatformModule {

    fun getLogger(): FcLogger

    fun getConfigPath(): Path

    fun getPluginDirectory(): Path

    fun createConfigBuilder(): FcConfigBuilder

    fun createGuiBuilder(): FcGuiBuilder

    fun createItemBuilder(): FcItemBuilder

    fun getItemTypes(): FcItemTypes

    fun getPlayerProvider(): FcPlayerProvider

    fun getRecipeService(): FcRecipeService

    fun createTaskBuilder(): FcTaskBuilder
}
