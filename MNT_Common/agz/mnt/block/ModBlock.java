package agz.mnt.block;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import agz.mnt.lib.BlockID;
import agz.mnt.lib.Strings;
import net.minecraft.block.Block;

public class ModBlock {

	
	public static Block BlockNanoFrame;
	
	
	public static void init(){
		
		
		BlockNanoFrame = new BlockNanoFrame(BlockID.BLOCK_NANOFRAME_ID);
		
		
		
		GameRegistry.registerBlock(BlockNanoFrame, Strings.BLOCK_NANOFRAME_NAME);
		
		
		//Sets in-game names of the blocks.
		LanguageRegistry.addName(BlockNanoFrame, Strings.BLOCK_NANOFRAME_GAME_NAME);
	}
}
