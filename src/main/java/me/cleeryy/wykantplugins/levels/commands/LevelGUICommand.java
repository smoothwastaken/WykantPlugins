package me.cleeryy.wykantplugins.levels.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.ArrayList;

public class LevelGUICommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;
            PersistentDataContainer pData = p.getPersistentDataContainer();

            String levelTypes[] = {"mlp1","mlp2","mlp3","mla1","mla2","mla3","mla4","mlu"};

            Inventory lvlInv = Bukkit.createInventory(p, 54, "Magic Level Inventory");

            // Passif 1
            ItemStack passif1Item = new ItemStack(Material.WATER_BUCKET, 1);
            ItemMeta passif1ItemMeta = passif1Item.getItemMeta();
            passif1ItemMeta.setDisplayName(ChatColor.AQUA + "Passif 1");
            ArrayList<String> passif1ItemLore = new ArrayList<>();
            passif1ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            passif1ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            passif1ItemMeta.setLore(passif1ItemLore);
            passif1Item.setItemMeta(passif1ItemMeta);

            // Passif 2
            ItemStack passif2Item = new ItemStack(Material.POWDER_SNOW_BUCKET, 1);
            ItemMeta passif2ItemMeta = passif2Item.getItemMeta();
            passif2ItemMeta.setDisplayName(ChatColor.AQUA + "Passif 2");
            ArrayList<String> passif2ItemLore = new ArrayList<>();
            passif2ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            passif2ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            passif2ItemMeta.setLore(passif2ItemLore);
            passif2Item.setItemMeta(passif2ItemMeta);

            // Passif 3
            ItemStack passif3Item = new ItemStack(Material.LAVA_BUCKET, 1);
            ItemMeta passif3ItemMeta = passif3Item.getItemMeta();
            passif3ItemMeta.setDisplayName(ChatColor.AQUA + "Passif 3");
            ArrayList<String> passif3ItemLore = new ArrayList<>();
            passif3ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            passif3ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            passif3ItemMeta.setLore(passif3ItemLore);
            passif3Item.setItemMeta(passif3ItemMeta);

            // Attack 1
            ItemStack attack1Item = new ItemStack(Material.MUSIC_DISC_13, 1);
            ItemMeta attack1ItemMeta = attack1Item.getItemMeta();
            attack1ItemMeta.setDisplayName(ChatColor.GOLD + "Actif 1");
            ArrayList<String> attack1ItemLore = new ArrayList<>();
            attack1ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attack1ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attack1ItemMeta.setLore(attack1ItemLore);
            attack1Item.setItemMeta(attack1ItemMeta);

            // Attack 2
            ItemStack attack2Item = new ItemStack(Material.MUSIC_DISC_MALL, 1);
            ItemMeta attack2ItemMeta = attack2Item.getItemMeta();
            attack2ItemMeta.setDisplayName(ChatColor.GOLD + "Actif 2");
            ArrayList<String> attack2ItemLore = new ArrayList<>();
            attack2ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attack2ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attack2ItemMeta.setLore(attack2ItemLore);
            attack2Item.setItemMeta(attack2ItemMeta);

            // Attack 3
            ItemStack attack3Item = new ItemStack(Material.MUSIC_DISC_CHIRP, 1);
            ItemMeta attack3ItemMeta = attack3Item.getItemMeta();
            attack3ItemMeta.setDisplayName(ChatColor.GOLD + "Actif 3");
            ArrayList<String> attack3ItemLore = new ArrayList<>();
            attack3ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attack3ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attack3ItemMeta.setLore(attack3ItemLore);
            attack3Item.setItemMeta(attack3ItemMeta);

            // Attack 4
            ItemStack attack4Item = new ItemStack(Material.MUSIC_DISC_PIGSTEP, 1);
            ItemMeta attack4ItemMeta = attack4Item.getItemMeta();
            attack4ItemMeta.setDisplayName(ChatColor.GOLD + "Actif 4");
            ArrayList<String> attack4ItemLore = new ArrayList<>();
            attack4ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attack4ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attack4ItemMeta.setLore(attack4ItemLore);
            attack4Item.setItemMeta(attack4ItemMeta);

            // Ultime
            ItemStack ultimeItem = new ItemStack(Material.NETHER_STAR, 1);
            ItemMeta ultimeItemMeta = ultimeItem.getItemMeta();
            ultimeItemMeta.setDisplayName(ChatColor.DARK_PURPLE + "Ultime");
            ArrayList<String> ultimeLore = new ArrayList<>();
            ultimeLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            ultimeLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            ultimeItemMeta.setLore(ultimeLore);
            ultimeItem.setItemMeta(ultimeItemMeta);

            // Attack Level 1 Item
            ItemStack attackLevel1Item = new ItemStack(Material.GREEN_STAINED_GLASS_PANE, 1);
            ItemMeta attackLevel1ItemMeta = attackLevel1Item.getItemMeta();
            attackLevel1ItemMeta.setDisplayName(ChatColor.DARK_GREEN + "Niveau 1");
            ArrayList<String> attackLevel1ItemLore = new ArrayList<>();
            attackLevel1ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attackLevel1ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attackLevel1ItemMeta.setLore(attackLevel1ItemLore);
            attackLevel1Item.setItemMeta(attackLevel1ItemMeta);

            // Attack Level 2 Item
            ItemStack attackLevel2Item = new ItemStack(Material.LIME_STAINED_GLASS_PANE, 1);
            ItemMeta attackLevel2ItemMeta = attackLevel2Item.getItemMeta();
            attackLevel2ItemMeta.setDisplayName(ChatColor.GREEN + "Niveau 2");
            ArrayList<String> attackLevel2ItemLore = new ArrayList<>();
            attackLevel2ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attackLevel2ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attackLevel2ItemMeta.setLore(attackLevel2ItemLore);
            attackLevel2Item.setItemMeta(attackLevel2ItemMeta);

            // Attack Level 3 Item
            ItemStack attackLevel3Item = new ItemStack(Material.YELLOW_STAINED_GLASS_PANE, 1);
            ItemMeta attackLevel3ItemMeta = attackLevel3Item.getItemMeta();
            attackLevel3ItemMeta.setDisplayName(ChatColor.YELLOW + "Niveau 3");
            ArrayList<String> attackLevel3ItemLore = new ArrayList<>();
            attackLevel3ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attackLevel3ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attackLevel3ItemMeta.setLore(attackLevel3ItemLore);
            attackLevel3Item.setItemMeta(attackLevel3ItemMeta);

            // Attack Level 4 Item
            ItemStack attackLevel4Item = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE, 1);
            ItemMeta attackLevel4ItemMeta = attackLevel4Item.getItemMeta();
            attackLevel4ItemMeta.setDisplayName(ChatColor.GOLD + "Niveau 4");
            ArrayList<String> attackLevel4ItemLore = new ArrayList<>();
            attackLevel4ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attackLevel4ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attackLevel4ItemMeta.setLore(attackLevel4ItemLore);
            attackLevel4Item.setItemMeta(attackLevel4ItemMeta);

            // Attack Level 5 Item
            ItemStack attackLevel5Item = new ItemStack(Material.RED_STAINED_GLASS_PANE, 1);
            ItemMeta attackLevel5ItemMeta = attackLevel5Item.getItemMeta();
            attackLevel5ItemMeta.setDisplayName(ChatColor.DARK_RED + "Niveau 5");
            ArrayList<String> attackLevel5ItemLore = new ArrayList<>();
            attackLevel5ItemLore.add(ChatColor.WHITE + "Tu es actuellement un mage " + ChatColor.DARK_PURPLE + "Switch" + ChatColor.WHITE + "!");
            attackLevel5ItemLore.add(ChatColor.WHITE + "Tu peux cliquer ici pour changer ton type!");
