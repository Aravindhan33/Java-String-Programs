package com;

public class MergeTwoStrings {

	public static void main(String[] args) {
		 
		String s= "India";
		String s1= "Country";
		
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();
		int in = 2;
		char[] c2 = getMerge(c,c1,in);
		System.out.println(c2);

	}

	 static char[] getMerge(char[] c, char[] c1, int in) {
		char[] c2= new char[c.length+c1.length];
		 in =2;
		for(int i=0;i<c1.length ;i++) {
			c2[in+i+1]=c1[i];
		}
		for(int i = 0;i<c.length;i++){
			if(i<=in)
				c2[i]=c[i];
			else
				c2[c1.length+i]=c[i];
		}
			
				
		
		return c2;
	}

}
