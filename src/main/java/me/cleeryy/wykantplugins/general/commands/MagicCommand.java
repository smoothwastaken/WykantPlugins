package me.cleeryy.wykantplugins.general.commands;


import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import javax.naming.Name;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class MagicCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // INVENTORY OPTIONS AND ITEMS
            Inventory magicInventory = Bukkit.createInventory(player, 45, "§8[§2Magic§8] §6§lMenu");

            // ----------------------------------------------
            // TEAMs ITEMs and DATAs
            // ----------------------------------------------

            // PERSISTANT TEAM DATAs

            PersistentDataContainer teamData = player.getPersistentDataContainer();

            // Switch
            ItemStack teamSwitchItem = new ItemStack(Material.AMETHYST_SHARD, 1);
            ItemMeta teamSwitchItemMeta = teamSwitchItem.getItemMeta();
            teamSwitchItemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Mage Switch");
            ArrayList<String> switchLore = new ArrayList<>();
            switchLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            switchLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSwitchItemMeta.setLore(switchLore);
            teamSwitchItem.setItemMeta(teamSwitchItemMeta);

            //Fire (to change mb)
            ItemStack teamFireItem = new ItemStack(Material.BLAZE_POWDER, 1);
            ItemMeta teamFireItemMeta = teamFireItem.getItemMeta();
            teamFireItemMeta.setDisplayName(ChatColor.DARK_RED + "Mage Fire");
            ArrayList<String> fireLore = new ArrayList<>();
            fireLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_RED + "Fire" + ChatColor.WHITE + "!");
            fireLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamFireItemMeta.setLore(fireLore);
            teamFireItem.setItemMeta(teamFireItemMeta);

            //Splash (to change mb)
            ItemStack teamSplashItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta teamSplashItemMeta = teamSplashItem.getItemMeta();
            teamSplashItemMeta.setDisplayName(ChatColor.BLUE + "Mage Splash");
            ArrayList<String> splashLore = new ArrayList<>();
            splashLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.BLUE + "Splash" + ChatColor.WHITE + "!");
            splashLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSplashItemMeta.setLore(splashLore);
            teamSplashItem.setItemMeta(teamSplashItemMeta);

            // PLAYER HEAD ITEM
            ItemStack playerHeadItem = new ItemStack(Material.PLAYER_HEAD, 1);
            SkullMeta playerHeadItemMeta = (SkullMeta) playerHeadItem.getItemMeta();
            playerHeadItem.setDurability((short) 3);
            playerHeadItemMeta.setOwner(player.getName());
            playerHeadItemMeta.setDisplayName("Profil de "+sender.getName());
            playerHeadItem.setItemMeta(playerHeadItemMeta);

            // VOID ITEM
            ItemStack voidItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
            ItemMeta voidItemMeta = voidItem.getItemMeta();
            voidItemMeta.setDisplayName(" ");
            voidItem.setItemMeta(voidItemMeta);

            for (int i=0; i<45; i++) {
                magicInventory.setItem(i, voidItem);
            }

            magicInventory.setItem(13, playerHeadItem);

            player.openInventory(magicInventory);
        } else {
            System.out.println("You need to be a player to execute this command.");
        }

        return true;

    }
}



