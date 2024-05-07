package Java_Package;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int numb1 =  sc.nextInt();
		int numb2 =  sc.nextInt();
		int numb3 =  sc.nextInt();
		
		if (numb1 > numb2 && numb1 > numb3) {
			System.out.println (numb1);
			
		}
		else if (numb2 > numb1 && numb2> numb3) {
			System.out.println (numb2);
		}
			else {
				System.out.println (numb3);
			}
			
		}
	}


