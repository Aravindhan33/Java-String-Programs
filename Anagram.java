package com;

public class Anagram {

	public static void main(String[] args) {
		String s = "car";
		String s1 = "arc";
		
		boolean rs = isAnagram(s,s1);
		if(rs)
			System.out.println("it is anagram ");
		else
			System.out.println("it is not a anagram ");
	}
	static boolean isAnagram(String s , String s1) {
		int fcount[] = countFrequency(s);
		int scount[] = countFrequency(s1);
		
		for(int i =0;i<26;i++) {
			if(fcount[i]==scount[i])
				return true;
		}
		return false;
		
		
		
		
		
		
	}
	static int[] countFrequency(String s) {
		int[] count = new int[26];
		for(int i =0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i) <='Z')
				count[s.charAt(i)-65]++;
			else if(s.charAt(i)>='a' && s.charAt(i) <='z')
				count[s.charAt(i)-97]++;
				
		}
		return count;
	}
 
}
