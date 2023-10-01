package com;

public class FirstLetterCap {

	public static void main(String[] args) {
		
		String s = "naruto is seventh hokage";
		
		char[] c = s.toCharArray();
		
		for(int i =0; i<c.length ; i++) {
			if( i==0 && c[i]!=' ' || c[i]!=' '&& c[i-1]==' ' ) {
				if(c[i]>='a'&& c[i]<='z')
					c[i]= (char)(c[i]-32);
			}
			else if(c[i]>='A'&&c[i]<='Z')
				c[i]= (char)(c[i]+32);
				
				
		}
		 s = new String(c);
		 System.out.println(s);

	}

}
