package com.udemy.section2;

public class Exercise {
	public boolean isArraySequence(int[] a, int i) {
		if (i == a.length - 1) {
			return true;
		}
		return (isArraySequence(a, i + 1)) && (a[i] + 1 == a[i + 1]);
	}
}
