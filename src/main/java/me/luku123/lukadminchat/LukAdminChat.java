package me.luku123.lukadminchat;

import org.bukkit.plugin.java.JavaPlugin;

public final class LukAdminChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("[LukAdminChat] Enabling LukAdminChat v1.0.0");
        getLogger().info("[LukAdminChat] Plugin LukAdminChat v1.0.0 has been enabled ");
    }

    @Override
    public void onDisable() {
        getLogger().info("[LukAdminChat] Disabling LukAdminChat v1.0.0");
        getLogger().info("[LukAdminChat] Plugin LukAdminChat v1.0.0 has been disabled");
    }
}
