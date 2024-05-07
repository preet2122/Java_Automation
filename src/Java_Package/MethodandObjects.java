package Java_Package;

public class MethodandObjects {
	
	public int multi (int a, int b)
	{
	int c = a*b;
	return c;
	}
public static void main(String[] args) {
	int x = 340;
	int y = 550;
	int z;
	MethodandObjects ob2=new MethodandObjects();
	z = ob2.multi(x, y);
	System.out.println("print:  "+z);
		}

}
