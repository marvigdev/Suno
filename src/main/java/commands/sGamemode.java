package commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class sGamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {

        Player p = (Player)Sender;
        if(Cmd.getName().equalsIgnoreCase("gamemode") || Cmd.getName().equalsIgnoreCase("gm")){
            if(Args.length == 0){
                p.sendMessage("Comando incorreto use §c[ /gamemode (1 | 0)");
                return true;
            }
            if(Args[0].equalsIgnoreCase("1")){
                p.setGameMode(GameMode.CREATIVE);
                p.sendMessage("Seu gamemode foi alterado");
            }
            if(Args[0].equalsIgnoreCase("0")){
                p.setGameMode(GameMode.SURVIVAL);
                p.sendMessage("Seu gamemode foi alterado");
            }
        }
        return false;
    }
}
