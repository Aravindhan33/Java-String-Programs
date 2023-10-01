package com;

public class VowelsAndConsonants {

	public static void main(String[] args) {

		String s= "@Naruto!Uzumaki";
		int vc=0; int cc=0;
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			if((ch>='A')&& (ch<='Z') || (ch>='a')&& (ch<='z')) {
				if((ch=='A')||( ch=='E') || (ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||( ch=='e') || (ch=='i')||(ch=='o')||(ch=='u'))
						vc++;
			else
					cc++;
			}
		}	
		System.out.println("the vowels count is "+ vc);
		System.out.println("the consonant count is "+ cc);

	}

}
