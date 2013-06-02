package agz.mnt.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agz.mnt.ModularNanoTechnology;
import agz.mnt.lib.BlockID;
import agz.mnt.lib.ItemID;
import agz.mnt.lib.Reference;
import agz.mnt.lib.Strings;
import agz.mnt.lib.Textures;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockNanoFrame extends Block{



	public BlockNanoFrame(int par1, Material material) {
		super(par1, Material.iron);
		this.setStepSound(soundMetalFootstep).setBlockUnbreakable();
		this.setUnlocalizedName(Strings.NANOFRAME_NAME);
		this.setCreativeTab(ModularNanoTechnology.MNTtab);
	}
	
	
	
	@SideOnly(Side.CLIENT)
		@Override
            public void registerIcons(IconRegister par1iconRegister) {
					this.blockIcon = par1iconRegister.registerIcon(Reference.MOD_ID+ ":" + Textures.TEXTURE_BLOCK_NANOFRAME);
                              	
            } 
			
}

		
			
                   
 
	
	
	


	

