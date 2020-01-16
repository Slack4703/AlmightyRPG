package com.slack43.almightyrpg;

import com.slack43.almightyrpg.blocks.BlockBase;
import com.slack43.almightyrpg.initialization.ModBlocks;
import com.slack43.almightyrpg.initialization.ModRecipes;
import com.slack43.almightyrpg.proxy.CommonProxy;
import com.slack43.almightyrpg.tools.JSONWriter;
import com.slack43.almightyrpg.utility.Reference;
import com.slack43.almightyrpg.world.ModWorldGen;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event) 
	{
		ModRecipes.Init();
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) 
	{
		
	}
}
