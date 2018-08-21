package net.benwoodworth.fastcraft.core.gui.crafting.elements

import com.google.auto.factory.AutoFactory
import com.google.auto.factory.Provided
import net.benwoodworth.fastcraft.core.lang.FastCraftLang
import net.benwoodworth.fastcraft.dependencies.gui.GuiLocation
import net.benwoodworth.fastcraft.dependencies.gui.button.GuiButtonAbstract
import net.benwoodworth.fastcraft.dependencies.item.FcItemBuilder
import net.benwoodworth.fastcraft.dependencies.item.FcItemTypeFactory
import javax.inject.Provider

@AutoFactory
class ButtonWorkbench(
        location: GuiLocation,

        @Provided private val fastCraftLang: FastCraftLang,
        @Provided private val itemBuilder: Provider<FcItemBuilder>,
        @Provided private val itemTypeFactory: FcItemTypeFactory
) : GuiButtonAbstract(location) {

    override fun getItem(location: GuiLocation) = itemBuilder.get()
            .type(itemTypeFactory.getCraftingTable())
            .displayName(fastCraftLang.guiToolbarWorkbenchTitle())
            .lore(fastCraftLang.guiToolbarWorkbenchDescription())
            .build()
}