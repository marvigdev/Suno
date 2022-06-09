package events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class LoginAndLogout implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage("§7[§a+§7] §a" + e.getPlayer().getDisplayName());
        e.getPlayer().sendTitle("§l§aBem vindo!", "§l§cAguarde um tempo para o debuff sair...", 1, 100, 1);
        e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200));
        e.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 200));
    }
    @EventHandler
    public void PlayerLeft(PlayerQuitEvent e){
        e.setQuitMessage("§7[§c+§7] §c" + e.getPlayer().getDisplayName());
    }
}
