package net.benwoodworth.fastcraft.bukkit.config

import net.benwoodworth.fastcraft.platform.config.FcConfigBuilderLoaded
import org.bukkit.configuration.file.YamlConfiguration

class Bukkit_113_R01_FcConfigBuilderLoaded(
    private val loadConfig: () -> YamlConfiguration
) : FcConfigBuilderLoaded {

    override fun build(): Bukkit_113_R01_FcConfig {
        return Bukkit_113_R01_FcConfig(loadConfig())
    }
}
