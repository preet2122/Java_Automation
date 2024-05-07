package Java_Package;

import java.util.Scanner;

public class ElementExists_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		int el =  sc.nextInt();
		int[] arr = {1,4,8};
		int [] arr1 = {2,5,8};
		int [] arr2 = {3,6,9};	
		
		for (int i=0; i < arr.length; i++) {
			if(arr[i]==el) {
				System.out.println ("element exists in first erray");
			}
			else if (arr1[i]==el) {
				System.out.println ("element exists in 2nd array");
			}
			else if (arr2[i]==el)
				System.out.println ("element exists in third array");
			}
				
		}
		
		
	}


