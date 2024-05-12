package whirlpool.more_waystones;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import whirlpool.more_waystones.registry.BlockRegistry;
import whirlpool.more_waystones.registry.ItemRegistry;
import whirlpool.more_waystones.registry.MoreWaystonesGroup;


public class MoreWaystones implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockRegistry.registerBlocks();
        ItemRegistry.init();
        ItemGroup group = MoreWaystonesGroup.MORE_WAYSTONES_GROUP;

    }
}
