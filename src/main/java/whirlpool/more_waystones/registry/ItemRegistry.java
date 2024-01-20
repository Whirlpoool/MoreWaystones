package whirlpool.more_waystones.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import wraith.fwaystones.item.*;
import wraith.fwaystones.util.CustomItemGroup;
import whirlpool.more_waystones.util.Utils;

import java.util.HashMap;

public final class ItemRegistry {

    private static final HashMap<String, Item> ITEMS = new HashMap<>();

    private ItemRegistry() {}

    private static void registerItem(String id, Item item) {
        ITEMS.put(id, Registry.register(Registry.ITEM, Utils.ID(id), item));
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("ice_waystone", new WaystoneItem(BlockRegistry.ICE_WAYSTONE, new FabricItemSettings().group(CustomItemGroup.WAYSTONE_GROUP)));
    }

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

}
