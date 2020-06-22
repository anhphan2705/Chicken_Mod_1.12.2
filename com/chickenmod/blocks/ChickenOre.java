package com.chickenmod.blocks;

import java.util.Random;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;


import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class ChickenOre extends BlockBase implements IHasModel{

	public ChickenOre(String name, Material material) {
		super(name, material);
		
		func_149672_a(SoundType.field_185851_d);
		func_149711_c(10.0F);									
		func_149752_b(15.0F);								
		setHarvestLevel("pickaxe", 2);						
	}
	
	//What item do you want it to drop
	@Override
	public Item func_180660_a(IBlockState state, Random rand, int fortune )
	{
		return ModItems.CHICKEN_PEARL;
		
	}
	
	//The quantity of the item dropped
	/**	@Override 
		public int quantityDropped(Random rand) 
		{
			int max = 3;
			int min = 1;
			return rand.nextInt(max) + min;
		
		}
	**/	
	
}
