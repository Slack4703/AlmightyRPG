package com.slack43.almightyrpg.blocks;

import java.util.ArrayList;
import java.util.Random;

import com.slack43.almightyrpg.Main;
import com.slack43.almightyrpg.initialization.ModBlocks;
import com.slack43.almightyrpg.initialization.ModItems;
import com.slack43.almightyrpg.utility.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.particle.ParticleManager;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ExpOre extends Block implements IHasModel {

	public ExpOre(String name,Material materialIn) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("PICKAXE", 1);
		setHardness(1f);
		setLightLevel(5f);
		setResistance(100f);
		setCreativeTab(ModItems.ARPG_TAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		// TODO Auto-generated method stub
		return 15;
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.RegisterItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}

}
