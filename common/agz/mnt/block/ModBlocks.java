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
		nanoframe = new BlockNanoFrame(BlockID.ID_NANOFRAME_DEFAULT, Material.rock);
		
		GameRegistry.registerBlock(nanoframe, Strings.NANOFRAME_NAME);
		
		LanguageRegistry.addName(nanoframe, Strings.NANOFRAME_NAME);
	}
	
}
