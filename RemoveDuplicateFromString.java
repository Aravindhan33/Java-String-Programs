package com;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		String s ="nnaruuuuuto";
		char[] c=s.toCharArray();
		for(int i =0;i<c.length ;i++)
			for(int j =i+1 ;j<c.length;j++) {
			if(c[i]==c[j])
				c[j]=0;
	}
		for(int i = 0; i<c.length ; i++) {
			if(c[i]!=0)
				System.out.print(c[i]);
		}
	}

}
