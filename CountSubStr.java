 package com;

public class CountSubStr {

	public static void main(String[] args) {
		 String s = " india isis is is ind";
		 String s2 = "is";
		 
		 char[] c = s.toCharArray();
		 char[] c1 = s2.toCharArray();
		 int count = 0;
		 for(int i =0; i<c.length;i++) {
			 int j=0,k=i;
			 while(k<c.length && j<c1.length && c1[j]==c[k]) {
				 j++;
				 k++;
			 }
			 if(j==c1.length)
				 count++;
			 i=k-1;
			 
		 }
		 System.out.println(count);
		 

	}

}
