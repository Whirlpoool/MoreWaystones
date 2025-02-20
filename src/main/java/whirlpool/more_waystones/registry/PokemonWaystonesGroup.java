package whirlpool.more_waystones.registry;

import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class PokemonWaystonesGroup {
    public static final ItemGroup POKEMON_WAYSTONES_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(BlockRegistry.POKEBALL_WAYSTONE))
            .displayName(Text.translatable("itemGroup.more_waystones.pokemon_waystones_itemgroup"))
            .entries((context, entries) -> {
                entries.add(BlockRegistry.POKEBALL_WAYSTONE);
            })
            .build();
    static {
        Registry.register(Registries.ITEM_GROUP, new Identifier("more_waystones", "pokemon_waystones_group"), POKEMON_WAYSTONES_GROUP);
    }
}
