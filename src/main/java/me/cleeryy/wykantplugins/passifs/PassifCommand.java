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


public class PassifCommand implements CommandExecutor {

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

            String action = args[0];
            String number = args[1];

            switch (number){
                case "1":
                    switch (action){
                        case "enable":

                            break;

                        case "disable":

                             break;
                    }
                    break;

                case "2":
                    switch (action){
                        case "enable":

                            break;

                        case "disable":

                            break;
                    }
                    break;

                case "3":
                    switch (action){
                        case "enable":

                            break;

                        case "disable":

                            break;
                    }
                    break;
            }


            switch (pType){
                case "switch":
                    passifSwitchEnable(p);
                    break;

                case "fire":
                    passifFireEnable(p);
                    break;

                case "splash":
                    passifSplashEnable(p);
                    break;

                case "bolt":
                    passifBoltEnable(p);
                    break;

                case "rock":
                    passifRockEnable(p);
                    break;
            }
        }
        return true;
    }


    public void passifSwitchEnable(Player p) {
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


    public void passifFireEnable(Player p) {
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


    public void passifSplashEnable(Player p) {
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


    public void passifRockEnable(Player p) {
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


    public void passifBoltEnable(Player p) {
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
