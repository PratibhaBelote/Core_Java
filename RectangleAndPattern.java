import java.util.Scanner;
public class peri {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length");
		int l=sc.nextInt();
		System.out.println("Enter the bredth");
		int b=sc.nextInt();
		int c=l*b;
		System.out.println("Area of rectangle is:"+c);
		int d=2*(l+b);
		System.out.println("perimeter of rectangleis:"+d);
	}
}