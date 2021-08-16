package me.cleeryy.wykantplugins.passifs;

import me.cleeryy.wykantplugins.Main;
import org.bukkit.*;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scheduler.BukkitRunnable;

import javax.naming.Name;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class PassifCommand implements CommandExecutor, Listener {

    public int getLevel(PersistentDataContainer pData, Integer number){
        Integer passifs[] = {Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING)), Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING)), Integer.parseInt(pData.get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING))};
        return passifs[number];
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            PersistentDataContainer pData = p.getPersistentDataContainer();
            String pType = pData.get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING);

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
                    p.sendMessage("§7[§2§lMagic§r§7] §fPassif n°"+number+" activé !");
                    passifSwitchEnable(p);
                    break;

                case "fire":
                    passifFireEnable(p);
                    break;

                case "splash":
                    passifSplashEnable(p);
                    break;

//                case "bolt":
//                    passifBoltEnable(p);
//                    break;

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

    @EventHandler
    public void speedBolt(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        if (!verifyType(p, "bolt")) return;

        if (!p.isSprinting()) {
            p.removePotionEffect(PotionEffectType.SPEED);
            return;
        }

        Integer passif1Level = Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING));

        switch (p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING)) {
            case "1":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 0, true, false, false));
                break;

            case "2":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1, true, false, false));
                break;

            case "3":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 2, true, false, false));
                break;

            case "4":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 4, true, false, false));
                break;

            case "5":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 6, true, false, false));
                break;
        }
    }

    @EventHandler
    public void onHunger(FoodLevelChangeEvent e){

        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            PersistentDataContainer pData = p.getPersistentDataContainer();

            if (!pData.get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING).equalsIgnoreCase("bolt")) return;

            String passif3Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING);

            Random random = new Random();
            int randInt = random.nextInt(101);

            switch (passif3Level){
                case "1":
                    if (randInt < 20) {
                        e.setCancelled(true);
                    }
                    break;

                case "2":
                    if (randInt < 40) {
                        e.setCancelled(true);
                    }
                    break;

                case "3":
                    if (randInt < 60) {
                        e.setCancelled(true);
                    }
                    break;

                case "4":
                    if (randInt < 80) {
                        e.setCancelled(true);
                    }
                    break;

                case "5":
                    e.setCancelled(true);
                    break;
            }

        }

    }

    @EventHandler
    public void boltMining(PlayerMoveEvent e) {
        Player p = e.getPlayer();

        if (!verifyType(p, "bolt")) return;

        if (p.isSneaking()) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.FAST_DIGGING, 200, Integer.parseInt(p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING)) -1, true, false, false));
        }
    }

    @EventHandler
    public void boltMalus(PlayerMoveEvent e) {
        if (!verifyType(e.getPlayer(), "bolt")) return;

        Player p = e.getPlayer();
        double playerHealth = p.getHealth();

        if (playerHealth > 14.0) {
            p.setHealth(14.0);
        }
    }

    private void groundUpdate (Player player) {
        if (!verifyType(player, "switch")) return;
        Location location = player.getPlayer().getLocation();
        location = location.subtract(0, 1, 0);

        Block block = location.getBlock();
        if (!block.getType().isSolid()) return;

        player.setAllowFlight(true);
    }

    /**
     * Handles player joins.
     * @param event The event.
     */
    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event) {
        this.groundUpdate(event.getPlayer());
    }

    /**
     * Handles player damage.
     * @param event The event.
     */
    @EventHandler
    public void onPlayerDamage (EntityDamageEvent event) {
        if (event.getEntityType()!= EntityType.PLAYER) return;
        if (!verifyType((Player)event.getEntity(), "switch")) return;
        if (event.getCause()!= EntityDamageEvent.DamageCause.FALL) return;
        event.setCancelled(true);
    }

    /**
     * Handles player movement.
     * @param event The event.
     */
    @EventHandler
    public void onPlayerMove (PlayerMoveEvent event) {
        if (event.getPlayer().getAllowFlight()) return;
        this.groundUpdate(event.getPlayer());
    }

    /**
     * Handles player flight.
     * @param event The event.
     */
    @EventHandler
    public void onPlayerToggleFlight (PlayerToggleFlightEvent event) {
        if (!verifyType(event.getPlayer(), "switch")) return;
        if (event.getPlayer().getGameMode() == GameMode.CREATIVE || event.getPlayer().getGameMode() == GameMode.SPECTATOR) return;

        event.setCancelled(true);
        event.getPlayer().setAllowFlight(false);
        switch (event.getPlayer().getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING)) {
            case "1":
                event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(0.3d).setY(0.2d));
                break;

            case "2":
                event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(0.4d).setY(0.4d));
                break;

            case "3":
                event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(0.5d).setY(0.6d));
                break;

            case "4":
                event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(0.7d).setY(0.8d));
                break;

            case "5":
                event.getPlayer().setVelocity(event.getPlayer().getLocation().getDirection().multiply(0.8d).setY(1.0d));
                break;
        }
    }

    @EventHandler
    public void malusSwitch(PlayerMoveEvent e) {
        if (!(e.getPlayer() instanceof Player)) return;
        if (!verifyType(e.getPlayer(), "switch")) return;
        Player p = e.getPlayer();
        if (!p.isSneaking()) return;
        p.addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 10, 2, true, false, false));

    }

    @EventHandler
    public void knockbackSwitch(PlayerToggleSneakEvent e){
        if (!(e.getPlayer() instanceof Player)) return;

        if (!verifyType(e.getPlayer(), "switch")) return;

        Player p = e.getPlayer();
        String passif2level = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING);
        ItemStack current = p.getInventory().getItemInMainHand();
        Integer currentSlot = p.getInventory().first(current);
        ItemMeta currentMeta = current.getItemMeta();

        switch (passif2level) {
            case "1":
                currentMeta.addEnchant(Enchantment.KNOCKBACK, 1, true);
                break;

            case "2":
                currentMeta.addEnchant(Enchantment.KNOCKBACK, 2, true);
                break;

            case "3":
                currentMeta.addEnchant(Enchantment.KNOCKBACK, 3, true);
                break;

            case "4":
                currentMeta.addEnchant(Enchantment.KNOCKBACK, 4, true);
                break;

            case "5":
                currentMeta.addEnchant(Enchantment.KNOCKBACK, 5, true);
                break;
        }
        current.setItemMeta(currentMeta);

        p.getInventory().setItem(currentSlot, current);
    }

    @EventHandler
    public void onUntoggleSneakSwitch(PlayerMoveEvent e){
        Player p = (Player) e.getPlayer();
        if (p.isSneaking()) return;
        if (!verifyType(p, "switch")) return;

        String passif3level = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING);
        ItemStack current = p.getInventory().getItemInMainHand();
        ItemMeta currentMeta = current.getItemMeta();
        if (!currentMeta.hasEnchant(Enchantment.KNOCKBACK)) return;
        Integer currentSlot = p.getInventory().first(current);
        currentMeta.removeEnchant(Enchantment.KNOCKBACK);
        current.setItemMeta(currentMeta);
        p.getInventory().setItem(currentSlot, current);
    }

    @EventHandler
    public void fireAspectFire(PlayerToggleSneakEvent e){
        if (!(e.getPlayer() instanceof Player)) return;

        if (!verifyType(e.getPlayer(), "fire")) return;

        Player p = e.getPlayer();
        String passif1level = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING);

        ItemStack current = p.getInventory().getItemInMainHand();
        Integer currentSlot = p.getInventory().first(current);
        ItemMeta currentMeta = current.getItemMeta();

        switch (passif1level) {
            case "1":
                currentMeta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
                break;

            case "2":
                currentMeta.addEnchant(Enchantment.FIRE_ASPECT, 2, true);
                break;

            case "3":
                currentMeta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
                break;

            case "4":
                currentMeta.addEnchant(Enchantment.FIRE_ASPECT, 4, true);
                break;

            case "5":
                currentMeta.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
                break;
        }
        current.setItemMeta(currentMeta);

        p.getInventory().setItem(currentSlot, current);
    }

    @EventHandler
    public void onUntoggleSneakFire(PlayerMoveEvent e){
        Player p = (Player) e.getPlayer();
        if (p.isSneaking()) return;
        if (!verifyType(p, "fire")) return;

        ItemStack current = p.getInventory().getItemInMainHand();
        ItemMeta currentMeta = current.getItemMeta();
        if (!currentMeta.hasEnchant(Enchantment.FIRE_ASPECT)) return;
        Integer currentSlot = p.getInventory().first(current);
        currentMeta.removeEnchant(Enchantment.FIRE_ASPECT);
        current.setItemMeta(currentMeta);
        p.getInventory().setItem(currentSlot, current);
    }

    @EventHandler
    public void fireInTheNether(PlayerMoveEvent e) {
        Player p = (Player) e.getPlayer();
        World currentWorld = p.getWorld();

        if (!currentWorld.getName().equalsIgnoreCase("world_nether")) return;

        switch (p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING)) {
            case "1":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 0, true, false, false));
                break;

            case "2":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 0, true, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 0, true, false, false));
                break;

            case "3":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1, true, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 0, true, false, false));

                break;

            case "4":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1, true, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 1, true, false, false));

                break;

            case "5":
                p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 10, 1, true, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 60, 1, true, false, false));
                p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, false));
                break;


        }
    }

    @EventHandler
    public void onFireFire(EntityDamageEvent e) {
        if (!(e.getEntity() instanceof Player)) return;

        Player p = (Player) e.getEntity();
        if (!verifyType(p, "fire")) return;

        PersistentDataContainer pData = p.getPersistentDataContainer();
        String passif1Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING);
        String passif2Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING);

        if(e.getCause() == EntityDamageEvent.DamageCause.FIRE || e.getCause() == EntityDamageEvent.DamageCause.FIRE_TICK || e.getCause() == EntityDamageEvent.DamageCause.LAVA) {
            e.setCancelled(true);
            switch (passif2Level) {
                case "2":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 0, true, false, false));
                    break;

                case "3":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 0, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 40, 0, true, false, false));
                    break;

                case "4":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 40, 1, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80, 0, true, false, false));
                    break;

                case "5":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 60, 1, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100, 1, true, false, false));
                    break;
            }
        }
    }

    @EventHandler
    public void onSplashUnderWater(PlayerMoveEvent e) {
        Player p = (Player) e.getPlayer();
        if (!verifyType(p, "splash")) return;

        PersistentDataContainer pData = p.getPersistentDataContainer();
        String passif1Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp1"), PersistentDataType.STRING);
        String passif2Level = pData.get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING);

        World w = p.getWorld();
        if (!w.isClearWeather() || w.isThundering()){
            switch (passif2Level){
                case "1":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 0, true, false,false));
                    break;

                case "2":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 0, true, false,false));
                    break;

                case "3":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 1, true, false,false));
                    break;

                case "4":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 200, 1, true, false,false));
                    break;

                case "5":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 2, true, false,false));
                    break;
            }
            return;
        }

        Location from = e.getFrom();
        Location to = e.getTo();
        Block checkWater = e.getPlayer().getEyeLocation().getBlock();
        if(checkWater.getType() == Material.WATER)
        {
            switch (passif1Level) {
                case "1":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100, 0, true, false, false));
                    break;

                case "2":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100, 1, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 0, true, false, false));
                    break;

                case "3":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100, 2, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 2, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 0, true, false, false));
                    break;

                case "4":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100, 3, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 4, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 1, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 0, true, false, false));
                    break;

                case "5":
                    p.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 100, 4, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 1200, 1000, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 2, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 100, 1, true, false, false));
                    p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 150, 0, true, false, false));
                    break;
            }
        }
        else
        {
            return;
        }
    }

    @EventHandler
    public void rockSneaking(PlayerMoveEvent e) {
        Player p = (Player) e.getPlayer();
        String passif2Level = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp2"), PersistentDataType.STRING);

        if (!p.isSneaking()) return;

        switch (passif2Level) {
            case "1":
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 1, true, false, false));
                break;

            case "2":
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 2, true, false, false));
                break;

            case "3":
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 3, true, false, false));
                break;

            case "4":
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 4, true, false, false));
                break;

            case "5":
                p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 10, 5, true, false, false));
                break;
        }
    }

    @EventHandler
    public void rockJoin(PlayerMoveEvent e) {
        Player p = (Player) e.getPlayer();
        String passif3level = p.getPersistentDataContainer().get(new NamespacedKey(Main.getPlugin(), "mlp3"), PersistentDataType.STRING);

        if (!verifyType(p, "rock")) return;

        if (!p.hasPotionEffect(PotionEffectType.SLOW)) {
            p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 999999, 0, true, false, false));
        }

        if (p.hasPotionEffect(PotionEffectType.HEALTH_BOOST)) return;


        switch (passif3level) {
            case "1":
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 0, true, false, false));
                break;

            case "2":
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 1, true, false, false));
                break;

            case "3":
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 2, true, false, false));
                break;

            case "4":
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 3, true, false, false));
                break;

            case "5":
                p.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 999999, 4, true, false, false));
                break;


        }
    }

    public boolean verifyType(Player p, String type) {
        PersistentDataContainer pData = p.getPersistentDataContainer();
        String currentType = pData.get(new NamespacedKey(Main.getPlugin(), "magicTeam"), PersistentDataType.STRING);

        if (type.equalsIgnoreCase(currentType)) return true;
        return false;
    }
}
