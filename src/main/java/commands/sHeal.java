package commands;

import head.Loader;
import head.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class sHeal implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
        Player p = (Player)Sender;
        if(Cmd.getName().equalsIgnoreCase("heal")){
            if(Args.length == 0) {
                p.sendTitle("Aguarde 3 segundos!", "Debuff temporario antes da cura...", 3, 100, 3);
                p.setHealth(1);
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200));
               new BukkitRunnable(){
                   public void run() {
                       p.removePotionEffect(PotionEffectType.BLINDNESS);
                       p.setHealth(20);
                   }
               }.runTaskLater(Main.plugin, 60L);
                return true;
            }
            Player t = Bukkit.getPlayer(Args[1]);
            if((t == null || (!(t instanceof Player)))){
                t.sendMessage("§cEscolha um player dentre os online");
                return true;
            }
            if(Args.length > 1) {
                p.getHealth();
                p.sendMessage("§aVoce curou o §c" + t.getName() + " §acom sucesso");
                t.sendMessage("§aVoce foi curado  pelo §c" + p.getName() + " §acom sucesso");
                return true;
            }
        }
        return false;
    }
}


