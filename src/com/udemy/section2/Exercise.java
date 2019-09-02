package com.udemy.section2;

public class Exercise {
	public boolean isArraySequence(int[] a, int i) {
		if (i == a.length - 1) {
			return true;
		}
		return (isArraySequence(a, i + 1)) && (a[i] + 1 == a[i + 1]);
	}
	
	public int digitSumCount(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+digitSumCount(n/10);
	}
}
