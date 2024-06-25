package cn.superiormc.enchantmentslots.methods;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ExtraSlotsItem {

    /*
    Reinitialize all Extra Slot Items once.
     */
    public static void init() {
        return;
    }

    /*
    Obtain the Extra Slot Item with the specified ID, and return null if the item does not exist.
     */
    @Nullable
    public static ItemStack getExtraSlotItem(@NotNull String itemID) {
        return null;
    }

    /*
    Get the ID of the Extra Slot Item corresponding to the Item Stack object. If the Item Stack object is not an Extra Slot Item, it will return null.
     */
    @Nullable
    public static ExtraSlotsItem getExtraSlotItemValue(@NotNull ItemStack item) {
        return null;
    }

    private String id;

    private double chance;

    private int addSlot;

    private List<String> applyItems;

    private List<String> blackItems;

    private ConfigurationSection section;

    /*
    An Extra Slot Item object

    id: The ID of this Extra Slot Item.
    section: The config section of this Extra Slot Item.
     */
    public ExtraSlotsItem(String id, ConfigurationSection section) {
    }

    /*
    Get the ItemStack object corresponding to the Extra Slot Item object.
    Will return STONE if fail to build the ItemStack.
     */
    @NotNull
    public ItemStack getItem() {
        return null;
    }

    /*
    Get can this Extra Slot Item be used on the item ID.
    For ItemStack object, you can first use checkValid(item) method to parse it into String object here.
     */
    public boolean canApply(@NotNull Player player, @NotNull String itemID) {
        return false;
    }

    /*
    Obtain the number of slots that will be added in this item.
     */
    public int getAddSlot() {
        return 0;
    }

    /*
    Execute actions under the success actions option.
     */
    public void doSuccessAction(@NotNull Player player) {
        return;
    }

    /*
    Execute actions under the fail actions option.
     */
    public void doFailAction(@NotNull Player player) {
        return;
    }
}
