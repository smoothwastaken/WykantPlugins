package me.cleeryy.wykantplugins.types.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class TypeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            PersistentDataContainer playerData = p.getPersistentDataContainer();

            String playerType = playerData.get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING);

            switch (playerType) {
                case "switch":
                    p.sendMessage(ChatColor.DARK_PURPLE + "You are a Switch Mage!");
                    break;

                case "fire":
                    p.sendMessage(ChatColor.DARK_RED + "You are a Fire Mage!");
                    break;

                case "splash":
                    p.sendMessage(ChatColor.BLUE + "You are a Splash Mage!");
                    break;

                case "bolt":
                    p.sendMessage(ChatColor.YELLOW + "You are a Bolt Mage!");
                    break;

                case "rock":
                    p.sendMessage(ChatColor.GREEN + "You are a Rock Mage!");
                    break;
            }
        }

        return true;
    }
}
