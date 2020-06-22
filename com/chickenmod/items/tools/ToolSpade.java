package com.chickenmod.items.tools;

import com.chickenmod.Main;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class ToolSpade extends ItemSpade implements IHasModel{
	
	public ToolSpade(String name, ToolMaterial material){
		super(material);
		func_77655_b(name);
		setRegistryName(name);
		func_77637_a(CreativeTabs.field_78040_i);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModel() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}
}
