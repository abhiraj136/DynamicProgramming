package com.udemy.section2;

public class TestClient {
	private static MaxFromAnArray mArray=new MaxFromAnArray();
	private static Palidrome palindrome=new Palidrome();

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] a= {1,2,3,9,4,6,3,-6,12,0};
		String s="g";
		System.out.println(mArray.findMax(a, a.length-1));
		System.out.println(palindrome.isPalindrome(s, 0,s.length()-1));
		

	}

}
