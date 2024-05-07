package Java_Package;

import java.util.Scanner;

public class Palindrome_NoF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next().toString();
		String rev = "";
		for (int i=str.length()-1; i>=0; i--) 
		{	
			 rev = rev+ str.charAt(i);
		}
			if (str.equals(rev))
			{	
				System.out.println("string is palindrome");
			}
			
			else {
				System.out.println("string is not palindrome");
			}
		}
		
			
	}
	


