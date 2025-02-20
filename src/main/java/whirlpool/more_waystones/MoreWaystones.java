package whirlpool.more_waystones;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import whirlpool.more_waystones.registry.BlockRegistry;
import whirlpool.more_waystones.registry.ItemRegistry;
import whirlpool.more_waystones.registry.MoreWaystonesGroup;
import whirlpool.more_waystones.registry.PokemonWaystonesGroup;


public class MoreWaystones implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockRegistry.registerBlocks();
        ItemRegistry.init();
        ItemGroup group = MoreWaystonesGroup.MORE_WAYSTONES_GROUP;
        ItemGroup group1 = PokemonWaystonesGroup.POKEMON_WAYSTONES_GROUP;

    }
}
