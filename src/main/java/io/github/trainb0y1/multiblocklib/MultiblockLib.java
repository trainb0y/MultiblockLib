package io.github.trainb0y1.multiblocklib;
import io.github.trainb0y1.multiblocklib.multiblocks.MultiblockType;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class MultiblockLib extends JavaPlugin {
    private static MultiblockLib plugin;
    public List<MultiblockType> types;

    @Override
    public void onEnable() {
        plugin = this;
        PluginManager manager = getServer().getPluginManager();

    }

    public static MultiblockLib getPlugin() {
        return plugin;
    }
}