//            attackLevel5ItemMeta.setLore(attackLevel5ItemLore);
            attackLevel5Item.setItemMeta(attackLevel5ItemMeta);

            // Back
            ItemStack backItem = new ItemStack(Material.BARRIER, 1);
            ItemMeta backItemMeta = backItem.getItemMeta();
            backItemMeta.setDisplayName(ChatColor.RED + "Retour");
            ArrayList<String> backItemLore = new ArrayList<>();
            backItemLore.add(ChatColor.WHITE + "Clique ici pour retourner au menu principal!");
            backItemMeta.setLore(backItemLore);
            backItem.setItemMeta(backItemMeta);

            // void
            ItemStack voidItem = new ItemStack(Material.BLACK_STAINED_GLASS_PANE, 1);
            ItemMeta voidItemMeta = voidItem.getItemMeta();
            voidItemMeta.setDisplayName(" ");
            voidItem.setItemMeta(voidItemMeta);

            for (int i=0; i<45; i++) {
                lvlInv.setItem(i, voidItem);
            }

            for (int k=0; k < levelTypes.length; k++) {
                for (int i=37; i > 37 - (Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), levelTypes[k]), PersistentDataType.STRING)) * 9); i -= 9) {
                    switch (pData.get(new NamespacedKey(Main.getPlugin(), levelTypes[k]), PersistentDataType.STRING)){
                        case "1":
                            lvlInv.setItem(i + k, attackLevel1Item);
                            break;

                        case "2":
                            lvlInv.setItem(i + k, attackLevel2Item);
                            break;

                        case "3":
                            lvlInv.setItem(i + k, attackLevel3Item);
                            break;

                        case "4":
                            lvlInv.setItem(i + k, attackLevel4Item);
                            break;

                        case "5":
                            lvlInv.setItem(i + k, attackLevel5Item);
                            break;


                    }
                }
            }

            lvlInv.setItem(0, attackLevel5Item);
            lvlInv.setItem(9, attackLevel4Item);
            lvlInv.setItem(18, attackLevel3Item);
            lvlInv.setItem(27, attackLevel2Item);
            lvlInv.setItem(36, attackLevel1Item);
            lvlInv.setItem(45, backItem);
            lvlInv.setItem(46, passif1Item);
            lvlInv.setItem(47, passif2Item);
            lvlInv.setItem(48, passif3Item);
            lvlInv.setItem(49, attack1Item);
            lvlInv.setItem(50, attack2Item);
            lvlInv.setItem(51, attack3Item);
            lvlInv.setItem(52, attack4Item);
            lvlInv.setItem(53, ultimeItem);

            p.openInventory(lvlInv);
        }
        return true;
    }
}
