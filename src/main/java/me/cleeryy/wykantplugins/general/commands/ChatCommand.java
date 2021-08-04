package me.cleeryy.wykantplugins.general.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

import java.util.Arrays;

public class ChatCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        System.out.println("1");
        if (args.length > 1) {
            System.out.println("2");
            if (Bukkit.getPlayerExact(args[0]) != null){
                System.out.println("3");
                Player p = (Player) sender;
                Player t = Bukkit.getPlayerExact(args[0]);
                StringBuilder text = new StringBuilder();
                String[] textArgs = Arrays.copyOfRange(args, 1, args.length);
                System.out.println(textArgs.toString());
                for (String part : textArgs) {
                    text.append(part+" ");
                }

                System.out.println(text.toString());

                t.chat(text.toString());

                p.sendMessage("§7[§2§lMagic§r§7] §f" + t.getDisplayName() + " send the message: " + text.toString());
            }
        }

        return true;
    }
}