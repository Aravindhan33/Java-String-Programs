package com;

public class ReverseWords {          

	public static void main(String[] args) {
		String s ="hello world";
		String s1 ="";
		char [] c = s.toCharArray();
		for(int i=0;i<c.length ; i++) {
			int f=i;
			while(i<c.length && c[i]!=' ') {
				i++;
			}
			int l=i-1;
			while(l>=f) {
				s1 = s1+c[l];
				l--;
			}
			if(i<c.length)
				s1=s1+c[i];
		}
		System.out.println(s1);
		
	}

}
	