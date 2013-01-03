package ninjapancakes87.morestuff.common;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.src.*;

import java.awt.image.BufferedImage;

import org.lwjgl.opengl.GL11;

public class GUIComponetSeperator extends GuiScreen{

	private BufferedImage img;
	private int imgID = 1000;
	
	public GUIComponetSeperator() {
		
	}
	public void initGUI(){
		
		try{
			img = ModLoader.loadImage(mc.renderEngine, "/gfx/MoreStuff/GUIComponetSeperator.png");
			mc.renderEngine.setupTexture(img, imgID);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public boolean doesGuiPauseGame(){
		return false;
	}
	public void drawscreen(int i, int j, float f)
	{
		drawDefaultBackground();
		int x = width / 2 - 120;
		int y = height / 2 - 100;
		try{
			int tempvar = mc.renderEngine.getTexture("/gfx/MoreStuff/GUIComponetSeperator.png");
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			mc.renderEngine.bindTexture(tempvar);
			drawTexturedModalRect(x, y, 0, 0, 176, 166);
		}finally{}
		super.drawScreen(i, j, f);
	}
}

