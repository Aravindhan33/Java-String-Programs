package com;

public class SubStringPresentOrNot {

	public static void main(String[] args) {
		String s ="india is my country";
		String s1 = "is";
		boolean rs = isSubString(s,s1);
		if(rs)
			System.out.println("present");
		else
			System.out.println("not present ");

	}

	 static boolean isSubString(String s, String s1) {
		 
		 char[] c = s.toCharArray();
		 char[] c1 =s1.toCharArray();
		 
		 for(int i =0 ; i<c.length;i++) {
			 int j=0,k=i;
			 while(j<c1.length && k<c.length && c1[j]==c[k]) {
				 j++;
				 k++;
				 
			 }
			   if(j==c1.length)
				 return true;
			 
		 }
		 return false;
		
	}

}
