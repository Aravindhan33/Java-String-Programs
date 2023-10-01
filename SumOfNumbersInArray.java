package com;

public class SumOfNumbersInArray {

	public static void main(String[] args) {
		String s = "naruto12uzum3aki34";

		int sum =0; String s1="";
		for(int i =0;i<s.length();i++) {
			char c = s.charAt(i);
			//char[] c = s.toCharArray();
			while(c>='0'&&c<='9') {
				sum=sum+c-48;
			}
		}
		System.out.println(sum);
		
	}
	

}

