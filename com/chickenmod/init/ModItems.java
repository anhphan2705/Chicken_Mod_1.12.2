package com.chickenmod.init;

import java.util.ArrayList;
import java.util.List;
import com.chickenmod.items.ItemBase;
import com.chickenmod.items.armor.ArmorBase;
import com.chickenmod.items.food.FoodEffectBase;
import com.chickenmod.items.tools.ToolAxe;
import com.chickenmod.items.tools.ToolHoe;
import com.chickenmod.items.tools.ToolPickaxe;
import com.chickenmod.items.tools.ToolSpade;
import com.chickenmod.items.tools.ToolSword;
import com.chickenmod.util.Reference;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;


import com.chickenmod.items.ItemBase;
import com.chickenmod.items.armor.ArmorBase;
//import com.chickenmod.items.food.FoodBase;
import com.chickenmod.items.food.FoodEffectBase;
import com.chickenmod.items.tools.ToolAxe;
import com.chickenmod.items.tools.ToolHoe;
import com.chickenmod.items.tools.ToolPickaxe;
import com.chickenmod.items.tools.ToolSpade;
import com.chickenmod.items.tools.ToolSword;
import com.chickenmod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_CHICKEN = EnumHelper.addToolMaterial("material_chicken", 3, 1100, 12.0F, 4.4F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_CHICKEN = EnumHelper.addArmorMaterial("armor_material_chicken", Reference.MOD_ID + ":chicken_pearl", 14, 
			new int[] {5, 8, 10, 5} , 10, SoundEvents.field_187716_o, 0.0F);
	
	//Items
	public static final Item CHICKEN_PEARL = new ItemBase("chicken_pearl");
	
	//Tools
	public static final ItemSword CHICKEN_SWORD = new ToolSword("chicken_sword", MATERIAL_CHICKEN);
	public static final ItemSpade CHICKEN_SHOVEL = new ToolSpade("chicken_shovel", MATERIAL_CHICKEN);
	public static final ItemPickaxe CHICKEN_PICKAXE = new ToolPickaxe("chicken_pickaxe", MATERIAL_CHICKEN);
	public static final ItemAxe CHICKEN_AXE = new ToolAxe("chicken_axe", MATERIAL_CHICKEN);
	public static final ItemHoe CHICKEN_HOE = new ToolHoe("chicken_hoe", MATERIAL_CHICKEN);
	
	//Armor
	public static final Item CHICKEN_HELMET = new ArmorBase("chicken_helmet", ARMOR_MATERIAL_CHICKEN, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHICKEN_CHESTPLATE = new ArmorBase("chicken_chestplate", ARMOR_MATERIAL_CHICKEN, 1, EntityEquipmentSlot.CHEST);
	public static final Item CHICKEN_LEGGINGS = new ArmorBase("chicken_leggings", ARMOR_MATERIAL_CHICKEN, 2, EntityEquipmentSlot.LEGS);
	public static final Item CHICKEN_BOOTS = new ArmorBase("chicken_boots", ARMOR_MATERIAL_CHICKEN, 1, EntityEquipmentSlot.FEET);
	
	//FOOD
	//public static final Item CHICKEN_MAGIC_FRUIT = new FoodBase("chicken_magic_fruit", 4, 1.6F, false);
	public static final Item CHICKEN_MAGIC_FRUIT = new FoodEffectBase("chicken_magic_fruit", 4, 2.4F, false, 
			new PotionEffect(MobEffects.field_76430_j, (60*30), 1, false, true), 
			new PotionEffect(MobEffects.field_76424_c, (60*30), 0, false, true), 
			new PotionEffect(MobEffects.field_188425_z, (60*30), 0, false, true), 
			new PotionEffect(MobEffects.field_76439_r, (60*30), 0, false, true)
	);
}
