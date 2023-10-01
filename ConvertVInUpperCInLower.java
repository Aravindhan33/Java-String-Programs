package com;

public class ConvertVInUpperCInLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "Aravindhan";

		char[] c = s.toCharArray();

		char[] c2 = getVowelConso(c);
		System.out.println(c2);

	}

	private static char[] getVowelConso(char[] c) {
		for(int i =0;i<c.length ;i++) {
			if(c[i]>='A'&&c[i]<='Z' || c[i]>='a'&&c[i]<='z') {
				if(c[i]=='a'|| c[i]=='e'|| c[i]=='i'|| c[i]=='o'|| c[i]=='u')
				  c[i] = (char)(c[i]-32);
				else if (c[i]>='A'&&c[i]<='Z')
					c[i] = (char)(c[i]+32);


			}
		}
		return c;

	}
}