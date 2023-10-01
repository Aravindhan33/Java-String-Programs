package com;

import java.util.Scanner;

public class Pangram {

	static boolean isPangram(String s) {
		if(s.length()<26)
			return false;
		int[] a = new int[26];
		for(int i=0 ; i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z')
				a[c-65]++;
			else if (c>='a'&& c<='z')
				a[c-97]++;


		}
		for(int i =0;i<26;i++) {
			if(a[i]==0)
				return false;


		}
		return true;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String ");
		String s = sc.nextLine();
		boolean rs= isPangram(s);
		if(rs)
			System.out.println("it is a pangram ");
		else 
			System.out.println("it is not a pangram ");


	}

}
