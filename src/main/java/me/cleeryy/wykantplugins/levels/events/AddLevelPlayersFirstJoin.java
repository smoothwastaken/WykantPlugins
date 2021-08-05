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

        if (!pData.has(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING)){
            String levelPassifTypes[] = {"mlp1","mlp2","mlp3"};
            String levelActifsUltimeTypes[] = {"mla1","mla2","mla3","mla4","mlu"};
            for (int i=0; i < levelPassifTypes.length; i++) {
                pData.set(new NamespacedKey(Main.getPlugin(), levelPassifTypes[i]), PersistentDataType.STRING, "1");
            }
            for (int i=0; i < levelActifsUltimeTypes.length; i++) {
                pData.set(new NamespacedKey(Main.getPlugin(), levelActifsUltimeTypes[i]), PersistentDataType.STRING, "0");
            }
        }
    }
}
