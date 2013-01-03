package ninjapancakes87.morestuff.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.*;

public class BlockRB extends Block {
	
	public BlockRB(int par1, int par2){
		super(par1, par2, Material.rock);
		
		this.setCreativeTab(CreativeTabs.tabDecorations);
		
		this.setHardness(5);
		
		this.setResistance(10F);
		
		this.setLightValue(20F);
		
		this.setStepSound(this.soundMetalFootstep);
	}

	@Override
	public String getTextureFile(){
		return "/gfx/MoreStuff/blocks.png";
	}
}