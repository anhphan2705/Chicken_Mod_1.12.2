package com.chickenmod.util.handlers;

import java.util.ArrayList;
import com.chickenmod.init.ModItems;
import com.chickenmod.util.loot.LootUtils;
import com.chickenmod.util.loot.LootUtils.ICondition;
import com.chickenmod.util.loot.LootUtils.IMethod;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.LootingEnchantBonus;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


import com.chickenmod.init.ModItems;
import com.chickenmod.util.loot.LootUtils;
import com.chickenmod.util.loot.LootUtils.ICondition;
import com.chickenmod.util.loot.LootUtils.IMethod;

import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.KilledByPlayer;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraft.world.storage.loot.functions.LootingEnchantBonus;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class LootEventHandler {
	
	@SubscribeEvent
	public static void lootTableLoad(LootTableLoadEvent event) {
		
		LootTable loot = event.getTable();
		
		if(LootTableList.field_186394_B.equals(event.getName())) {
			
			LootUtils.addItemToTable(loot, ModItems.CHICKEN_PEARL, 1, 2F, 0.1F, 1, 1, 0F, 1F, "cm:chicken_pearl",
			new IMethod() {
				@Override
				public void FunctionsCallback(ArrayList<LootFunction> lootfuncs) {
					LootFunction looting = new LootingEnchantBonus(null, new RandomValueRange(0,1), 2);
					lootfuncs.add(looting);
				}
			},
			new ICondition() {
				@Override
				public void FunctionsCallback(ArrayList<LootCondition> lootconds) {
					lootconds.add(new KilledByPlayer(!true));
				}
			});
		}
	}
	
	//Second way of making a drop item
	/*
	if (LootTableList.ENTITIES_CHICKEN.equals(event.getName()))
	{ 
		event.getTable().getPool("main").addEntry(new LootEntryItem(
			<reference to your item>,
			<weight>,
			<quality>,
			<Lootfunction array>,
			<Lootcondition array>,
			<name for the entry>)); 
	}
	*/
	
}
