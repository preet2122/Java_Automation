package Java_Package;

public class MaxSalary {

	public static void main(String[] args) {
		int [] s = {30,50,60,90,10,100,999};
		int max = 0;
	 for (int i=0; i<s.length; i++) {
		 if (s[i]>max)
		 max = s[i];
	 }
	 
	System.out.println(max);
		
	 }
	}

