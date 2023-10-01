package com;

import java.util.Scanner;

class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String you would like to check palindrome or not ");
		String s = sc.nextLine();
		boolean res = getPalindrome(s);
		sc.close();
		if(res)
			System.out.println("it is palindrome");
		else
			System.out.println("it is not a palindrome ");
	}

	private static boolean getPalindrome(String s) {
		String p="";
		for(int i=s.length()-1; i>=0;i--) {
			p=p+s.charAt(i);

		}
		System.out.println(p);
		if(p.equals(s))
			return true;
		else
			return false;
	}
}
