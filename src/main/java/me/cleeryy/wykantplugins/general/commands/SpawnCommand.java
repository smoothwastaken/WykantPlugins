package me.cleeryy.wykantplugins.general.commands;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            Location spawn = new Location(p.getWorld(), -818.5, 74, 105.5);
            p.teleport(spawn);
            p.sendMessage("§7[§2§lMagic§r§7] §fTéléportation au Spawn !");
        }
        // Spawn=-818.5,74,105.5
        return true;
    }
}
