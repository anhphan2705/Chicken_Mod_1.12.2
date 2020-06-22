package com.chickenmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ChickenPearlBlock extends BlockBase {

	public ChickenPearlBlock(String name, Material material) {
		super(name, material);
		
		func_149672_a(SoundType.field_185852_e);
		func_149711_c(25.0F);									//Reference: 0.5 = dirt  		50 = obsidian
		func_149752_b(25.5F);								//Reference: 1200 = Obsidian  	1 = pumpkin
		setHarvestLevel("pickaxe", 2);						// 0 = wood		1 = rock 	2 = iron 	3 = diamond 	
		func_149715_a(10);									//Reference: 14 = torch
		//setLightOpacity();								This is for making window type block
		//setBlockUnbreakable();							Make the block unbreakable
	}

}
