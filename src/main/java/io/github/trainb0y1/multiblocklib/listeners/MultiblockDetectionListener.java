package io.github.trainb0y1.multiblocklib.listeners;

import io.github.trainb0y1.multiblocklib.MultiblockLib;
import io.github.trainb0y1.multiblocklib.multiblocks.MultiblockType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class MultiblockDetectionListener implements Listener {
    @EventHandler
    public void onDetectByClick(PlayerInteractEvent event){
        if(!(event.getAction() == Action.RIGHT_CLICK_BLOCK)){
            return;
        }
        for (MultiblockType type : MultiblockLib.getPlugin().types){
            if (event.getClickedBlock().getType().equals(type.detectBlock) && type.detectType.equals("CLICK")){
                MultiblockLib.getPlugin().getLogger().warning("Attempting to detect " + type);
                type.detect(event.getClickedBlock().getLocation());
            }
        }
    }
    @EventHandler
    public void onDetectByPlace(BlockPlaceEvent event){
        for (MultiblockType type : MultiblockLib.getPlugin().types){
            if (event.getBlockPlaced().getType().equals(type.detectBlock) && type.detectType.equals("PLACE")){
                MultiblockLib.getPlugin().getLogger().warning("Attempting to detect " + type);
                type.detect(event.getBlockPlaced().getLocation());
            }
        }
    }
}
