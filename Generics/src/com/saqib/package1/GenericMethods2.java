package com.saqib.package1;

public class GenericMethods2 {
	public <T,K> void showArray(T[] array, K[] array1) {
		for(int i = 0 ; i<array.length ; i++) {
			System.out.print((array[i].toString() + array1[i].toString())+" " + "-> ");
		}
	}
}
