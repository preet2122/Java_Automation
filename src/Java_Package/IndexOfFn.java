package Java_Package;

import java.util.Scanner;

public class IndexOfFn {
	public static void main(String[] args){
		    {
//		   String name = "Sargun is a good girl";
//		  System.out.println(name.indexOf('z'));
//		   String name2 = "girl";
//		   System.out.println(name.indexOf(name2)); // 
		    	Scanner sc = new Scanner(System.in);
				System.out.println("Enter the char");
				char c = sc.next().charAt(0);
		    	String vowel = "aeiouAEIOU";
		    	
            for (int i=0; i<vowel.length(); i++) {
            	c = vowel.charAt(i);
            	System.out.println(vowel.indexOf(c));
//            	if (vowel.indexOf(c)>= 0)
//            	{
//                	System.out.println( "Vowel");	
//                	}
//                	else
//                	{
//                		System.out.println("Consonant");
//                	}
//            }
               
		   
		    }
	}
	}
}


