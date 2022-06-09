package head;

import commands.sHeal;
import commands.sGamemode;
import events.AutoTable;
import events.CommandNotFound;
import events.LoginAndLogout;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader {
    public static void loadCommands(JavaPlugin plugin) {
        plugin.getCommand("gm").setExecutor(new sGamemode());
        plugin.getCommand("gamemode").setExecutor(new sGamemode());
        plugin.getCommand("heal").setExecutor(new sHeal());
    }
    public static void loadEvents(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new LoginAndLogout(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new CommandNotFound(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new AutoTable(), plugin);
    }
}
