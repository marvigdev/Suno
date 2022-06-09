package head;

import commands.Heal;
import commands.sGamemode;
import events.CommandNotFound;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader {
    public static void loadCommands(JavaPlugin plugin) {
        plugin.getCommand("gm").setExecutor(new sGamemode());
        plugin.getCommand("sGamemode").setExecutor(new sGamemode());
        plugin.getCommand("heal").setExecutor(new Heal());
    }

    public static void loadEvents(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new CommandNotFound(), plugin);
    }
}
