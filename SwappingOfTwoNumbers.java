import java.util.Scanner;
public class swap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println("After swapping:"+a);
		System.out.println(b);
	}
}
