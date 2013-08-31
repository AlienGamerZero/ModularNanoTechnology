package agz.mnt.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import agz.mnt.ModularNanoTechnology;
import agz.mnt.lib.ModInfo;
import agz.mnt.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;



public class BlockNanoFrame extends Block{
	
	  
	public BlockNanoFrame(int id){
		super(id, Material.iron);
		this.setUnlocalizedName(Strings.BLOCK_NANOFRAME_NAME);
		this.setCreativeTab(ModularNanoTechnology.tabMNT);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		
		blockIcon = iconRegister.registerIcon(String.format("%s:%s", ModInfo.MOD_ID, this.getUnwrappedUnlocalizedName(this.getUnlocalizedName()) ));
	}
	
	protected String getUnwrappedUnlocalizedName(String name){
		return name.substring(name.indexOf(".")+1);
	}
	
}
