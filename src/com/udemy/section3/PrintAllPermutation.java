package com.udemy.section3;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllPermutation {
	public void permutation(int[] a, ArrayList<Integer> partial, boolean[] used) {
		if(partial.size()==a.length) {
			System.out.println(Arrays.toString(partial.toArray()));
			return;
		}
		for(int i=0; i<a.length;i++) {
			if(!used[i]) {
				partial.add(a[i]);
				used[i]=true;
				permutation(a, partial, used);
				used[i]=false;
				partial.remove(partial.size()-1);
			}
		}
		
	}

}
