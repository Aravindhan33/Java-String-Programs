package com;

public class ReverseSentence {

	public static void main(String[] args) {
		String s ="hello world";
		String s1 ="";
		char [] c = s.toCharArray();
		for(int i=c.length-1;i>=0; i--) {
			int l=i;
			while(i>0 && c[i]!=' ') {
				i--;
			}
			int f=i+1;
			while(l>=f) {
				s1 = s1+c[l];
				f++;
			}
			if(i>0)
				s1=s1+c[i];
		}
		System.out.println(s1);
	}

}
