//package net.benwoodworth.fastcraft.gui.crafting.elements
//
//import com.google.auto.factory.AutoFactory
//import com.google.auto.factory.Provided
//import net.benwoodworth.fastcraft.platform.gui.button.GuiButtonAbstract
//import net.benwoodworth.fastcraft.platform.item.FcItemBuilder
//import net.benwoodworth.fastcraft.platform.item.FcItemTypes
//import javax.inject.Provider
//
//@AutoFactory
//class ButtonWorkbench(
//    position: FcGuiPosition,
//
//    @Provided private val fastCraftLang: net.benwoodworth.fastcraft.lang.FastCraftLang,
//    @Provided private val itemBuilder: Provider<FcItemBuilder>,
//    @Provided private val itemTypes: FcItemTypes
//) : GuiButtonAbstract(position) {
//
//    override fun getItem(position: FcGuiPosition) = itemBuilder.get()
//        .type(itemTypes.getCraftingTable())
//        .displayName(fastCraftLang.guiToolbarWorkbenchTitle())
//        .lore(fastCraftLang.guiToolbarWorkbenchDescription())
//        .build()
//}
