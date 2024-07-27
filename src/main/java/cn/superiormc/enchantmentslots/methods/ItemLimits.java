package cn.superiormc.enchantmentslots.methods;

import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ItemLimits {

    /*
    Obtain the current maximum enchantment limit of the ItemStack object. The maximum enchantment limit is stored in the item NBT.
    If it cannot be found, the default slot value set here will be used.

    Plugin has built-in default slot system, you can use ConfigReader.getDefaultLimits(player, itemID) method to get default slot in this item.
    For itemID parameter: You can first use checkValid(ItemStack item) method to parse it into String object here.
     */
    public static int getMaxEnchantments(@NotNull ItemStack item, int defaultSlot, @NotNull String itemID) {
        return 0;
    }

    /*
    Similar to getMaxEnchantments method, but if we cannot found default enchantment limit, then we will just return 0 instead of return a default value.
     */
    public static int getRealMaxEnchantments(@NotNull ItemStack item) {
        return 0;
    }

    /*
    Change the maximum enchantment limit stored in the Item Stack.
     */
    public static void setMaxEnchantments(@NotNull ItemStack item, int maxEnchantments) {
        return;
    }

    public static List<String> enchantItems = null;

    public static List<String> blackItems = null;

    /*
    Whether the item can be enchanted or not, this is set by the user in the plugin configuration file.
    For itemID parameter: You can first use checkValid(ItemStack item) method to parse it into String object here.
     */
    public static boolean canEnchant(@NotNull ItemStack item, @NotNull String itemID) {
        return false;
    }
}
