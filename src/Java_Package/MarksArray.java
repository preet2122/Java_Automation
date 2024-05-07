package Java_Package;

import java.util.Scanner;

public class MarksArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] input = new int [3];
		System.out.println ("Enter input1");
		input[0]= sc.nextInt();
		System.out.println ("Enter input2");
        input[1]= sc.nextInt();
        System.out.println ("Enter input3");
        input[2]= sc.nextInt();
        
        for (int i=0; i<input.length; i++)
        	System.out.println (input[i]);
	}

}
