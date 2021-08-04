package me.cleeryy.wykantplugins.general.book;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class PlayerInteractBookEvent implements Listener {

    // ------------------------------------------------------------
    //  Disallow the player to drop the magic book mamène
    //------------------------------------------------------------
    @EventHandler
    public void onPlayerDropBook(PlayerDropItemEvent e) {
        Player player = (Player) e.getPlayer();
        Item droppedItem = (Item) e.getItemDrop();
        ItemStack droppedItemStack = (ItemStack) droppedItem.getItemStack();

        System.out.println(droppedItemStack.getItemMeta().getDisplayName());

        if (droppedItemStack.getItemMeta().getDisplayName().equals("§6§kaa§2Magic Book§6§kaa")) {
            e.setCancelled(true);
            player.sendMessage(ChatColor.DARK_RED + "You can't drop the magic book :/");
        }
    }

    // ------------------------------------------------------------
    //  Interact with the book to open the magic menu (/magic)
    //------------------------------------------------------------
    @EventHandler
    public void onPlayerClickBook(PlayerInteractEvent e) {
        Player player = e.getPlayer();
        Action action = e.getAction();
        ItemStack current = e.getItem();

        if (current == null) return;
        if (current.getType() == Material.BOOK && current.hasItemMeta() && current.getItemMeta().hasDisplayName() && current.getItemMeta().getDisplayName().equalsIgnoreCase("§6§kaa§2Magic Book§6§kaa")) {
            if (action == Action.LEFT_CLICK_BLOCK || action == Action.RIGHT_CLICK_BLOCK || action == Action.RIGHT_CLICK_AIR || action == Action.LEFT_CLICK_AIR) {
                e.setCancelled(true);
                player.chat("/magic");
            }
        }
    }
}
