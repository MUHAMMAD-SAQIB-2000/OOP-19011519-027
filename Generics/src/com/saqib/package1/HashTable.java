package com.saqib.package1;

public class HashTable<K , V , S> {
	
	private K key;
	private V value;
	private S statement;
	
	public HashTable(K key, V value , S statement) {
		this.key = key;
		this.value = value;
		this.statement = statement;
	}
	
	@Override
	public String toString() {
		return "" + key.toString()+" "+ value.toString() + " " + statement.toString();
	}
}
