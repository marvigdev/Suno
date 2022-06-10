package events;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public final class AutoRestart extends JavaPlugin {
    @Override
    public void onEnable() {
        System.out.println("[suno] Restarted sucessfuly");
    }
}
