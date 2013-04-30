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
		nanoframe = new BlockNanoFrame(BlockID.NANOFRAME, Material.rock).setUnlocalizedName("nanoframe").setMaxStackSize(64).setResistance(200).setHardness(200);
		
		GameRegistry.registerBlock(nanoframe, Strings.NANOFRAME_NAME);
		//you don't see this????
		LanguageRegistry.addName(nanoframe, Strings.NANOFRAME_NAME);
	}
	
}
