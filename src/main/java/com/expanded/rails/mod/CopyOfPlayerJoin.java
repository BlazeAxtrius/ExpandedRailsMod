package expanded.rails.mod;

import java.awt.Color;

import org.lwjgl.opengl.GL11;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatMessageComponent;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Text;
import cpw.mods.fml.common.IPlayerTracker;

public class CopyOfPlayerJoin implements IPlayerTracker {

	@Override
	public void onPlayerLogin(EntityPlayer player) {
		player.addChatMessage(EnumChatFormatting.RED + "Thank you very much for download the 'Expanded Rails Mod'.");
		player.addChatMessage("Please visit for updates and questions");
		player.addChatMessage(EnumChatFormatting.BLUE + "http://www.planetminecraft.com/mod/162-expanded-rails-mod-v121/");

	}

	@Override
	public void onPlayerLogout(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerChangedDimension(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onPlayerRespawn(EntityPlayer player) {
		// TODO Auto-generated method stub

	}

}
