//package net.benwoodworth.fastcraft.gui.crafting.elements
//
//import com.google.auto.factory.AutoFactory
//import com.google.auto.factory.Provided
//import net.benwoodworth.fastcraft.platform.gui.button.GuiButtonAbstract
//import net.benwoodworth.fastcraft.platform.gui.element.GuiLayoutChanger
//import net.benwoodworth.fastcraft.platform.item.FcItemBuilder
//import net.benwoodworth.fastcraft.platform.item.FcItemTypes
//import javax.inject.Provider
//
//@AutoFactory
//class ButtonPage(
//    position: FcGuiPosition,
//
//    @Provided private val fastCraftLang: net.benwoodworth.fastcraft.lang.FastCraftLang,
//    @Provided private val itemBuilder: Provider<FcItemBuilder>,
//    @Provided private val itemTypes: FcItemTypes
//) : GuiButtonAbstract(position) {
//
//    var page by GuiLayoutChanger(0)
//    var pageCount by GuiLayoutChanger(0)
//
//    override fun getItem(position: FcGuiPosition) = itemBuilder.get()
//        .type(itemTypes.getIronSword())
//        .displayName(fastCraftLang.guiToolbarPageTitle(page + 1, pageCount + 1))
//        .lore(fastCraftLang.guiToolbarPageDescription(page + 1, pageCount + 1))
//        .build()
//}
