package me.luku123.lukadminchat.utils;

public class ColorCode {

    public String CC(String text) {
        return org.bukkit.ChatColor.translateAlternateColorCodes('&', text);
    }
}
