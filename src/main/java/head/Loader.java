package head;

import commands.Food;
import commands.Heal;
import commands.Gamemode;
import events.AutoTable;
import events.CommandNotFound;
import events.JoinAndQuit;
import org.bukkit.plugin.java.JavaPlugin;

public class Loader {
    public static void loadCommands(JavaPlugin plugin) {
        plugin.getCommand("gm").setExecutor(new Gamemode());
        plugin.getCommand("gamemode").setExecutor(new Gamemode());
        plugin.getCommand("heal").setExecutor(new Heal());
        plugin.getCommand("food").setExecutor(new Food());
    }
    public static void loadEvents(JavaPlugin plugin) {
        plugin.getServer().getPluginManager().registerEvents(new JoinAndQuit(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new CommandNotFound(), plugin);
        plugin.getServer().getPluginManager().registerEvents(new AutoTable(), plugin);
    }
}
