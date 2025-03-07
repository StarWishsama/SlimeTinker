package io.github.sefiraat.slimetinker.utils;

import lombok.experimental.UtilityClass;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

@UtilityClass
public final class BlockUtils {

    public static boolean isPlaced(Block block) {
        return block.hasMetadata(IDStrings.PLACED);
    }

    public static Location getMid(World world, double x1, double y1, double z1, double x2, double y2, double z2) {
        return new Location(world,x1 + (x2 - x1) * 0.5, y1 + (y2 - y1) * 0.5, z1 + (z2 - z1) * 0.5);
    }
}
