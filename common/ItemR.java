package ninjapancakes87.morestuff.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemR extends Item{
	
	public ItemR(int par1){
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getTextureFile(){
		return "/gfx/MoreStuff/items.png";
	}
}
