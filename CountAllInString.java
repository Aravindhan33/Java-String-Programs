package com;

public class CountAllInString {

	public static void main(String[] args) {
		String s= "MinaToNamikaze@123";
		int uc=0,lc=0,dc=0,sc=0;
		for(int i=0;i<s.length();i++) {

			char ch = s.charAt(i);
			if((ch>='A')&& (ch<='Z'))
				uc++;
			else if((ch>='a')&& (ch<='z'))
				lc++;
			else if((ch>='0')&& (ch<='9'))
				dc++;
			else
				sc++;
		}
		System.out.println("the uppercase count is " + uc);
		System.out.println("the lowercase count is " + lc);
		System.out.println("the digit count is " + dc);
		System.out.println("the special charcter count is " + sc);
	}

}
