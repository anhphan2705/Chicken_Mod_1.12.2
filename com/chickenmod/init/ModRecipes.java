package com.chickenmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.CHICKEN_PEARL, new ItemStack(ModItems.CHICKEN_MAGIC_FRUIT, 1), 4.0f);
	}
}
