package com.udemy.section3;

import java.util.HashSet;

public class SelectingKIntegersFromASet {
	public void selectIntegers(int[] input, int k, HashSet<Integer> set, int start ) {
		if(set.size()==k) {
			System.out.println(set);
			return;
		}
		if(start==input.length) {
			return;
		}
		for(int i=start;i<input.length;i++) {
			set.add(input[i]);
			selectIntegers(input, k, set, i+1);
			set.remove(input[i]);
		}
	}

}
