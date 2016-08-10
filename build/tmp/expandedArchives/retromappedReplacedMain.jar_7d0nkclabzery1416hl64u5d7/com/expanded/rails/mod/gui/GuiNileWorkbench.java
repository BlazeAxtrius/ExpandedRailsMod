package com.expanded.rails.mod.gui;

import com.expanded.rails.mod.ERMBase;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;

import static net.minecraft.util.text.translation.I18n.translateToLocal;

@SideOnly(Side.CLIENT)
public class GuiNileWorkbench extends GuiContainer{
private static final ResourceLocation field_110422_t = new ResourceLocation(ERMBase.modid + ":" + "textures/gui/container/rails_crafting_table.png");
public GuiNileWorkbench(InventoryPlayer playerInv, TileEntityNileWorkbench tileTable, World worldIn, BlockPos blockPosition)
{
super(new ContainerNileWorkbench(tileTable, playerInv, worldIn, blockPosition));
}
/**
* Draw the foreground layer for the GuiContainer (everything in front of the items)
*/
@Override
protected void func_146979_b(int x, int z)
{
this.field_146289_q.func_78276_b(func_74838_a("Crafting"), 30, 6, 4210752);
this.field_146289_q.func_78276_b(I18n.func_135052_a("container.inventory", new Object[0]), 8, this.field_147000_g - 96 + 2, 4210752);
}
/**
* Draw the background layer for the GuiContainer (everything behind the items)
*/
@Override
protected void func_146976_a(float f, int x, int y)
{
GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
this.field_146297_k.func_110434_K().func_110577_a(field_110422_t);
int k = (this.field_146294_l - this.field_146999_f) / 2;
int l = (this.field_146295_m - this.field_147000_g) / 2;
this.func_73729_b(k, l, 0, 0, this.field_146999_f, this.field_147000_g);
}
}
