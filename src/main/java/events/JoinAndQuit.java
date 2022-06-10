package events;

import head.Main;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class JoinAndQuit implements Listener {
    @EventHandler
    @Deprecated
    public void PlayerJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        p.sendTitle("§l§aBem vindo!", "§l§cAguarde 5s para o debuff sair...", 1, 20, 1);
        p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200));
        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 200));
        p.setMaxHealth(1);
        new BukkitRunnable(){
            public void run() {
                p.sendTitle("§l§aBem vindo!", "§l§cAguarde 4s para o debuff sair...", 1, 20, 1);
            }
        }.runTaskLater(Main.plugin, 20);
        new BukkitRunnable(){
            public void run() {
                p.sendTitle("§l§aBem vindo!", "§l§cAguarde 3s para o debuff sair...", 1, 20, 1);
            }
        }.runTaskLater(Main.plugin, 40);
        new BukkitRunnable(){
            public void run() {
                p.sendTitle("§l§aBem vindo!", "§l§cAguarde 2s para o debuff sair...", 1, 20, 1);
            }
        }.runTaskLater(Main.plugin, 60);
        new BukkitRunnable(){
            public void run() {
                p.sendTitle("§l§aBem vindo!", "§l§cAguarde 1s para o debuff sair...", 1, 20, 1);
            }
        }.runTaskLater(Main.plugin, 80);
        new BukkitRunnable(){
            public void run() {
                p.setMaxHealth(20);
                p.setHealth(20);
                Bukkit.getServer().broadcastMessage("§7[§a+§7] §a" + e.getPlayer().getDisplayName());
                p.playSound(p.getLocation(), Sound.ENTITY_EXPERIENCE_ORB_PICKUP, 100, 0);
            }
        }.runTaskLater(Main.plugin, 100);
    }
    @EventHandler
    public void PlayerLeft(PlayerQuitEvent e){
        e.setQuitMessage("§7[§c+§7] §c" + e.getPlayer().getDisplayName());
    }
}
