package io.github.trainb0y1.multiblocklib.events;

import io.github.trainb0y1.multiblocklib.multiblocks.MultiblockInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MultiblockDetectedEvent extends Event {
    private final MultiblockInstance multiblock;
    private final Player player;

    public MultiblockDetectedEvent(MultiblockInstance instance, Player player) {
        this.multiblock = instance;
        this.player = player;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    public MultiblockInstance getMultiblock() {
        return this.multiblock;
    }
    public Player getPlayer() {
        return this.player;
    }
}
