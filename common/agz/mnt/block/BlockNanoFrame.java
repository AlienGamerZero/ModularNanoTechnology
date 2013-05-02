package agz.mnt.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agz.mnt.ModularNanoTechnology;
import agz.mnt.lib.Reference;
import agz.mnt.lib.Strings;
import agz.mnt.lib.Textures;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNanoFrame extends Block{



	public BlockNanoFrame(int par1, Material material) {
		super(par1, Material.rock);
		this.setHardness(10.0F).setStepSound(soundMetalFootstep);
		this.setUnlocalizedName(Strings.NANOFRAME_NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setCreativeTab(ModularNanoTechnology.MNTtab);
		
		
	}
	
	@SideOnly(Side.CLIENT)
		@Override
            public void registerIcons(IconRegister par1iconRegister) {
                  //this.blockIcon = par1iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName2());
					this.blockIcon = par1iconRegister.registerIcon(Reference.MOD_ID+ ":" + Textures.TEXTURE_BLOCK_NANOFRAME);
                  
                  
			
                   
        }
	
	
	
}

	

