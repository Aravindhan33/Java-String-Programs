package com;

public class ReplaceCharacterWithItsoccurence {

	public static void main(String[] args) {

		String s= "sasuke";
		char ch ='s';
		char[] c = s.toCharArray();
		int cnt =1;
		for(int i =0; i<c.length ; i++) {
			if (c[i]==ch) {
				c[i]=(char)(cnt+48);
				cnt++;


			}

		}
		System.out.println(new String(c));

	}
}