package Java_Package;

public class TransposeArray {

	public static void main(String[] args) {
		String n  = "preeti";
		char s1= 'p';
		char s2 = 'r';
		char s3 = 'e';
		char s4 = 't';
		char s5 = 'i';
		int j=0;
		int m=0;
		int t=0;
		int g = 0;
		int d= 0;
		for (int i= 0; i< n.length(); i++)
			
			if (n.charAt(i)== s1) {
				j= j+1;
		
			}
			System.out.println("p =" + j);
		
    for (int k= 0; k< n.length(); k++)
			
			if (n.charAt(k)== s2) {
				m=m+1;
			}
			System.out.println("r =" + m);
		
		
      for (int r= 0; r< n.length(); r++)
			
			if (n.charAt(r)== s3) {
				t=t+1;
			}
      System.out.println("e = " +t);
	
      for (int f= 0; f< n.length(); f++)
			
			if (n.charAt(f)== s4) {
				g=g+1;
			}
    System.out.println("t = " +g);
      
    for (int z= 0; z< n.length(); z++)
		
		if (n.charAt(z)== s4) {
			d=d+1;
		}
System.out.println("i = " +d);
				
	}
}




	


