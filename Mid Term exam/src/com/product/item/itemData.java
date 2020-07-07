package com.product.item;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class itemData {
	
	@SuppressWarnings("resource")
	public static List<Item> findAll()  {
		List<Item> items = new ArrayList<Item>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Item.itemFile));
			// reading data from file and storing it in a List to be displayed
			while ((line = bufferreader.readLine()) != null) {
				Item item= new Item();
				String[] itemRow = line.split(",");
				
				item.setITEM_ID(Integer.parseInt(itemRow[0]));
				item.setITEM_NAME(itemRow[1]);
				item.setITEM_PRICE(Integer.parseInt(itemRow[2]));
				
				items.add(item);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return items;
	}
	
	@SuppressWarnings("resource")
	public static Item findOne(int ITEM_ID)  {
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Item.itemFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Item item= new Item();
				String[] itemRow = line.split(",");
				
				if (Integer.parseInt(itemRow[0]) == ITEM_ID) {
										
					item.setITEM_ID(Integer.parseInt(itemRow[0]));
					item.setITEM_NAME(itemRow[2]);
					item.setITEM_PRICE(Integer.parseInt(itemRow[3]));
					
					return item;
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

		public static Item Save(Item item) {
		FileWriter filewriter;

		List<Item> items = findAll();

		try {
			filewriter = new FileWriter(Item.itemFile);

			for (int i=0; i<items.size(); i++) {
				filewriter.append(items.get(i).toString());
				filewriter.append("\n");
			}
			if (items.size()>0)
				item.setITEM_ID(items.get(items.size()-1).getITEM_ID()+1);
			else
				item.setITEM_ID(1);
			filewriter.append(item.toString());
			filewriter.append("\n");
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return item;
	}
	public static Item deleteOne(int ITEM_ID)  {
		FileWriter filewriter;

		List<Item> items = findAll();
		Item item = findOne(ITEM_ID);

		try {
			filewriter = new FileWriter(Item.itemFile);

			for (int i=0; i<items.size(); i++) {
				if (items.get(i).getITEM_ID() != ITEM_ID) {
					filewriter.append(items.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return item;
	}
}
