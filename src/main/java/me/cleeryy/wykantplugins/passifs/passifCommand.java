package me.cleeryy.wykantplugins.passifs;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.NamespacedKey;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;


public class passifCommand implements CommandExecutor {

    public int getLevel(PersistentDataContainer pData, Integer number){
        Integer passifs[] = {Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING)), Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING)), Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING))};
        return passifs[number];
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            PersistentDataContainer pData = p.getPersistentDataContainer();
            String pType = pData.get(new NamespacedKey(Main.getPlugin(), "magicType"), PersistentDataType.STRING);

            // Get all the variable for the effects
            String passif1Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING);
            String passif2Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING);
            String passif3Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING);

            Integer passifs[] = {Integer.parseInt(passif1Level),Integer.parseInt(passif2Level),Integer.parseInt(passif3Level)};

            switch (pType){
                case "switch":
                    passifSwitch(p);
                    break;

                case "fire":
                    passifFire(p);
                    break;

                case "splash":
                    passifSplash(p);
                    break;

                case "bolt":
                    passifBolt(p);
                    break;

                case "rock":
                    passifRock(p);
                    break;
            }
        }
        return true;
    }


    public void passifSwitch(Player p) {
        switch (getLevel(p.getPersistentDataContainer(), 1)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 2)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 3)){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }
    }


    public void passifFire(Player p) {
        switch (getLevel(p.getPersistentDataContainer(), 1)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 2)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 3)){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }
    }


    public void passifSplash(Player p) {
        switch (getLevel(p.getPersistentDataContainer(), 1)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 2)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 3)){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }
    }


    public void passifRock(Player p) {
        switch (getLevel(p.getPersistentDataContainer(), 1)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 2)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 3)){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }
    }


    public void passifBolt(Player p) {
        switch (getLevel(p.getPersistentDataContainer(), 1)) {
            case 1:
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999, 0, true, false, false));
                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 2)) {
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }

        switch (getLevel(p.getPersistentDataContainer(), 3)){
            case 1:

                break;

            case 2:

                break;

            case 3:

                break;

            case 4:

                break;

            case 5:

                break;
        }
    }
}
