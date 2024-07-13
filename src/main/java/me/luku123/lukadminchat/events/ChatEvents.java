package me.luku123.lukadminchat.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatEvents implements Listener {

    @EventHandler
    public void OnChatSend(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();
        String msg = e.getMessage();

        if (msg.startsWith("!")) {
            for (Player player1 : Bukkit.getOnlinePlayers()) {
                if (player1.hasPermission("lukadminchat.use")) {
                    player1.sendMessage("&e(&lADMIN-CHAT&r&e) " + msg);
                }
                else {
                    return;
                }
            }
        }
    }
}
