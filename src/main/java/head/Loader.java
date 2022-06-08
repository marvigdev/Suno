package head;

import commands.sGamemode;
import events.CommandNotFound;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader {
    public static void loadCommands(JavaPlugin plugin) {
        plugin.getCommand("gm").setExecutor(new sGamemode());
        plugin.getCommand("commands.sGamemode").setExecutor(new sGamemode());
    }

    public static void loadEvents(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new CommandNotFound(), plugin);
    }
}
