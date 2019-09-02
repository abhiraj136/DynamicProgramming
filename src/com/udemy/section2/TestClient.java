package com.udemy.section2;

import java.util.ArrayList;

import com.udemy.section3.*;

public class TestClient {
	private static MaxFromAnArray mArray=new MaxFromAnArray();
	private static Palidrome palindrome=new Palidrome();
    private static Exercise exercise=new Exercise();
    private static PrintAllPermutation permutation=new PrintAllPermutation();
  	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6,3};
		int[] b= {3,1,2};
		int n=1234111;
		ArrayList<Integer> partial = new ArrayList<>();
		boolean[] used = new boolean[b.length];
		String s="g";
		System.out.println(mArray.findMax(a, a.length-1));
		System.out.println(palindrome.isPalindrome(s, 0,s.length()-1));
		System.out.println(exercise.isArraySequence(a,0));
		System.out.println(exercise.digitSumCount(n));
		
		permutation.permutation(b, partial, used);

	}

}
