package com.system.foodItem;

import java.util.LinkedList;

public class FoodItemDao {

	public static LinkedList<FoodItem> foodItems = new LinkedList<>();
	
	public FoodItem addFoodItem() {
		FoodItem foodItem = new FoodItem();
		foodItem.setFoodItemId(FoodItemDao.foodItems.size()+1);
		foodItem.setFoodItemName("Zinger Burger");
		foodItem.setFoodItemPrice(200);
		foodItem.setFoodItemQuantity(2);
		foodItem.setFoodItemSize('L');
		foodItem.setAvailable(true);
		foodItems.add(foodItem);
		return foodItem;
	}
	
	public static FoodItem getById(int id) {
		//FoodItem foodItem = new FoodItem();
		return foodItems.get(id);
	}
	
	public void getAll() {
		foodItems.forEach(food -> System.out.println(food.toString()));
	}
	
	public void updateFoodItem() {
		FoodItem foodItem = foodItems.get(2);
		foodItem.setFoodItemId(foodItem.getFoodItemId());
		foodItem.setFoodItemName("Patty Burger");
		foodItem.setFoodItemPrice(foodItem.getFoodItemPrice());
		foodItem.setFoodItemQuantity(foodItem.getFoodItemQuantity());
		foodItem.setFoodItemSize(foodItem.getFoodItemSize());
		foodItem.setAvailable(foodItem.isAvailable());
		foodItems.set(2, foodItem );
	}
	
	public void deleteFoodItem() {
		foodItems.remove(1);
	}
	
	public void test() {
		double sum = 0;
		for (FoodItem f : foodItems) {
			sum += f.getFoodItemPrice();
		}
		System.out.println("Sum is: " + (sum - ((sum/100)*20)));
	}

}
