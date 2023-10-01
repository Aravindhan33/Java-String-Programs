package com;

import java.util.Scanner;

public class PangramWithOutMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String ");
		String s = sc.nextLine();
		int n=0;
		if(s.length()<26)
			System.out.println("Not panagram");
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
				n=1;

		}
		if(n==0)
			System.out.println("it is pangram ");
		else 
			System.out.println("not a panagram");

	}
}