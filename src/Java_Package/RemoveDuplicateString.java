package Java_Package;

import java.util.Scanner;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next().toString();
		
		for (int i=0; i<= str.length()-1; i++) {
			int count = 0;
			for (int j=0; j<= str.length()-1; j++) {
				if (str.charAt(i)== str.charAt(j)){
					count = count+1;
				}
			}
			System.out.println( str.charAt(i)+  " total count is -> "   + count);	
			
				
			}
		}
  
	}


