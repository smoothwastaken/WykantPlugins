package me.cleeryy.wykantplugins.general.events;

import com.sun.org.apache.xml.internal.security.keys.content.SPKIData;
import me.cleeryy.wykantplugins.Main;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class MagicEvent implements Listener {

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Inventory inv = e.getInventory();
        Player player = (Player) e.getWhoClicked();
        PersistentDataContainer playerTeamData = player.getPersistentDataContainer();
        ItemStack current = e.getCurrentItem();

        if (current == null) return;

        if (inv.getSize() != 45) return;

        e.setCancelled(true);

    }
}
