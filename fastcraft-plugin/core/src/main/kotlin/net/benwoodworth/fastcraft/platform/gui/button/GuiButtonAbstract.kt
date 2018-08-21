package net.benwoodworth.fastcraft.platform.gui.button

import net.benwoodworth.fastcraft.platform.event.FcListener
import net.benwoodworth.fastcraft.platform.gui.GuiRegion
import net.benwoodworth.fastcraft.platform.gui.element.GuiElementAbstract
import net.benwoodworth.fastcraft.platform.gui.event.GuiEventClick

/**
 * An abstract implementation of [GuiButton].
 */
abstract class GuiButtonAbstract(
        region: GuiRegion.Positioned
) : GuiElementAbstract<GuiRegion.Positioned>(region), GuiButton {

    override val clickListener = FcListener<GuiEventClick>()

    /**
     * Handles this button's clicks.
     * Runs before [clickListener] handlers are notified.
     *
     * @param event the click event.
     */
    open fun onClick(event: GuiEventClick) = Unit

    override fun click(event: GuiEventClick) {
        click(event)
        clickListener.notifyHandlers(event)
    }
}
