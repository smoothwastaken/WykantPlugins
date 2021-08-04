package me.cleeryy.wykantplugins.types.commands;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class TypeSelectionCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;

        if (args.length == 2){
            if (Bukkit.getPlayerExact(args[0]) != null){
                String type = (String) args[1];
                Player target = (Player) Bukkit.getPlayerExact(args[0]);
                PersistentDataContainer targetData = (PersistentDataContainer) target.getPersistentDataContainer();
                targetData.set(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING, type);

                System.out.println(targetData.get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING));

                Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "effect clear " + target.getName().toString());

                switch (type) {
                    case "fire":
                        p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the type of §6" + target.getName().toString() + "§f to §4" + type + "§f type!");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + target.getName().toString() + " title {\"text\":\"Fire\",\"bold\":true,\"color\":\"dark_red\"}");
                        break;

                    case "switch":
                        p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the type of §6" + target.getName().toString() + "§f to §5" + type + "§f type!");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + target.getName().toString() + " title {\"text\":\"Switch\",\"bold\":true,\"color\":\"dark_purple\"}");
                        if (target.getGameMode() != GameMode.CREATIVE) {
                            target.setAllowFlight(true);
                        }
                        break;

                    case "splash":
                        p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the type of §6" + target.getName().toString() + "§f to §9" + type + "§f type!");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + target.getName().toString() + " title {\"text\":\"Splash\",\"bold\":true,\"color\":\"blue\"}");
                        break;

                    case "bolt":
                        p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the type of §6" + target.getName().toString() + "§f to §6" + type + "§f type!");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + target.getName().toString() + " title {\"text\":\"Bolt\",\"bold\":true,\"color\":\"gold\"}");
                        break;

                    case "rock":
                        p.sendMessage("§7[§2§lMagic§r§7] §fYou changed the type of §6" + target.getName().toString() + "§f to §2" + type + "§f type!");
                        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "title " + target.getName().toString() + " title {\"text\":\"Rock\",\"bold\":true,\"color\":\"dark_green\"}");
                        break;
                }

                if (p.getGameMode() == GameMode.CREATIVE){
                    target.setAllowFlight(true);
                }

                target.kickPlayer("Tu dois te reconnecter pour appliquer tes effets!\nC'est pour cela que tu as été kick ;-;");

            }else{
                p.sendMessage("§7[§2§lMagic§r§7] §cLe joueur selectionné n'est pas en ligne.");
            }
        } else {
            p.sendMessage("§7[§2§lMagic§r§7] §cTa commande n'a pas bien été formulé.. usage: /mteam <joueur> <type>.");

        }

        return true;
    }
}
