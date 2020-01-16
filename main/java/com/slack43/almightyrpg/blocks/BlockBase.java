package com.slack43.almightyrpg.blocks;

import java.io.FileWriter;
import java.io.IOException;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModBlocks;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.tools.JSONWriter;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import scala.util.parsing.json.JSONObject;

public class BlockBase extends Block implements IHasModel
{
	
	public BlockBase(String name, Material material, float hardness, String toolClass, int harvestLevel,int resistance) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.ARPG_TAB);
		setHardness(hardness);
		setHarvestLevel(toolClass, harvestLevel);
		setResistance(resistance);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
