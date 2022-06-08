package head;

import commands.sGamemode;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    Logger logger = Bukkit.getLogger();

    @Override
    public void onEnable() {
        logger.warning("§[suno] Started successfully");
        getCommand("gm").setExecutor(new sGamemode());
        getCommand("commands.sGamemode").setExecutor(new sGamemode());
    }

    @Override
    public void onDisable() {
        logger.warning("[suno] Stopped successfully");
    }
}
