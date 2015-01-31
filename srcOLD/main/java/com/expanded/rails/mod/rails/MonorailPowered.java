package com.expanded.rails.mod.rails;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRailPowered;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

import com.expanded.rails.mod.ERMBase;

public class MonorailPowered extends BlockRailPowered
{

	
    public MonorailPowered(int par1)
    {
        super();
        setUnlocalizedName("monorailPowered");
        setHardness(0.7F);
        setStepSound(Block.soundTypeMetal);
        setUnlocalizedName("expandedrails:MonorailPowered");
        // TODO Auto-generated constructor stub
    }

    protected boolean func_94360_a(World par1World, int par2, int par3, int par4, int par5, boolean par6, int par7)
    {
        if (par7 >= 8)
        {
            return false;
        }
        else
        {
            int j1 = par5 & 7;
            boolean flag1 = true;

            switch (j1)
            {
                case 0:
                    if (par6)
                    {
                        ++par4;
                    }
                    else
                    {
                        --par4;
                    }

                    break;

                case 1:
                    if (par6)
                    {
                        --par2;
                    }
                    else
                    {
                        ++par2;
                    }

                    break;

                case 2:
                    if (par6)
                    {
                        --par2;
                    }
                    else
                    {
                        ++par2;
                        ++par3;
                        flag1 = false;
                    }

                    j1 = 1;
                    break;

                case 3:
                    if (par6)
                    {
                        --par2;
                        ++par3;
                        flag1 = false;
                    }
                    else
                    {
                        ++par2;
                    }

                    j1 = 1;
                    break;

                case 4:
                    if (par6)
                    {
                        ++par4;
                    }
                    else
                    {
                        --par4;
                        ++par3;
                        flag1 = false;
                    }

                    j1 = 0;
                    break;

                case 5:
                    if (par6)
                    {
                        ++par4;
                        ++par3;
                        flag1 = false;
                    }
                    else
                    {
                        --par4;
                    }

                    j1 = 0;
            }

            return this.func_94361_a(par1World, par2, par3, par4, par6, par7, j1) ? true : flag1 && this.func_94361_a(par1World, par2, par3 - 1, par4, par6, par7, j1);
        }
    }

    protected boolean func_94361_a(World par1World, int par2, int par3, int par4, boolean par5, int par6, int par7)
    {
    //the change is right here!!
    Block j1 = par1World.getBlock(par2, par3, par4);
             if (j1 == this)
             {
                     int k1 = par1World.getBlockMetadata(par2, par3, par4);
                     int l1 = k1 & 7;
                     if (par7 == 1 && (l1 == 0 || l1 == 4 || l1 == 5))
                     {
                             return false;
                     }
                     if (par7 == 0 && (l1 == 1 || l1 == 2 || l1 == 3))
                     {
                             return false;
                     }
                     if ((k1 & 8) != 0)
                     {
                             if (par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
                             {
                                     return true;
                             }
                             return this.func_94360_a(par1World, par2, par3, par4, k1, par5, par6 + 1);
                     }
             }
             return false;
    }

    protected void func_94358_a(World par1World, int par2, int par3, int par4, int par5, int par6, int par7)
    {
        boolean flag = par1World.isBlockIndirectlyGettingPowered(par2, par3, par4);
        flag = flag || this.func_94360_a(par1World, par2, par3, par4, par5, true, 0) || this.func_94360_a(par1World, par2, par3, par4, par5, false, 0);
        boolean flag1 = false;

        if (flag && (par5 & 8) == 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, par6 | 8, 3);
            flag1 = true;
        }
        else if (!flag && (par5 & 8) != 0)
        {
            par1World.setBlockMetadataWithNotify(par2, par3, par4, par6, 3);
            flag1 = true;
        }

        if (flag1)
        {
            par1World.notifyBlocksOfNeighborChange(par2, par3 - 1, par4, this);

            if (par6 == 2 || par6 == 3 || par6 == 4 || par6 == 5)
            {
                par1World.notifyBlocksOfNeighborChange(par2, par3 + 1, par4, this);
            }
        }
    }

    public void onMinecartPass(World world, EntityMinecart cart, int x, int y, int z)
    {
        //cm = blockID
        if (world.getBlock(x, y, z) == ERMBase.monorailPowered)
        {
            int blockMetaData = world.getBlockMetadata(x, y, z);

            if ((blockMetaData & 0x8) == 0)
            {
                double var24 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);

                if (var24 < 0.03D)
                {
                    cart.motionX *= 0.0D;
                    cart.motionY *= 0.0D;
                    cart.motionZ *= 0.0D;
                }
                else
                {
                    cart.motionX *= 0.5D;
                    cart.motionY *= 0.0D;
                    cart.motionZ *= 0.5D;
                }
            }
            else
            {
                int blockMetaWithoutPoweredBit = blockMetaData & 0x7;
                double var41 = Math.sqrt(cart.motionX * cart.motionX + cart.motionZ * cart.motionZ);

                if (var41 > 0.01D)
                {
                    double var43 = 0.06D;
                    cart.motionX += cart.motionX / var41 * var43;
                    cart.motionZ += cart.motionZ / var41 * var43;
                }
                else if (blockMetaWithoutPoweredBit == 1)
                {
                    if (world.isBlockIndirectlyGettingPowered(x - 1, y, z))
                    {
                        cart.motionX = 0.02D;
                    }
                    else if (world.isBlockIndirectlyGettingPowered(x + 1, y, z))
                    {
                        cart.motionX = -0.02D;
                    }
                }
                else if (blockMetaWithoutPoweredBit == 0)
                {
                    if (world.isBlockIndirectlyGettingPowered(x, y, z - 1))
                    {
                        cart.motionZ = 0.02D;
                    }
                    else if (world.isBlockIndirectlyGettingPowered(x, y, z + 1))
                    {
                        cart.motionZ = -0.02D;
                    }
                }
            }
        }
    }
}
