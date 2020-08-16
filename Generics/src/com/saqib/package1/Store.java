package com.saqib.package1;

public class Store<T> {
	
	private T item;	
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	@Override
	public String toString() {
		return " " + item.toString();
	}
}
