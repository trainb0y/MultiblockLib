package io.github.trainb0y1.multiblocklib.multiblocks;

import io.github.trainb0y1.multiblocklib.multiblocks.MultiblockInstance;
import org.bukkit.Location;
import org.bukkit.Material;
import org.jetbrains.annotations.Nullable;

public class MultiblockType {
    public String detectType;
    public MultiblockPattern pattern;
    public Material detectBlock;
    public MultiblockType(Material detectBlock, String detectType, MultiblockPattern pattern){
        this.detectBlock = detectBlock;
        this.detectType = detectType;
        this.pattern = pattern;
    }

    @Nullable
    public MultiblockInstance detect(Location location) {
        //TODO: detect
        return null;
    }
}
