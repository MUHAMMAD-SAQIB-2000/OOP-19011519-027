package com.system.foodItem;

public class FoodItem {

	private Integer foodItemId;
	private String foodItemName;
	private Integer foodItemPrice;
	private Integer foodItemQuantity;
	private char foodItemSize;
	private boolean isAvailable;
	
	public FoodItem() {}

	public FoodItem(Integer foodItemId, String foodItemName, Integer foodItemPrice, Integer foodItemQuantity,
			char foodItemSize, boolean isAvailable) {
		this.foodItemId = foodItemId;
		this.foodItemName = foodItemName;
		this.foodItemPrice = foodItemPrice;
		this.foodItemQuantity = foodItemQuantity;
		this.foodItemSize = foodItemSize;
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "FoodItem [foodItemId=" + foodItemId + ", foodItemName=" + foodItemName + ", foodItemPrice="
				+ foodItemPrice + ".PKR, foodItemQuantity=" + foodItemQuantity + ", foodItemSize=" + foodItemSize
				+", isAvailable=" + isAvailable + "]";
	}

	public Integer getFoodItemId() {
		return foodItemId;
	}

	public void setFoodItemId(Integer foodItemId) {
		this.foodItemId = foodItemId;
	}

	public String getFoodItemName() {
		return foodItemName;
	}

	public void setFoodItemName(String foodItemName) {
		this.foodItemName = foodItemName;
	}

	public Integer getFoodItemPrice() {
		return foodItemPrice;
	}

	public void setFoodItemPrice(Integer foodItemPrice) {
		this.foodItemPrice = foodItemPrice;
	}

	public Integer getFoodItemQuantity() {
		return foodItemQuantity;
	}

	public void setFoodItemQuantity(Integer foodItemQuantity) {
		this.foodItemQuantity = foodItemQuantity;
	}

	public char getFoodItemSize() {
		return foodItemSize;
	}

	public void setFoodItemSize(char foodItemSize) {
		this.foodItemSize = foodItemSize;
	}
	
	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
}
