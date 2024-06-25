package cn.superiormc.enchantmentslotsapi;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantmentSlotsAPI extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().disablePlugin(this);
    }

    @Override
    public void onDisable() {
    }
}
