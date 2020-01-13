package com.slack43.almightyrpg.blocks;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModBlocks;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.ARPG_TAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
