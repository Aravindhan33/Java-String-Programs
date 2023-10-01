package com;

import java.util.Scanner;

public class CountCharctersInString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the String ");
		String st = s.nextLine();
		int count=0;
		for(int i =0 ; i<st.length();i++) {
			if(st.charAt(i)!=' ')
				count++;
		}
		System.out.println("the number of Characters in String are "+ count);

	}

}
