package com.slack43.almightyrpg.initialization;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void Init() 
	{
		GameRegistry.addSmelting(ModBlocks.RISTALL_ORE, new ItemStack(ModItems.RISTALL,1), 3f);
	}
}
