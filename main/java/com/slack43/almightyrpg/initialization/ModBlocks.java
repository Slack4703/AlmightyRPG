package com.slack43.almightyrpg.initialization;

import java.util.ArrayList;
import java.util.List;

import com.slack43.almightyrpg.blocks.AdvancedBlockBase;
import com.slack43.almightyrpg.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ristall
	public static final Block RISTALL_ORE = new BlockBase("ristall_ore", Material.IRON);
	public static final Block RISTALL_BLOCK = new AdvancedBlockBase("ristall_block", Material.IRON, 5, "PICKAXE", 2, 0, 30, SoundType.METAL);
}
