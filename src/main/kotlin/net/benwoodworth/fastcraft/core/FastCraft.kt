package net.benwoodworth.fastcraft.core

import net.benwoodworth.fastcraft.core.gui.FastCraftGui
import net.benwoodworth.fastcraft.dependencies.abstractions.event.EventPlayerJoin
import net.benwoodworth.fastcraft.dependencies.abstractions.event.EventPluginDisable
import net.benwoodworth.fastcraft.dependencies.abstractions.event.EventPluginEnable
import net.benwoodworth.fastcraft.dependencies.abstractions.event.Listener
import net.benwoodworth.fastcraft.dependencies.abstractions.server.Task
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

/**
 * The core class of FastCraft.
 */
@Singleton
class FastCraft @Inject constructor(
        listenerPluginEnable: Listener<EventPluginEnable>,
        listenerPluginDisable: Listener<EventPluginDisable>,
        listenerPlayerJoin: Listener<EventPlayerJoin>,

        private val taskBuilder: Provider<Task.Builder>,
        private val fastCraftGui: Provider<FastCraftGui>
) {

    init {
        listenerPluginEnable += this::onPluginEnable
        listenerPluginDisable += this::onPluginDisable
        listenerPlayerJoin += this::onPlayerJoin
    }

    private fun onPluginEnable() {
        println("FASTCRAFT ENABLED")
    }

    private fun onPluginDisable() {
        println("FASTCRAFT DISABLED")
    }

    private fun onPlayerJoin(event: EventPlayerJoin) {
        taskBuilder.get()
                .delay(1).execute {
            fastCraftGui.get().open(event.player)
        }
    }
}
