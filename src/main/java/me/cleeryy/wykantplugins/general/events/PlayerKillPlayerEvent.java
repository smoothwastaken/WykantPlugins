package me.cleeryy.wykantplugins.general.events;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PlayerKillPlayerEvent implements Listener {

    @EventHandler
    public void onPlayerKillOthersPlayers(PlayerDeathEvent e) {
        Player player = e.getEntity().getPlayer();
        Player killer = e.getEntity().getKiller();
        if (killer == null) return;
        if (killer instanceof Player) {
            System.out.println(killer.getDisplayName());
            Player p = e.getEntity().getKiller();
            PersistentDataContainer pData = p.getPersistentDataContainer();
            if (pData.has(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER)) {
                pData.set(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER, pData.get(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER) + 1);
            }else{
                pData.set(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER, 1);
            }
        }
    }
}
