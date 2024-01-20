package whirlpool.more_waystones.registry;

import io.wispforest.owo.util.TagInjector;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import wraith.fwaystones.FabricWaystones;
import wraith.fwaystones.block.WaystoneBlock;
import whirlpool.more_waystones.util.Utils;

import java.util.HashMap;

public class BlockRegistry {

    public static final Block ICE_WAYSTONE = new WaystoneBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(FabricWaystones.CONFIG.waystone_block_hardness(), 3600000).nonOpaque());
    public static final HashMap<String, Block> WAYSTONE_BLOCKS = new HashMap<>();
    private static Identifier miningLevelTag;

    public static void registerBlocks() {
        var miningLevel = FabricWaystones.CONFIG.waystone_block_required_mining_level();
        miningLevelTag = new Identifier(switch (miningLevel) {
            case 1 -> "minecraft:needs_stone_tool";
            case 2 -> "minecraft:needs_iron_tool";
            case 3 -> "minecraft:needs_diamond_tool";
            default -> "fabric:needs_tool_level_" + miningLevel;
        });

        registerAndAdd("ice_waystone", ICE_WAYSTONE);
    }

    private static void registerAndAdd(String id, Block block) {
        WAYSTONE_BLOCKS.put(id, block);
        Registry.register(Registry.BLOCK, Utils.ID(id), block);
        TagInjector.inject(Registry.BLOCK, miningLevelTag, block);
    }

}
