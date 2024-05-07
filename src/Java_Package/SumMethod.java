package Java_Package;

public class SumMethod {
	static int sum (int a,int b)
	{
	int c = a+b;
	return c;
}
	public static void main(String[] args)	
{
	int x = 2;
	int y = 3;
	int z;
	
	z = sum (x,y);
	System.out.println (z);
}
}