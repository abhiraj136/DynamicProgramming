package com.udemy.section2;

public class MaxFromAnArray {
	
	public int findMax(int[] a, int i) {
		if(i==0) {
			return a[0];
		}
		else {
			return (Math.max(a[i],findMax(a,i-1)));
		}
		
		
	}

}
