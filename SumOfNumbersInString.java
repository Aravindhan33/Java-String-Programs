package com;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String s="23hello39gy10";
		
		int sum=0;
		char[] c = s.toCharArray();
		
		for(int i =0;i<c.length;i++) {
			int n=0;
			while(i<c.length&&c[i]>='0'&&c[i]<='9') {
				n=n*10+(c[i]-48);
				i++;
			}
			if(n!=0) {
				sum=sum+n;
			}
		}

		System.out.println(sum);
	}

}
