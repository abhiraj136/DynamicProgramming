package com.udemy.section2;

public class Palidrome {

	public boolean isPalindrome(String a, int i, int j) {
		if (i >= j) {
			return true;
		}
		return ((a.charAt(i) == a.charAt(j)) && (isPalindrome(a, i + 1, j - 1)));

	}
}
