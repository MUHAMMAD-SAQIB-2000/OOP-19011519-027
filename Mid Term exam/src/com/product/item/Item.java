package com.product.item;



public class Item {
	
	public static String itemFile = "C:\\Users\\Cyan Dancer 197\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\Mid Term exam\\itemDataFile.csv";
	
	private int ITEM_ID;
	
	private int ITEM_PRICE;
	
	private String ITEM_NAME;
	


	public int getITEM_ID() {
		return ITEM_ID;
	}

	public void setITEM_ID(int iTEM_ID) {
		ITEM_ID = iTEM_ID;
	}

	public int getITEM_PRICE() {
		return ITEM_PRICE;
	}

	public void setITEM_PRICE(int iTEM_PRICE) {
		ITEM_PRICE = iTEM_PRICE;
	}

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	
	
	public String toString() {
		String str = null;
		
		str = this.ITEM_ID +" "+this.ITEM_NAME+" "+this.ITEM_PRICE;
		
		return str;
	}

}
