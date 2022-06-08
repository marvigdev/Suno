package head;

import commands.sGamemode;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {
    Logger logger = Bukkit.getLogger();

    @Override
    public void onEnable() {
        Loader.loadCommands(this);
        Loader.loadEvents(this);

        logger.warning("§[suno] Started successfully");
    }

    @Override
    public void onDisable() {
        logger.warning("[suno] Stopped successfully");
    }
}
