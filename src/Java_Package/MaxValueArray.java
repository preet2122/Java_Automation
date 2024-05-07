package Java_Package;

public class MaxValueArray {

	public static void main(String[] args) {
	int[] arr = {1,2,3};
	int [] arr1 = {4,5,6};
	int [] arr2 = {7,8,9};	
	int max = 0;
	int max1 = 0;
	int max2 = 0;
	for (int i=0; i<arr.length; i++)
	   if (arr[i]>max)
	{
		max = arr[i]; //3
	}
	//System.out.println(max);
	for (int i=0; i<arr1.length; i++)
		   if (arr1[i]>max1)
		{
			max1 = arr1[i]; //6
		}
	for (int i=0; i<arr2.length; i++)
		   if (arr2[i]>max2)
		   {
			max2 = arr2[i]; //9
		
}
	if (max > max1 && max > max2)
	{
		System.out.println(max);
	}
	else if
	
		(max1> max && max1> max2)
	{
	     System.out.println(max1);
	}
		else
		{
			System.out.println(max2);
	
	}
}
}


