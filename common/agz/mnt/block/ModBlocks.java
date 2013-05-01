package agz.mnt.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import agz.mnt.lib.BlockID;
import agz.mnt.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block nanoframe;	
	
	public static void init(){
		nanoframe = new BlockNanoFrame(BlockID.NANOFRAME, Material.rock, Strings.NANOFRAME_NAME, CreativeTabs.tabBlock, 64, 200, 200);
		
		GameRegistry.registerBlock(nanoframe, Strings.NANOFRAME_NAME);

		LanguageRegistry.addName(nanoframe, Strings.NANOFRAME_NAME);
	}
	
}
