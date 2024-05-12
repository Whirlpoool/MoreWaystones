package whirlpool.more_waystones.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import wraith.fwaystones.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import whirlpool.more_waystones.util.Utils;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import java.util.HashMap;

public final class ItemRegistry {

    private static final HashMap<String, Item> ITEMS = new HashMap<>();

    private ItemRegistry() {}

    private static void registerItem(String id, Item item) {
        ITEMS.put(id, Registry.register(Registries.ITEM, Utils.ID(id), item));
    }

    public static void init() {
        if (!ITEMS.isEmpty()) {
            return;
        }
        registerItem("ice_waystone", new WaystoneItem(BlockRegistry.ICE_WAYSTONE, new FabricItemSettings()));
    }

    public static Item get(String id) {
        return ITEMS.getOrDefault(id, Items.AIR);
    }

}
