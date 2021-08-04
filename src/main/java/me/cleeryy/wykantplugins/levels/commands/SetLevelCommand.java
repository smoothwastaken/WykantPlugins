package me.cleeryy.wykantplugins.levels.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class SetLevelCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length == 3) {
            if (Bukkit.getPlayerExact(args[0]) != null){
                Player p = (Player) sender;
                Player t = Bukkit.getPlayerExact(args[0]);
                String levelType = args[1];
                String levelInt = args[2];
                PersistentDataContainer tData = t.getPersistentDataContainer();

                tData.set(new NamespacedKey(Main.getPlugin(), "ml"+levelType.toString()), PersistentDataType.STRING, levelInt.toString());

                p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the level of §6" + t.getName().toString() + "§f for §5" + levelType + "§f to §5" + levelType + "§f !");
            }
        }

        return true;
    }
}
