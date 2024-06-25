package cn.superiormc.enchantmentslots.methods;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ItemModify {

    public static String lorePrefix = "";

    public static ItemStack serverToClient(@NotNull ItemStack item, Player player) {
        return null;
    }

    public static ItemStack clientToServer(@NotNull ItemStack item) {
        return null;
    }

    public static ItemStack removeAndAddLore(ItemStack item, int defaultSlot, String itemID) {
        return null;
    }

    public static ItemStack addLore(ItemStack item, int defaultSlot, String itemID) {
        return null;
    }

    public static String getEnchantmentLevel(Enchantment enchantment, int level) {
        return null;
    }

    public static String getEnchantmentLevelRoman(Enchantment enchantment, int level) {
        return null;
    }
}
