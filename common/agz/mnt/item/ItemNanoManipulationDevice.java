package agz.mnt.item;

import agz.mnt.ModularNanoTechnology;
import agz.mnt.block.BlockNanoFrame;
import agz.mnt.lib.BlockID;
import agz.mnt.lib.Reference;
import agz.mnt.lib.Strings;
import agz.mnt.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemTool;

public class ItemNanoManipulationDevice extends ItemTool {

	
	

	protected ItemNanoManipulationDevice(int id, int par2, EnumToolMaterial par3EnumToolMaterial, Block[] par4ArrayOfBlock){
		super(id, 0, par3EnumToolMaterial.EMERALD, par4ArrayOfBlock);
		this.setFull3D();
		this.setMaxStackSize(1);
		this.setMaxDamage(0);
		this.setUnlocalizedName(Strings.NANOMANIPULATIONDEVICE_NAME);
		this.setCreativeTab(ModularNanoTechnology.MNTtab);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){
		this.itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + Textures.TEXTURE_ITEM_NANOMANIPULATIONDEVICE);
	}
}
