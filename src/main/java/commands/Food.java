package commands;

import head.Main;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

public class Food implements CommandExecutor{

    @Override
    @Deprecated
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
        Player p = (Player)Sender;
        if(Cmd.getName().equalsIgnoreCase("food")){
            if(Args.length == 0) {
                p.sendTitle("§aAguarde 5 segundos!", "§cDebuff temporario antes da §acomidinha§c...", 1, 20, 1);
                p.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 100, 100));
                p.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, 100, 200));
                p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 200));
                new BukkitRunnable(){
                    public void run() {
                        p.sendTitle("§aAguarde 4 segundos!", "§cDebuff temporario antes da §acomidinha§c...", 1, 20, 1);

                    }
                }.runTaskLater(Main.plugin, 20);
                new BukkitRunnable(){
                    public void run() {
                        p.sendTitle("§aAguarde 3 segundos!", "§cDebuff temporario antes da §acomidinha§c...", 1, 20, 1);

                    }
                }.runTaskLater(Main.plugin, 40);
                new BukkitRunnable(){
                    public void run() {
                        p.sendTitle("§aAguarde 2 segundos!", "§cDebuff temporario antes da §acomidinha§c...", 1, 20, 1);

                    }
                }.runTaskLater(Main.plugin, 60);
                    new BukkitRunnable(){
                        public void run() {
                            p.sendTitle("§aAguarde 1 segundo!", "§cDebuff temporario antes da §acomidinha§c...", 1, 20, 1);

                        }
                    }.runTaskLater(Main.plugin, 80);
                new BukkitRunnable(){
                    public void run() {
                        p.setFoodLevel(20);
                    }
                }.runTaskLater(Main.plugin, 100);
                return true;
            }
        }
        return false;
    }
}


