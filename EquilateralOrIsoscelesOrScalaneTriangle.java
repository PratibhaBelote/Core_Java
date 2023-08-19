
package p1;
public class trangle {
	public static void main(String[] args)
	{
		int a=5;
		int b=4;
		int c=3;
		if(a==b && b==c && c==a)
		{
			System.out.println("Equilateral trangle");
		}
		else if(a==b || b==c || c==a)
		{
			System.out.println("Isosceles trangle");
		}
		else
		{
			System.out.println("Scalane trangle");
		}
	}
}