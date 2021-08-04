package me.cleeryy.wykantplugins.general.others;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.spigotmc.event.entity.EntityDismountEvent;

import java.util.ArrayList;

public class SitCommandEvent implements CommandExecutor, Listener
{

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
    {
        if (!(sender instanceof Player))
        {
            sender.sendMessage("§cOnly a player can perform this command!");
            return true;
        }

        Player player = (Player) sender;

        if (!player.isOnGround())
        {
            player.sendMessage("§cTu es déjà assis !");
            return true;
        }

        Location location = player.getLocation();
        World world = location.getWorld();
        ArmorStand chair = (ArmorStand) world.spawnEntity(location.add(0, -1.7, 0), EntityType.ARMOR_STAND);

        chair.setGravity(false);
        chair.setVisible(false);
        chair.setInvulnerable(false);
        chair.addPassenger(player);

        return true;
    }

    @EventHandler
    public void onDismount(EntityDismountEvent event)
    {
        if (!(event.getEntity() instanceof Player))
            return;

        Player player = (Player) event.getEntity();

        if (!(event.getDismounted() instanceof ArmorStand))
            return;

        event.getDismounted().remove();
    }
}