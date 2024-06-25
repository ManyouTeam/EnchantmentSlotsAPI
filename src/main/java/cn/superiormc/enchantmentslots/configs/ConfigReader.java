package cn.superiormc.enchantmentslots.configs;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.*;

public class ConfigReader {

    /*
    Get enchantment level set in plugin.
     */
    public static String getEnchantLevel(int level) {
        return null;
    }
    /*
    Get enchantment name set in plugin.
     */
    public static String getEnchantmentName(Enchantment enchantment) {
        return null;
    }
    /*
    Parse Item Placeholder set in ItemStack.
    Lore is itemStack's lore, just use itemStack.getLore() here.
    slot is itemStack's max enchantment slot value, can use ItemLimits.getRealMaxEnchantments(item) method to obtain.
     */
    public static List<String> editDisplayLore(List<String> lore, ItemStack itemStack, Player player, int slot) {
        return null;
    }
    /*
    Obtain the default number of enchantment slots set in the configuration file for this player for this item.
     */
    public static int getDefaultLimits(Player player, String itemID) {
        return 0;
    }
    /*
    Obtain the maximum number of enchantment slots set in the configuration file for this player for this item.
     */
    public static int getMaxLimits(Player player, ItemStack itemStack) {
        return 0;
    }
}
