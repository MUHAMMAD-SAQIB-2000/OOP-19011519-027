package com.saqib.package1;

public class BoundedTypeParameters {
	public <T extends Comparable<T>> T calculation (T t1, T t2) {
		if(t1.compareTo(t2) < 0) {
			return t1;
		}
		return t2;
	}
}
