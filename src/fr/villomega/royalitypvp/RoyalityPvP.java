package fr.villomega.royalitypvp;

import fr.villomega.royalitypvp.listeners.listeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RoyalityPvP extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Plugin RoyalityPvP just started");

        getServer().getPluginManager().registerEvents(new listeners(),this);
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("Plugin RoyalityPvP just stop");
    }
}
