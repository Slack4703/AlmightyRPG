package com.slack43.almightyrpg.initialization;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void Init() 
	{
		GameRegistry.addSmelting(ModBlocks.RISTALL_ORE, new ItemStack(ModItems.RISTALL,1), 3f);
		GameRegistry.addSmelting(Items.EGG, new ItemStack(ModItems.ROASTED_EGG,1), 0.5f);
	}
}
