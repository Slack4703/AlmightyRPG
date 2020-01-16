package com.slack43.almightyrpg.tools;

import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter 
{
	public static void main(String[] args) 
	{
		
	}
	
	public static void WriteItemJSON(String name)
	{
		WriteFilesItem(name);
	}
	
	public static void WriteBlockJSON(String name) 
	{
		WriteFilesBlockItem(name);
		WriteFilesBlockModel(name);
		WriteFilesBlockState(name);
	}
	
	private static void WriteFilesBlockModel(String name) 
	{
		// Write JSON file
		try (FileWriter file = new FileWriter("C:\\Users\\Alan\\Desktop\\Dokumenty\\AlmightyRPG\\AlmightyRPG\\src\\main\\resources\\assets\\almightyrpg\\models\\block\\" + name + ".json")) 
		{
			String whatToWrite = "{\r\n" + "   \"parent\": \"block/cube_all\",\r\n" + "   \"textures\": {\r\n"
					+ "       \"all\": \"almightyrpg:blocks/" + name + "\"\r\n" + "   }\r\n" + "}";
			file.write(whatToWrite);
			file.flush();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	private static void WriteFilesBlockItem(String name) 
	{
		// Write JSON file
		try (FileWriter file = new FileWriter("C:\\Users\\Alan\\Desktop\\Dokumenty\\AlmightyRPG\\AlmightyRPG\\src\\main\\resources\\assets\\almightyrpg\\models\\item\\" + name + ".json")) 
		{
			String whatToWrite = "{\r\n" + 
					"   \"parent\": \"almightyrpg:block/" + name + "\"\r\n" + 
					"}";
			file.write(whatToWrite);
			file.flush();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	private static void WriteFilesBlockState(String name) 
	{
		// Write JSON file
		try (FileWriter file = new FileWriter("C:\\Users\\Alan\\Desktop\\Dokumenty\\AlmightyRPG\\AlmightyRPG\\src\\main\\resources\\assets\\almightyrpg\\blockstates\\" + name + ".json")) 
		{
			String whatToWrite = "{\r\n" + 
					"    \"variants\": {\r\n" + 
					"        \"normal\": { \"model\": \"almightyrpg:" + name +"\" }\r\n" + 
					"    }\r\n" + 
					"}";
			file.write(whatToWrite);
			file.flush();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	private static void WriteFilesItem(String name) 
	{
		// Write JSON file
		try (FileWriter file = new FileWriter("C:\\Users\\Alan\\Desktop\\Dokumenty\\AlmightyRPG\\AlmightyRPG\\src\\main\\resources\\assets\\almightyrpg\\models\\item\\" + name + ".json")) 
		{
			String whatToWrite = "{\r\n" + 
					"   \"parent\": \"item/generated\",\r\n" + 
					"   \"textures\": {\r\n" + 
					"       \"layer0\": \"almightyrpg:items/"+ name +"\"\r\n" + 
					"   }\r\n" + 
					"}";
			file.write(whatToWrite);
			file.flush();
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
