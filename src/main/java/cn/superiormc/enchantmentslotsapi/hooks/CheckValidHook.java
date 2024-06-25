package cn.superiormc.enchantmentslotsapi.hooks;

import org.bukkit.inventory.ItemStack;

public class CheckValidHook {


    /*
    Parse the Item Stack object into the Item ID of a string object.
     */
    public static String checkValid(ItemStack item) {
        return item.getType().name().toLowerCase();
    }
}
