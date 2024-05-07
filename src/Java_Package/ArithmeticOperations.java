package Java_Package;

import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number1");
		int number1 =  sc.nextInt();
		System.out.println("Enter Number2");
		int number2 =  sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the char");
		char c = sc1.next().charAt(0);
		
		switch(c)
		{
		case '+': 
			System.out.println (number1+number2);
			break;
			
		case '-':
			System.out.println (number1-number2);
			break;
			
		case '*':
			System.out.println (number1*number2);
			break;
		case '/':
			System.out.println (number1/number2);
			break;
		case '%':
			System.out.println (number1%number2);
			break;
			
		}
		
		
	}

}



