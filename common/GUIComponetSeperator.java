package ninjapancakes87.morestuff.common;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GUIComponetSeperator extends GuiContainer {

	public GUIComponetSeperator(Container ContainerComponetSeperator) {
		super(ContainerComponetSeperator);
		
	}

    protected void drawGuiContainerForegroundLayer(int par1, int par2) {

        this.drawDefaultBackground();
    }

    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3) {

        int var4 = this.mc.renderEngine.getTexture("/gui/GUIComponetSeperator.png");
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.renderEngine.bindTexture(var4);
        int var5 = (this.width - this.xSize) / 2;
        int var6 = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(var5, var6, 0, 0, this.xSize, this.ySize);
    }

}

