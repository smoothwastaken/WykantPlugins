package me.cleeryy.wykantplugins.general.others.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GamemodeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            String gamemodeInt = args[0];
            if (args.length == 1) {
                switch (gamemodeInt) {
                    case "0":
                        p.setGameMode(GameMode.SURVIVAL);
                        break;

                    case "1":
                        p.setGameMode(GameMode.CREATIVE);
                        break;

                    case "2":
                        p.setGameMode(GameMode.ADVENTURE);
                        break;

                    case "3":
                        p.setGameMode(GameMode.SPECTATOR);
                        break;
                }
            } else {
                p.sendMessage("§7[§2§lMagic§r§7] §cMauvais usage de la commande... Syntaxe: /gm <nombre>");
            }
        }
        return true;
    }
}
