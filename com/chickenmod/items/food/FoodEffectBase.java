package com.chickenmod.items.food;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class FoodEffectBase extends FoodBase {
	
	PotionEffect effect;
	PotionEffect effect1;
	PotionEffect effect2;
	PotionEffect effect3;
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect effect) 
	{
		super(name, amount, saturation, isWolfFood);
		
		func_77848_i();
		
		this.effect = effect;
	}
	
	public FoodEffectBase(String name, int amount, float saturation, boolean isWolfFood, PotionEffect effect, PotionEffect effect1, PotionEffect effect2, PotionEffect effect3) 
	{
		super(name, amount, saturation, isWolfFood);
		
		func_77848_i();
		
		this.effect = effect;
		this.effect1 = effect1;
		this.effect2 = effect2;
		this.effect3 = effect3;
	}

	@Override 
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player) 
	{
		
		if (!worldIn.field_72995_K) {
			player.func_70690_d(new PotionEffect(effect.func_188419_a(), effect.func_76459_b(), effect.func_76458_c(), effect.func_82720_e(), effect.func_188418_e()));
			
			if (effect1 != null && effect2 != null && effect3 != null)
			{
				player.func_70690_d(new PotionEffect(effect1.func_188419_a(), effect1.func_76459_b(), effect1.func_76458_c(), effect1.func_82720_e(), effect1.func_188418_e()));
				player.func_70690_d(new PotionEffect(effect2.func_188419_a(), effect2.func_76459_b(), effect2.func_76458_c(), effect2.func_82720_e(), effect2.func_188418_e()));
				player.func_70690_d(new PotionEffect(effect3.func_188419_a(), effect3.func_76459_b(), effect3.func_76458_c(), effect3.func_82720_e(), effect3.func_188418_e()));
			}
		}

	}
	
	@SideOnly(Side.CLIENT)
	public boolean func_77636_d(ItemStack stack) 
	{
		return true;
	}
}
