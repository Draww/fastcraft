package net.benwoodworth.fastcraft.bukkit.player

import net.benwoodworth.fastcraft.bukkit.text.Bukkit_113_R01_FcText
import net.benwoodworth.fastcraft.platform.player.FcPlayer
import net.benwoodworth.fastcraft.platform.text.FcText
import net.benwoodworth.fastcraft.util.`as`
import org.bukkit.entity.Player
import java.util.*

@Suppress("ClassName")
class Bukkit_113_R01_FcPlayer(
    val bukkitPlayer: Player
) : FcPlayer {

    override val username: String
        get() = bukkitPlayer.name

    override var customName: String?
        get() = bukkitPlayer.customName
        set(value) {
            bukkitPlayer.customName = value
        }

    override val uuid: UUID
        get() = bukkitPlayer.uniqueId

    override fun sendMessage(message: FcText) {
        val bukkitText = message.`as`<Bukkit_113_R01_FcText>()

        bukkitPlayer.sendRawMessage(bukkitText.rawText)
    }

    override fun hasPermission(permission: String): Boolean {
        return bukkitPlayer.hasPermission(permission)
    }
}
