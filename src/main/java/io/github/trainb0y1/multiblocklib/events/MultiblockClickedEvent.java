package io.github.trainb0y1.multiblocklib.events;

import io.github.trainb0y1.multiblocklib.multiblocks.MultiblockInstance;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MultiblockClickedEvent extends Event {
    private final MultiblockInstance multiblock;
    private final Player player;
    private final Block block;

    public MultiblockClickedEvent(MultiblockInstance instance, Player player, Block clickedBlock ) {
        this.multiblock = instance;
        this.player = player;
        this.block = clickedBlock;
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
    public Block getBlock() {
        return this.block;
    }
}
