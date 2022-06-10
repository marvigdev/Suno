package commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command Cmd, String Label, String[] Args) {
        Player p = (Player)Sender;
        if(Cmd.getName().equalsIgnoreCase("gamemode") || Cmd.getName().equalsIgnoreCase("gm")){
            if(Args.length == 0){
                if (p.getGameMode() == GameMode.CREATIVE) {
                    p.setGameMode(GameMode.SURVIVAL);
                    p.sendMessage("§aSeu gamemode foi alterado");
                } else {
                    p.setGameMode(GameMode.CREATIVE);
                    p.sendMessage("§aSeu gamemode foi alterado");
                }
                return true;
            }
        }
        return false;
    }
}
