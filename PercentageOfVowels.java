package com;

import java.util.Scanner;

public class PercentageOfVowels {

	public static void main(String[] args) {
		/*Scanner s = new Scanner(System.in);
		System.out.println("Enter the vowels");
		String st = s.nextLine();

		double per = getPercentage(st);

		System.out.println("percentage of vowel is: " + per + "%");

	}

	static double getPercentage(String st) {*/
		// char[] c = st.toCharArray();
		String st = "hello";
		int count = 0,count1=0;
		for (int i = 0; i < st.length(); i++) {
			char c = st.charAt(i);
			if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'I') || (c == 'i')
					|| (c == 'O') || (c == 'o') || (c == 'U') || (c == 'u')) {
				count = count + 1;
			}
			count1++;
		}
		System.out.println(count);
		System.out.println(count1);
		System.out.println(count*100/count1);

	}

}


