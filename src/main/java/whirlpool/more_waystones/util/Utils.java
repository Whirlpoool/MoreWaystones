package whirlpool.more_waystones.util;

import net.minecraft.util.Identifier;

public final class Utils {
public static final String MORE_WAYSTONES_ID = "more_waystones";

public static Identifier ID(String id) {
    return new Identifier(MORE_WAYSTONES_ID, id);
}
}