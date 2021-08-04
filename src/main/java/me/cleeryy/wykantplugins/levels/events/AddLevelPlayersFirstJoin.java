package me.cleeryy.wykantplugins.levels.events;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class AddLevelPlayersFirstJoin implements Listener {
    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();
        PersistentDataContainer pData = p.getPersistentDataContainer();

        if (!pData.has(new NamespacedKey(Main.getPlugin(), "mt"), PersistentDataType.STRING)){
            String levelTypes[] = {"mlp1","mlp2","mlp3","mla1","mla2","mla3","mla4","mlu"};
            for (int i=0; i < levelTypes.length; i++) {
                pData.set(new NamespacedKey(Main.getPlugin(), levelTypes[i]), PersistentDataType.STRING, "1");
            }
        }
    }
}
