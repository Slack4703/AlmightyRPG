package com.slack43.almightyrpg.items.food;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class EffectCristall extends ItemFood implements IHasModel
{
	public EffectCristall(String name,int amount, float saturation, boolean isWolfFood,PotionEffect effect, float probability) {
		super(amount, saturation, isWolfFood);		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.ARPG_TAB);
		setPotionEffect(effect, probability);
		setAlwaysEdible();
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(this,0,"inventory");
	}

}
