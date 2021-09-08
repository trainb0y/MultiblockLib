package io.github.trainb0y1.multiblocklib;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MultiblockLib extends JavaPlugin {
    private static MultiblockLib plugin;

    @Override
    public void onEnable() {
        plugin = this;
        PluginManager manager = getServer().getPluginManager();

    }

    public static MultiblockLib getPlugin() {
        return plugin;
    }
}
