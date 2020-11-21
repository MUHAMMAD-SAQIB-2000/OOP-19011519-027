package com.system;

import com.system.customer.Customer;
import com.system.foodItem.FoodItemDao;
import com.system.foodItemdeals.FoodItemDeals;

public class Main {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setCustomerBill(0);
		System.out.println("Is it working?");
		FoodItemDao foodItem = new FoodItemDao();
		foodItem.addFoodItem();
		foodItem.addFoodItem();
		foodItem.addFoodItem();
		FoodItemDeals.test();
		//foodItem.getAll();
		//foodItem.test();
		
	}

}
