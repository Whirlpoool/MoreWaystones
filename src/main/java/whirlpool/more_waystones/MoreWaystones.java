package whirlpool.more_waystones;

import net.fabricmc.api.ModInitializer;
import whirlpool.more_waystones.registry.BlockRegistry;
import whirlpool.more_waystones.registry.ItemRegistry;


public class MoreWaystones implements ModInitializer {
    @Override
    public void onInitialize() {
        BlockRegistry.registerBlocks();
        ItemRegistry.init();

    }
}
