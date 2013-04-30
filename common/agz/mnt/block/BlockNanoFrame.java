package agz.mnt.block;

import agz.mnt.core.proxy.CommonProxy;
import agz.mnt.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNanoFrame extends Block{

	public BlockNanoFrame(int id, Material material) {
		super(id, material);
		this.setUnlocalizedName(Strings.NANOFRAME_NAME);
		this.setCreativeTab(CreativeTabs.tabBlock);
		
	}

	
	
	

	
		
}

