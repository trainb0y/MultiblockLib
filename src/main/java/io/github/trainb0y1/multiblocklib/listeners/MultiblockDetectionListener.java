package io.github.trainb0y1.multiblocklib.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class MultiblockDetectionListener implements Listener {
    @EventHandler
    public void onDetect(PlayerInteractEvent event){
        if(!(event.getAction() == Action.RIGHT_CLICK_BLOCK)){
            return;
        }
        // TODO: detect multiblocks here
    }
}
