package com.slack43.almightyrpg.items;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.ARPG_TAB);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(this,0,"inventory");
	}

}
