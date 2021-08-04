package me.cleeryy.wykantplugins.general.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;

public class ResetCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player p = (Player) sender;

            p.getPersistentDataContainer().remove(new NamespacedKey(Main.getPlugin(), "magicTeam"));
            p.getPersistentDataContainer().remove(new NamespacedKey(Main.getPlugin(), "magicLevel"));
            p.kickPlayer("Reconnect yourself and select your type!");
        }

        return true;
    }
}
