package ninjapancakes87.morestuff.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.src.*;
import net.minecraft.world.World;

public class ItemRazor extends Item{
	
	public ItemRazor(int par1){
		super(par1);
		
		this.setCreativeTab(CreativeTabs.tabTools);
	}
	
	@Override
	public String getTextureFile(){
		return "/gfx/MoreStuff/items.png";
	}
}
