package com.expanded.rails.mod.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

public class GuiRailsCraftingTable extends GuiContainer
{
    protected int xSize = 176;
    protected int ySize = 186;

    private static final ResourceLocation field_110422_t = new ResourceLocation("expandedrails:textures/gui/container/rails_crafting_table.png");

    public GuiRailsCraftingTable(InventoryPlayer par1InventoryPlayer, World par2World, int par3, int par4, int par5)
    {
        super(new ContainerRailsCraftingTable(par1InventoryPlayer, par2World, par3, par4, par5));
    }

    /*** Draw the foreground layer for the GuiContainer (everything in front of the items)**/
    protected void drawGuiContainerForegroundLayer(int par1, int par2)
    {
    	//this.fontRendererObj.drawString(I18n.getString("container.crafting"), 25, -4, 4210752);
        //this.fontRendererObj.drawString(I18n.getString("container.inventory"), 7, this.ySize - 105 + 2, 4210752);
        //this.fontRendererObj.drawString(I18n.getString("Rail"), 115, this.ySize - 178 + 2, 4210752);
        //this.fontRendererObj.drawString(I18n.getString("Nails"), 97, this.ySize - 138 + 2, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.crafting"), 25, -4, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 7, this.ySize - 105 + 2, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("Rail"), 115, this.ySize - 178 + 2, 4210752);
        this.fontRendererObj.drawString(StatCollector.translateToLocal("Nails"), 97, this.ySize - 138 + 2, 4210752);
    }
    /*** Draw the background layer for the GuiContainer (everything behind the items)*/
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(field_110422_t);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
    }
}
