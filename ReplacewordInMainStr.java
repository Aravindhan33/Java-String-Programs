package com;

public class ReplacewordInMainStr {

	public static void main(String[] args) {
		String s = "Rama is good Boy";
		String s1 = "bad";

		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();

		String rs="";

		for(int i =0;i<c.length;i++) {
			int j =0,k=i;
			while(j<c1.length && k<c.length && c1[j]==c[k]) {
				k++;j++;
			}
			if(j==c1.length && (j==0 || c1[j-1]!=' ')&&( k==c.length|| c[k]==' ')) {
				rs = rs+s1;
			i=k-1;
			}
			else
				rs=rs+c[i];
		}
		System.out.println(rs);
	}

}
