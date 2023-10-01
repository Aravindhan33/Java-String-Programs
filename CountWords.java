package com;

public class CountWords {

	public static void main(String[] args) {
		String s= "   Naruto is    the Seventh hokage   ";
		int count =0;
		char[] c = s.toCharArray();
		
		for(int i =0 ; i<c.length ; i++) {
			if(c[i]!=' '&& c[i-1]==' ' )
				count++;
				
		}
		System.out.println("the number of words Present in the sentence is " + count);
	}

}
