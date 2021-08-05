package me.cleeryy.wykantplugins;

import me.cleeryy.wykantplugins.general.book.PlayerInteractBookEvent;
import me.cleeryy.wykantplugins.general.commands.KillsCommand;
import me.cleeryy.wykantplugins.general.commands.MagicCommand;
import me.cleeryy.wykantplugins.general.commands.ResetCommand;
import me.cleeryy.wykantplugins.general.commands.SpawnCommand;
import me.cleeryy.wykantplugins.general.events.PlayerKillPlayerEvent;
import me.cleeryy.wykantplugins.general.others.SitCommandEvent;
import me.cleeryy.wykantplugins.general.others.commands.GamemodeCommand;
import me.cleeryy.wykantplugins.levels.events.LevelGUIInteractions;
import me.cleeryy.wykantplugins.levels.commands.LevelGUICommand;
import me.cleeryy.wykantplugins.general.events.PlayerJoinEventListener;
import me.cleeryy.wykantplugins.general.events.MagicEvent;
import me.cleeryy.wykantplugins.levels.commands.SetLevelCommand;
import me.cleeryy.wykantplugins.levels.events.AddLevelPlayersFirstJoin;
import me.cleeryy.wykantplugins.passifs.PassifCommand;
import me.cleeryy.wykantplugins.types.commands.TypeSelectionCommand;
import me.cleeryy.wykantplugins.types.commands.TypeCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    private static Main plugin;

    @Override
    public void onEnable() {
        plugin = this;

        System.out.println("[+] Magic Plugin Started.");

        getCommand("magic").setExecutor(new MagicCommand());
        getCommand("mt").setExecutor(new TypeCommand());
        getCommand("stype").setExecutor(new TypeSelectionCommand());
        getCommand("mreset").setExecutor(new ResetCommand());
        getCommand("mlevel").setExecutor(new LevelGUICommand());
        getCommand("slevel").setExecutor(new SetLevelCommand());
        getCommand("spawn").setExecutor(new SpawnCommand());
        getCommand("gm").setExecutor(new GamemodeCommand());
        getCommand("sit").setExecutor(new SitCommandEvent());
        getCommand("kills").setExecutor(new KillsCommand());
        getCommand("passif").setExecutor(new PassifCommand());


        getServer().getPluginManager().registerEvents(new MagicEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerJoinEventListener(), this);
        getServer().getPluginManager().registerEvents(new PlayerInteractBookEvent(), this);
        getServer().getPluginManager().registerEvents(new AddLevelPlayersFirstJoin(), this);
        getServer().getPluginManager().registerEvents(new LevelGUIInteractions(), this);
        getServer().getPluginManager().registerEvents(new PlayerKillPlayerEvent(), this);
    }

    public static Main getPlugin() {
        return plugin;
    }

}
