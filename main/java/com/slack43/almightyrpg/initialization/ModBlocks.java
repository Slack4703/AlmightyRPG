package com.slack43.almightyrpg.initialization;

import java.util.ArrayList;
import java.util.List;

import com.slack43.almightyrpg.blocks.AdvancedBlockBase;
import com.slack43.almightyrpg.blocks.BlockBase;
import com.slack43.almightyrpg.blocks.ExpOre;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ristall
	public static final Block RISTALL_ORE = new BlockBase("ristall_ore", Material.IRON,3f,"PICKAXE",3,5);
	public static final Block RISTALL_BLOCK = new AdvancedBlockBase("ristall_block", Material.IRON, 5, "PICKAXE", 2, 0, 30, SoundType.METAL);
	
	
	//Other
	public static final Block EXP_ORE = new ExpOre("exp_ore", Material.IRON);
	
	//Effect Cristalls
	public static final Block HEALTH_CRISTALL_ORE = new BlockBase("health_cristall_ore", Material.IRON,3f,"PICKAXE",3,5);
	 
	 
	
	
	
	
}
