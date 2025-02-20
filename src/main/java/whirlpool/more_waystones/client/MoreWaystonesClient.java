package whirlpool.more_waystones.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import whirlpool.more_waystones.registry.BlockRegistry;

public class MoreWaystonesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), BlockRegistry.WAYSTONE_BLOCKS.get("ice_waystone"));
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.WAYSTONE_BLOCKS.get("prismarine_waystone"));
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), BlockRegistry.WAYSTONE_BLOCKS.get("pokeball_waystone"));
    }
}
