package ninjapancakes87.morestuff.common;

import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class WorldgeneratorOres implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		
		 switch (world.provider.dimensionId)
		 {
		 case 0: generateSurface(world, random, chunkX*16, chunkZ*16);
		 }
	}
	
    /**
     * @param blockX The south edge of the chunk
     * @param blockZ The west edge of the chunk
     */
	 private void generateSurface(World world, Random random, int blockX, int blockZ) 
	 {
	 	// will generate the ore 10 times per chunk
	 	int GenRate = 2;
		 for (int i = 0; i < GenRate; ++i) {
			 int Xcoord = blockX + random.nextInt(16);
			 int Ycoord = random.nextInt(60);
		 	int Zcoord = blockZ + random.nextInt(16);

		 (new WorldGenMinable(mod_MoreStuff.CorundumOre.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);}		 
		 
		 // will only generate twice
		 GenRate = 10;
		 for (int i = 0; i < GenRate; ++i) {
			 int Xcoord = blockX + random.nextInt(16);
			 int Ycoord = random.nextInt(60);
			 int Zcoord = blockZ + random.nextInt(16);
		 
		 (new WorldGenMinable(mod_MoreStuff.ZirconOre.blockID, 10)).generate(world, random, Xcoord, Ycoord, Zcoord);}		 
	 }

}
