package com.product.customer;

public class Customer {
	public static String customerFile = "C:\\Users\\Cyan Dancer 197\\Documents\\workspace-spring-tool-suite-4-4.5.1.RELEASE\\Mid Term exam\\customerDataFile.csv";
	
	private String 	CUSTOMER_NAME;
	
	private int CUSTOMER_ID;
	
	private int CUSTOMER_BILL;

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public int getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(int cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public int getCUSTOMER_BILL() {
		return CUSTOMER_BILL;
	}

	public void setCUSTOMER_BILL(int cUSTOMER_BILL) {
		CUSTOMER_BILL = cUSTOMER_BILL;
	}
	
	public String toString() {
		String str = null;
		
		str = this.CUSTOMER_ID +" "+this.CUSTOMER_NAME+" "+this.CUSTOMER_BILL;
		
		return str;
	}
	
	

}
