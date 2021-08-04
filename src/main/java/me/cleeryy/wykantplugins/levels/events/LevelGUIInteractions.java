package me.cleeryy.wykantplugins.levels.events;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class LevelGUIInteractions implements Listener {

    @EventHandler
    public void onPlayerInteract(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        Inventory inv = e.getInventory();
        ItemStack current = e.getCurrentItem();

        if (inv.getSize() != 54) return;
        if (current.getType() == null) return;

        String currentName = current.getItemMeta().getDisplayName();
        String currentDisableList[] = {"§cRetour", "§bPassif 1", "§bPassif 2", "§bPassif 3", "§6Actif 1", "§6Actif 2", "§6Actif 3", "§6Actif 4", "§5Ultime", "§2Niveau 1", "§aNiveau 2", "§eNiveau 3", "§6Niveau 4", "§4Niveau 5", " "};

        if (Arrays.stream(currentDisableList).anyMatch(currentName::equals)) {
            e.setCancelled(true);

            switch (currentName){
                case "§cRetour":
                    p.closeInventory();
                    p.chat("/magic");
                    break;

                case "§bPassif 1":
                    removePlayerKills(p, 3, "mlp1");
                    break;

                case "§bPassif 2":
                    removePlayerKills(p, 5, "mlp2");
                    break;

                case "§bPassif 3":
                    removePlayerKills(p, 7, "mlp3");
                    break;

                case "§6Actif 1":
                    removePlayerLevels(p, 10, "mla1");
                    break;

                case "§6Actif 2":
                    removePlayerLevels(p, 20, "mla2");
                    break;

                case "§6Actif 3":
                    removePlayerLevels(p, 30, "mla3");
                    break;

                case "§6Actif 4":
                    removePlayerLevels(p, 40, "mla4");
                    break;

                case "§5Ultime":
                    removePlayerLevels(p, 50, "mlu");
                    break;

                default:
                    return;
            }
        }
    }
    public void removePlayerKills(Player p, Integer toRemove, String levelType) {
        if (Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING)) >= 5) {
            p.sendMessage("§7[§2§lMagic§r§7] §l§cTu ne peux plus acheter de niveau supérieur, tu as déjà atteint le niveau maximal!");
            return;
        }
        if (p.getPersistentDataContainer().has(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER)) {
            System.out.println("Ça détecte que j'ai la key quand même");
            Integer kills = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER);
            if (kills < toRemove){
                System.out.println("Alors là c'est pas normal hein. Les kills que ça trouve: " +kills);
                p.sendMessage("§7[§2§lMagic§r§7] §l§cTu n'as pas assez de points de kill pour pouvoir acheter ce niveau!\n§r§fPour voir le nombre de points de kill que tu as tu peux faire la commande: /kills");
                return;
            } else{
                System.out.println("Ici c'est encore bon normalement donc tranquille (kill: "+kills+" au cas où)..");
                Integer result = (kills - toRemove);
                System.out.println("En plus je te donne le résultat du calcul frérot: "+result);
                p.getPersistentDataContainer().set(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER, result);
                System.out.println("J'ai bien changer à la nouvelle valeur la key :)");
                p.sendMessage("§7[§2§lMagic§r§7] §2Bravo, tu viens d'augmenter ton niveau!");
                p.playSound(p.getLocation(), Sound.ENCHANT_THORNS_HIT, 1, 1);
                Integer levelNewScore = (Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING)) + 1);
                p.getPersistentDataContainer().set(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING, levelNewScore.toString());
                p.closeInventory();
                p.chat("/mlevel");
                System.out.println("Bah là gros ça marche hein ???");
                return;
            }
        } else{
            p.sendMessage("§7[§2§lMagic§r§7] §l§cTu n'as pas de points de kill... \n§r§fPour voir le nombre de points de kill que tu as tu peux faire la commande: /kills");
            System.out.println("Complètement con ça dit que t'as pas de kill wtf ???");
            return;
        }

    }

    public void removePlayerLevels(Player p, Integer toRemove, String levelType){
        if (Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING)) >= 5) {
            p.sendMessage("§7[§2§lMagic§r§7] §l§cTu ne peux plus acheter de niveau supérieur, tu as déjà atteint le niveau maximal!");
            return;
        }
        if (p.getExpToLevel() >= toRemove) {
            p.setLevel(p.getLevel() - toRemove);
            p.sendMessage("§7[§2§lMagic§r§7] §2Bravo, tu viens d'augmenter ton niveau!");
//            p.playSound(p.getLocation(), Sound.ENCHANT_THORNS_HIT, 1, 1);
            p.playSound(p.getLocation(), Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
            Integer levelNewScore = (Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING)) + 1);
            p.getPersistentDataContainer().set(new NamespacedKey(Main.getPlugin(), levelType), PersistentDataType.STRING, levelNewScore.toString());
            p.closeInventory();
            p.chat("/mlevel");
            return;
        } else{
            p.sendMessage("§7[§2§lMagic§r§7] §l§cTu n'as pas assez de niveau d'expérience pour acheter ce niveau!");
            return;
        }
    }
}
