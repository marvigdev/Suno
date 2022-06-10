package head;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin implements Listener {
    Logger logger = Bukkit.getLogger();
    public static Main plugin;
    public static Plugin getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        Loader.loadCommands(this);
        Loader.loadEvents(this);
        logger.warning("§[suno] Started successfully");
    }

    @Override
    public void onDisable() {
        logger.warning("[suno] Stopped successfully");
    }
}
