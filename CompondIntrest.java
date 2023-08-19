import java.util.Scanner;
public class ci {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter p");
		int p=sc.nextInt();
		System.out.println("Enter r");
		double r=sc.nextDouble();
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter t");
		int t=sc.nextInt();
		double a=1+(r/n);
		int b=n*t;
		double ci= p * Math.pow(a,b);
		System.out.println(ci);
	}
}
