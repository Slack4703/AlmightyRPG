package com.slack43.almightyrpg.blocks;


import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModBlocks;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.tools.JSONWriter;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class AdvancedBlockBase extends Block implements IHasModel
{
	public AdvancedBlockBase(String name, Material material, float hardness, String toolClass, int level, int lightLevel, float resistance, SoundType sound) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModItems.ARPG_TAB);
		setHardness(hardness);
		setHarvestLevel(toolClass, level);
		setLightLevel(lightLevel);
		setResistance(resistance);
		setSoundType(sound);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
