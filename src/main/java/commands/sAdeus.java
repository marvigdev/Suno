package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sAdeus implements CommandExecutor {
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
        Player p = (Player)Sender;
        p.getPlayer().sendActionBar("hii");
    }
}
