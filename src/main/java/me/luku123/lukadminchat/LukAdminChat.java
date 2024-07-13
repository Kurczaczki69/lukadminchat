package me.luku123.lukadminchat;

import me.luku123.lukadminchat.events.ChatEvents;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LukAdminChat extends JavaPlugin {

    private static LukAdminChat plugin;

    @Override
    public void onEnable() {
        getLogger().info("[LukAdminChat] Enabling LukAdminChat v1.0.0");
        plugin = this;

        Bukkit.getServer().getPluginManager().registerEvents(new ChatEvents(), this);
        saveDefaultConfig();

        getLogger().info("[LukAdminChat] Plugin LukAdminChat v1.0.0 has been enabled ");
    }

    @Override
    public void onDisable() {
        getLogger().info("[LukAdminChat] Disabling LukAdminChat v1.0.0");
        getLogger().info("[LukAdminChat] Plugin LukAdminChat v1.0.0 has been disabled");
    }

    public static LukAdminChat getPlugin() {
        return plugin;
    }

}
