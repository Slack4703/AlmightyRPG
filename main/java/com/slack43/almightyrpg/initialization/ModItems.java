package com.slack43.almightyrpg.initialization;

import java.util.ArrayList;
import java.util.List;

import com.slack43.almightyrpg.items.ItemBase;
import com.slack43.almightyrpg.items.armor.ArmorBase;
import com.slack43.almightyrpg.items.tools.ToolAxe;
import com.slack43.almightyrpg.items.tools.ToolHoe;
import com.slack43.almightyrpg.items.tools.ToolPickaxe;
import com.slack43.almightyrpg.items.tools.ToolSpade;
import com.slack43.almightyrpg.items.tools.ToolSword;
import com.slack43.almightyrpg.utility.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Creative Tabs
	public static final CreativeTabs ARPG_TAB = (new CreativeTabs("almightyrpgtab") 
	{
			
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(RISTALL);
		}
	});
	
	//Items
	public static final Item RISTALL = new ItemBase("ristall");
	public static final Item RISTALL_SHARD = new ItemBase("ristall_shard");
	
	//Materials
	public static final ArmorMaterial RISTALL_ARMOR = EnumHelper.addArmorMaterial("ristall_armor", Reference.MOD_ID + ":ristall", 16, new int[] {4,7,9,5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ToolMaterial RISTALL_MATERIAL = EnumHelper.addToolMaterial("ristall", 4, 750, 9.0f, 4.0F, 10);

	//Tools
	public static final ItemSword RISTALL_SWORD = new ToolSword("ristall_sword",RISTALL_MATERIAL);
	public static final ItemSpade RISTALL_SHOVEL = new ToolSpade("ristall_shovel",RISTALL_MATERIAL);
	public static final ItemPickaxe RISTALL_PICKAXE = new ToolPickaxe("ristall_pickaxe",RISTALL_MATERIAL);
	public static final ItemAxe RISTALL_AXE = new ToolAxe("ristall_axe",RISTALL_MATERIAL,9.0f,-3.0f);
	public static final ItemHoe RISTALL_HOE = new ToolHoe("ristall_hoe",RISTALL_MATERIAL);
	
	//Armor
	public static final Item RISTALL_HELMET = new ArmorBase("ristall_helmet", RISTALL_ARMOR, 1, EntityEquipmentSlot.HEAD, ARPG_TAB);
	public static final Item RISTALL_CHESTPLATE = new ArmorBase("ristall_chestplate", RISTALL_ARMOR, 1, EntityEquipmentSlot.CHEST, ARPG_TAB);;
	public static final Item RISTALL_LEGGINGS = new ArmorBase("ristall_leggings", RISTALL_ARMOR, 2, EntityEquipmentSlot.LEGS, ARPG_TAB);
	public static final Item RISTALL_BOOTS = new ArmorBase("ristall_boots", RISTALL_ARMOR, 1, EntityEquipmentSlot.FEET, ARPG_TAB);

}
