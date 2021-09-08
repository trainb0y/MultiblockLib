package io.github.trainb0y1.multiblocklib.events;

import io.github.trainb0y1.multiblocklib.MultiblockInstance;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MultiblockDestroyedEvent extends Event {
    private final MultiblockInstance multiblock;

    public MultiblockDestroyedEvent(MultiblockInstance instance) {
        this.multiblock = instance;
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
}
