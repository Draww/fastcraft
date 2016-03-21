package co.kepler.fastcraftplus;

import co.kepler.fastcraftplus.crafting.RecipeUtil;
import co.kepler.fastcraftplus.gui.GUI;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class FastCraft extends JavaPlugin implements Listener {
    private static FastCraft instance;

    /**
     * Get an instance of FastCraft.
     *
     * @return Returns an instance of FastCraft.
     */
    public static FastCraft getInstance() {
        return instance;
    }

    public static void log(Level level, String msg) {
        instance.getLogger().log(level, msg);
    }

    public static void logInfo(String msg) {
        instance.getLogger().info(msg);
    }

    @Override
    public void onEnable() {
        instance = this;

        Bukkit.getPluginManager().registerEvents(new TestListener(), this);

        RecipeUtil.init();
    }

    @Override
    public void onDisable() {
        GUI.disposeAll();
    }
}
