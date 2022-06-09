package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Heal implements CommandExecutor{

    @Override
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {

        Player p = (Player)Sender;

        if(Cmd.getName().equalsIgnoreCase("heal")){
            if(Args.length == 0) {
                p.sendMessage("Curado com sucesso.");
                p.setHealth(20);
                return true;
            }
            if(Args.length > 1) {
                Player t = Bukkit.getPlayerExact(Args[0]);
                t.setHealth(20);
                p.sendMessage("Voce curou o " + t.getName() + " com sucesso");
                t.sendMessage("Voce foi curado  pelo " + p.getName() + " com sucesso");
                return true;
            }
        }
        return false;
    }
}


