package me.cleeryy.wykantplugins.general.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import java.util.Random;



public class KillsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            PersistentDataContainer pData = p.getPersistentDataContainer();
            Integer kills = pData.get(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER);

            if (pData.has(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER) && kills == 1) {
                p.sendMessage("§7[§2§lMagic§r§7] §fTu as actuellement " + kills + "point de kill! Ne te gêne pas pour en avoir plusieurs! :rire maléfique:");
            } else if (pData.has(new NamespacedKey(Main.getPlugin(), "playersKilled"), PersistentDataType.INTEGER)) {
                p.sendMessage("§7[§2§lMagic§r§7] §fTu as actuellement " + kills + "points de kill!");
            }else{
                Random rand = new Random();
                String us[] = {"Nikoyaka","cleeryy"};
                p.sendMessage("§7[§2§lMagic§r§7] §fTu n'as aucun point de kill... Ne te laisse pas faire (sauf contre " + us[rand.nextInt(2)] + " hein 0_o')!");
            }
        }
        return true;
    }
}
