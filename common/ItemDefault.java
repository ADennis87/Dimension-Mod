package ninjapancakes87.morestuff.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.src.*;

public class ItemDefault extends Item{
	
	public ItemDefault(int par1){
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@Override
	public String getTextureFile(){
		return "/gfx/MoreStuff/items.png";
	}
}
