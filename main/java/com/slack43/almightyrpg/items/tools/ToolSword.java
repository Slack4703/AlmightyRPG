package com.slack43.almightyrpg.items.tools;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel
{
	public ToolSword(String name, ToolMaterial material) 
	{
		super(material);
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
