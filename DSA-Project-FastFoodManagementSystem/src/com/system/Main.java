package com.system;

import com.system.customer.Customer;
import com.system.foodItem.FoodItemDao;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerBill(0);
		FoodItemDao foodItem = new FoodItemDao();
		foodItem.addFoodItem();
		foodItem.addFoodItem();
		foodItem.addFoodItem();
		foodItem.updateFoodItem();
		foodItem.addFoodItem();
		//foodItem.deleteFoodItem();
		foodItem.getAll();
		foodItem.test();
		
	}

}
