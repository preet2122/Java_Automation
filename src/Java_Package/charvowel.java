package Java_Package;

import java.util.Scanner;

public class charvowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the char");
		char c = sc.next().charAt(0);
		 if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
         c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
		 {
			 System.out.println ("Vowel");
		 }
			 else
			 {
				 System.out.println ("consonant");	 
			 
			 }
		 
		 }

	}



