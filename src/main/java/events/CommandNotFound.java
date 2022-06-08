package events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.help.HelpTopic;

public class CommandNotFound implements Listener {
    public void onPlayerCommandPreprocess(final PlayerCommandPreprocessEvent e) {

        if (!e.isCancelled()) {
            final Player player = e.getPlayer();
            final String cmd = e.getMessage().split(" ")[0];
            final HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(cmd);
            if (topic == null) {

                player.sendMessage("§l§cComando não encontrado.");
                e.setCancelled(true);
            }
        }
    }
}
