package events;

import head.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
public class AutoTable implements Listener {
    @EventHandler
    public void openTable(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (e.getAction().equals(Action.RIGHT_CLICK_AIR) && p.getInventory().getItemInMainHand().getType().equals(Material.CRAFTING_TABLE)){
            p.openWorkbench(null, true);
        }
    }
}
