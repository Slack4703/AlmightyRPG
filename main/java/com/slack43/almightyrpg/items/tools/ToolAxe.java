package com.slack43.almightyrpg.items.tools;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class ToolAxe extends ItemAxe implements IHasModel
{
	public ToolAxe(String name, ToolMaterial material, float damage, float attackSpeed) 
	{
		super(material,damage,attackSpeed);
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
