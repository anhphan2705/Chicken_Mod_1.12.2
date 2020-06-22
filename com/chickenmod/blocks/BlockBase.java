package com.chickenmod.blocks;

import com.chickenmod.Main;
import com.chickenmod.init.ModBlocks;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{
	public BlockBase(String name, Material material){
		super(material);
		func_149663_c(name);
		setRegistryName(name);
		func_149647_a(CreativeTabs.field_78030_b);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(Item.func_150898_a(this), 0, "inventory");
		
	}
}
