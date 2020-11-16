package com.system.customer;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Customer {

	private Integer customerEntryNumber;
	private Integer customerMemberShipId;
	private String customerName;
	private Integer customerBill;
	private List<Integer> customerFoodItemIds = new ArrayList<>();
	private LocalDateTime customerFoodPurchasetime;
	
	public Customer() {}

	public Customer(Integer customerEntryNumber, Integer customerMemberShipId, String customerName,
			Integer customerBill, List<Integer> customerFoodItemId, LocalDateTime customerFoodPurchasetime) {
		this.customerEntryNumber = customerEntryNumber;
		this.customerMemberShipId = customerMemberShipId;
		this.customerName = customerName;
		this.customerBill = customerBill;
		this.customerFoodItemIds = customerFoodItemId;
		this.customerFoodPurchasetime = customerFoodPurchasetime;
	}

	@Override
	public String toString() {
		return "Customer [customerEntryNumber=" + customerEntryNumber + ", customerMemberShipId=" + customerMemberShipId
				+ ", customerName=" + customerName + ", customerBill=" + customerBill + ", customerFoodItemId="
				+ customerFoodItemIds + ", customerFoodPurchasetime=" + customerFoodPurchasetime + "]";
	}

	public Integer getCustomerEntryNumber() {
		return customerEntryNumber;
	}

	public void setCustomerEntryNumber(Integer customerEntryNumber) {
		this.customerEntryNumber = customerEntryNumber;
	}

	public Integer getCustomerMemberShipId() {
		return customerMemberShipId;
	}

	public void setCustomerMemberShipId(Integer customerMemberShipId) {
		this.customerMemberShipId = customerMemberShipId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Integer getCustomerBill() {
		return customerBill;
	}

	public void setCustomerBill(Integer customerBill) {
		this.customerBill = customerBill;
	}

	public List<Integer> getCustomerFoodItemIds() {
		return customerFoodItemIds;
	}

	public void setCustomerFoodItemIds(List<Integer> customerFoodItemIds) {
		this.customerFoodItemIds = customerFoodItemIds;
	}

	public LocalDateTime getCustomerFoodPurchasetime() {
		return customerFoodPurchasetime;
	}

	public void setCustomerFoodPurchasetime(LocalDateTime customerFoodPurchasetime) {
		this.customerFoodPurchasetime = customerFoodPurchasetime;
	}
	
}
