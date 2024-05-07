package Java_Package;

import java.util.Scanner;

public class ElementExists_Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element");
		int el =  sc.nextInt();
		int[] arr = {1,4,8};
		int [] arr1 = {2,5,0};
		int [] arr2 = {3,6,8};	
		
		for (int i=0; i < arr.length; i++) {
			if(arr[i]==el) {
				System.out.println ("element exists in 1st erray");
			}
		}
		for (int j=0; j < arr1.length; j++) {
				if(arr1[j]==el) {
				System.out.println ("element exists in 2nd erray");
			} 
		}
			for (int k=0; k< arr2.length; k++) {
					if(arr2[k]==el) {
					System.out.println ("element exists in 3rd erray");
					}
				}
			System.out.println("element does not exists");
		}
		}
				

	


		

		
	
	


	


