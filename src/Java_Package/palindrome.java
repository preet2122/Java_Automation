package Java_Package;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String str = sc.next().toString();
        
   StringBuffer sbr = new StringBuffer(str);
   StringBuffer result = sbr.reverse();
   String new_result = result.toString();
     if (str.equals(new_result)) {
       	System.out.println ("This word is palindrome");
       }
       else {
       	System.out.println ("This word is not palindrome");
       }
	}

}
