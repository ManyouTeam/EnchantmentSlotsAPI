package cn.superiormc.enchantmentslots;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantmentSlots extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().disablePlugin(this);
    }

    @Override
    public void onDisable() {
    }
}
