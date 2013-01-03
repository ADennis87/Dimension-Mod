package ninjapancakes87.morestuff.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.src.*;
import net.minecraft.world.World;

public class BlockCS extends Block {
	
	public BlockCS(int par1, int par2){
		super(par1, par2, Material.rock);
		
		this.setCreativeTab(CreativeTabs.tabBlock);
		
		this.setHardness(15);
		
		this.setResistance(15F);
		
		this.setStepSound(this.soundMetalFootstep);
	}
	public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {
		ModLoader.openGUI(entityplayer, new GUIComponetSeperator());
	}
	@Override
	public String getTextureFile(){
		return "/gfx/MoreStuff/blocks.png";
	}
}