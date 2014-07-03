package com.expanded.rails.mod;

import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class PlayerJoin {
	
    @SubscribeEvent
    public void onPlayerLogin(PlayerEvent.PlayerLoggedInEvent event) {

    	event.player.addChatMessage(new ChatComponentText(event.player.getDisplayName() + " is testing chat messages"));
        
    }

}