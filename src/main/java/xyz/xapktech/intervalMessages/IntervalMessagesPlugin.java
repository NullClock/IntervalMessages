package xyz.xapktech.intervalMessages;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.List;
import java.util.Random;

public class IntervalMessagesPlugin extends JavaPlugin {
    private FileConfiguration config;
    private Random random;

    @Override
    public void onEnable() {
        this.saveDefaultConfig();
        config = this.getConfig();
        random = new Random();

        int interval = config.getInt("interval", 60);
        new MessageTask().runTaskTimer(this, 0, interval * 20L);
    }

    private class MessageTask extends BukkitRunnable {
        @Override
        public void run() {
            List<String> messages = config.getStringList("messages");
            String name = ChatColor.translateAlternateColorCodes('&', config.getString("name", "&r[&cServer&r]"));
            if (messages.isEmpty()) {
                return;
            }

            String message = messages.get(random.nextInt(messages.size()));
            Bukkit.broadcastMessage(name + " " + message);
        }
    }
}