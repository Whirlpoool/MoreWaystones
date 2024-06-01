package whirlpool.more_waystones.registry;

import io.wispforest.owo.util.TagInjector;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.util.Identifier;
import wraith.fwaystones.FabricWaystones;
import wraith.fwaystones.block.WaystoneBlock;
import whirlpool.more_waystones.util.Utils;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import java.util.HashMap;

public class BlockRegistry {

    public static final Block ICE_WAYSTONE = new WaystoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().nonOpaque().strength(FabricWaystones.CONFIG.waystone_block_hardness(), 3600000));
    public static final Block PRISMARINE_WAYSTONE = new WaystoneBlock(FabricBlockSettings.create().mapColor(MapColor.STONE_GRAY).requiresTool().strength(FabricWaystones.CONFIG.waystone_block_hardness(), 3600000));
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
        registerAndAdd("prismarine_waystone", PRISMARINE_WAYSTONE);
    }

    private static void registerAndAdd(String id, Block block) {
        WAYSTONE_BLOCKS.put(id, block);
        Registry.register(Registries.BLOCK, Utils.ID(id), block);
        TagInjector.inject(Registries.BLOCK, miningLevelTag, block);
    }

}
