package me.cleeryy.wykantplugins.general.events;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.*;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class PlayerJoinEventListener implements Listener {

    @EventHandler
    public void onPlayerJoin(org.bukkit.event.player.PlayerJoinEvent e) {
        Player player = (Player) e.getPlayer();
        PersistentDataContainer playerData = (PersistentDataContainer) player.getPersistentDataContainer();
        Inventory playerInventory = (Inventory) player.getInventory();

        if (player.getGameMode() == GameMode.CREATIVE){
            player.setAllowFlight(true);
        }

        ItemStack magicBookItem = new ItemStack(Material.BOOK, 1);
        ItemMeta magicBookItemMeta = magicBookItem.getItemMeta();;
        magicBookItemMeta.setDisplayName("§6§kaa§r§l§2Magic Book§r§6§kaa");
        magicBookItemMeta.setUnbreakable(true);
        magicBookItemMeta.addEnchant(Enchantment.DURABILITY, 5, true);
        magicBookItem.setItemMeta(magicBookItemMeta);

        if (!playerData.has(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING)) {
            playerData.set(new NamespacedKey(Main.getPlugin(), "magicLevel"), PersistentDataType.STRING, "1");
            Inventory selectTeamInv = Bukkit.createInventory(player, InventoryType.HOPPER, "§8[§2Magic§8] §6§lBienvenue! ");

            // SET ITEMs FOR THE CHOSING OF TYPEs
            // Switch
            ItemStack teamSwitchItem = new ItemStack(Material.AMETHYST_SHARD, 1);
            ItemMeta teamSwitchItemMeta = teamSwitchItem.getItemMeta();
            teamSwitchItemMeta.setDisplayName("§5Mage Switch");
            ArrayList<String> switchLore = new ArrayList<>();
            switchLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            switchLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSwitchItemMeta.setLore(switchLore);
            teamSwitchItem.setItemMeta(teamSwitchItemMeta);

            //Fire (to change mb)
            ItemStack teamFireItem = new ItemStack(Material.BLAZE_POWDER, 1);
            ItemMeta teamFireItemMeta = teamFireItem.getItemMeta();
            teamFireItemMeta.setDisplayName("§4Mage Fire");
            ArrayList<String> fireLore = new ArrayList<>();
            fireLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_RED + "Fire" + ChatColor.WHITE + "!");
            fireLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamFireItemMeta.setLore(fireLore);
            teamFireItem.setItemMeta(teamFireItemMeta);

            //Splash
            ItemStack teamSplashItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta teamSplashItemMeta = teamSplashItem.getItemMeta();
            teamSplashItemMeta.setDisplayName("§3Mage Splash");
            ArrayList<String> splashLore = new ArrayList<>();
            splashLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.BLUE + "Splash" + ChatColor.WHITE + "!");
            splashLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSplashItemMeta.setLore(splashLore);
            teamSplashItem.setItemMeta(teamSplashItemMeta);

            //Bolt
            ItemStack teamBoltItem = new ItemStack(Material.HONEYCOMB, 1);
            ItemMeta teamBoltItemMeta = teamBoltItem.getItemMeta();
            teamBoltItemMeta.setDisplayName("§6Mage Bolt");
            ArrayList<String> boltLore = new ArrayList<>();
            boltLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.GOLD + "Splash" + ChatColor.WHITE + "!");
            boltLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamBoltItemMeta.setLore(boltLore);
            teamBoltItem.setItemMeta(teamBoltItemMeta);

            //Rock
            ItemStack teamRockItem = new ItemStack(Material.NETHERITE_SCRAP, 1);
            ItemMeta teamRockItemMeta = teamRockItem.getItemMeta();
            teamRockItemMeta.setDisplayName("§2Mage Rock");
            ArrayList<String> rockLore = new ArrayList<>();
            rockLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_GREEN + "Splash" + ChatColor.WHITE + "!");
            rockLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamRockItemMeta.setLore(rockLore);
            teamRockItem.setItemMeta(teamRockItemMeta);

            selectTeamInv.setItem(0, teamBoltItem);
            selectTeamInv.setItem(1, teamSplashItem);
            selectTeamInv.setItem(2, teamSwitchItem);
            selectTeamInv.setItem(3, teamFireItem);
            selectTeamInv.setItem(4, teamRockItem);

            player.openInventory(selectTeamInv);
        } else {
            switch (player.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING).toString()) {
                case "fire":
                    Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + player.getName().toString() + " title {\"text\":\"Fire\",\"bold\":true,\"color\":\"dark_red\"}");
                    break;

                case "switch":
                    Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + player.getName().toString() + " title {\"text\":\"Switch\",\"bold\":true,\"color\":\"dark_purple\"}");
                    break;

                case "splash":
                    Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + player.getName().toString() + " title {\"text\":\"Splash\",\"bold\":true,\"color\":\"blue\"}");
                    break;

                case "bolt":
                    Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + player.getName().toString() + " title {\"text\":\"Bolt\",\"bold\":true,\"color\":\"gold\"}");
                    break;

                case "rock":
                    Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + player.getName().toString() + " title {\"text\":\"Rock\",\"bold\":true,\"color\":\"dark_green\"}");
                    break;
            }
        }

        if (playerInventory.contains(magicBookItem)) return;
        playerInventory.setItem(4, magicBookItem);
        player.sendMessage("You receive the MagicBook inside your inventory!");
    }

    @EventHandler
    public static void onEscapeMenu(InventoryCloseEvent e) {
        Player p = (Player) e.getPlayer();
        Inventory inv = e.getInventory();

        if (inv.getSize() != 5) return;
        if (inv.getType() != InventoryType.HOPPER) return;

        if (!p.getPersistentDataContainer().has(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING)) {
            Inventory selectTeamInv = Bukkit.createInventory(p, InventoryType.HOPPER, "§8[§2Magic§8] §6§lBienvenue! ");

            // SET ITEMs FOR THE CHOSING OF TYPEs
            // Switch
            ItemStack teamSwitchItem = new ItemStack(Material.AMETHYST_SHARD, 1);
            ItemMeta teamSwitchItemMeta = teamSwitchItem.getItemMeta();
            teamSwitchItemMeta.setDisplayName("§5Mage Switch");
            ArrayList<String> switchLore = new ArrayList<>();
            switchLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            switchLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSwitchItemMeta.setLore(switchLore);
            teamSwitchItem.setItemMeta(teamSwitchItemMeta);

            //Fire (to change mb)
            ItemStack teamFireItem = new ItemStack(Material.BLAZE_POWDER, 1);
            ItemMeta teamFireItemMeta = teamFireItem.getItemMeta();
            teamFireItemMeta.setDisplayName("§4Mage Fire");
            ArrayList<String> fireLore = new ArrayList<>();
            fireLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_RED + "Fire" + ChatColor.WHITE + "!");
            fireLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamFireItemMeta.setLore(fireLore);
            teamFireItem.setItemMeta(teamFireItemMeta);

            //Splash
            ItemStack teamSplashItem = new ItemStack(Material.PRISMARINE_SHARD, 1);
            ItemMeta teamSplashItemMeta = teamSplashItem.getItemMeta();
            teamSplashItemMeta.setDisplayName("§3Mage Splash");
            ArrayList<String> splashLore = new ArrayList<>();
            splashLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.BLUE + "Splash" + ChatColor.WHITE + "!");
            splashLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamSplashItemMeta.setLore(splashLore);
            teamSplashItem.setItemMeta(teamSplashItemMeta);

            //Bolt
            ItemStack teamBoltItem = new ItemStack(Material.HONEYCOMB, 1);
            ItemMeta teamBoltItemMeta = teamBoltItem.getItemMeta();
            teamBoltItemMeta.setDisplayName("§6Mage Bolt");
            ArrayList<String> boltLore = new ArrayList<>();
            boltLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.GOLD + "Splash" + ChatColor.WHITE + "!");
            boltLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamBoltItemMeta.setLore(boltLore);
            teamBoltItem.setItemMeta(teamBoltItemMeta);

            //Rock
            ItemStack teamRockItem = new ItemStack(Material.NETHERITE_SCRAP, 1);
            ItemMeta teamRockItemMeta = teamRockItem.getItemMeta();
            teamRockItemMeta.setDisplayName("§2Mage Rock");
            ArrayList<String> rockLore = new ArrayList<>();
            rockLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_GREEN + "Splash" + ChatColor.WHITE + "!");
            rockLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
            teamRockItemMeta.setLore(rockLore);
            teamRockItem.setItemMeta(teamRockItemMeta);

            selectTeamInv.setItem(0, teamBoltItem);
            selectTeamInv.setItem(1, teamSplashItem);
            selectTeamInv.setItem(2, teamSwitchItem);
            selectTeamInv.setItem(3, teamFireItem);
            selectTeamInv.setItem(4, teamRockItem);

            p.openInventory(selectTeamInv);
        }

    }

    @EventHandler
    public static void onPlayerInteractFirst(InventoryClickEvent e){
        Player p = (Player) e.getWhoClicked();
        PersistentDataContainer pData = p.getPersistentDataContainer();
        Inventory inv = e.getInventory();
        ItemStack current = e.getCurrentItem();

        if (inv.getSize() != 5) return;
        if (inv.getType() != InventoryType.HOPPER) return;

        e.setCancelled(true);

        p.closeInventory();

        String type = "";

        switch (current.getItemMeta().getDisplayName().toString()) {
            case "§5Mage Switch":
                type = "switch";
                break;

            case "§4Mage Fire":
                type = "fire";
                break;

            case "§3Mage Splash":
                type = "splash";
                break;

            case "§6Mage Bolt":
                type = "bolt";
                break;

            case "§2Mage Rock":
                type = "rock";
                break;
        }
        pData.set(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING, type);
        p.kickPlayer("Tu dois te reconnecter pour appliquer tes effets!\nC'est pour cela que tu as été kick ;-;");
    }
}
