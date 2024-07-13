package me.luku123.lukadminchat.events;

import me.luku123.lukadminchat.LukAdminChat;
import me.luku123.lukadminchat.utils.ColorCode;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvents implements Listener {

    ColorCode cc = new ColorCode();
    FileConfiguration cfg = LukAdminChat.getPlugin().getConfig();

    @EventHandler
    public void OnChatSend(AsyncPlayerChatEvent e) {
        String msg = e.getMessage();

        if (msg.startsWith(cfg.getString("AdminChatPrefix"))) {
            String newmsg = msg.replace(cfg.getString("AdminChatPrefix"), "");

            for (Player player1 : Bukkit.getOnlinePlayers()) {
                if (player1.hasPermission("lukadminchat.use")) {
                    player1.sendMessage( cc.CC(cfg.getString("AdminChatMsg")) + cc.CC(newmsg));
                    e.setCancelled(true);
                }
                else {
                    return;
                }
            }
        }
    }
}
