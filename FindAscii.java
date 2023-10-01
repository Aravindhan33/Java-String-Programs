package com;

public class FindAscii {
	public static void main(String[] args) {
		char c = 'z';
		if(c>=(char)65&&c<=(char)90 || c>=(char)97&&c<=(char)122 ) 
		{
			if(c=='a' || c=='A' ||c=='e' || c=='E' ||c=='i' || c=='I'|| c=='o' || c=='O' ||c=='u' || c=='U')
				System.out.println("it is vowels");
			else
				System.out.println("it is a consonant");
		}
         if(c>=(char)(48) && c<=(char)(58))
			System.out.println("it is a digit");
		if(c>=(char)(32)&&c<=(char)(47) || c>=(char)(58)&&c<=(char)(64) || c>=(char)(91)&&c<=(char)(96) || c>=(char)(123)&&c<=(char)(126))
			System.out.println("it is A special charachter");
}

}
