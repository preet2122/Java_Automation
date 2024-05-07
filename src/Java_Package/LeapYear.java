package Java_Package;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int number =  sc.nextInt();
		if (number%4 ==0) {
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		}

	}

