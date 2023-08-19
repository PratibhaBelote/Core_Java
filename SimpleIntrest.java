import java.util.Scanner;
public class si {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter P");
		int p=sc.nextInt();
		System.out.println("Enter n");
		int n=sc.nextInt();
		System.out.println("Enter r");
		int r=sc.nextInt();
		int si=p*n*r/100;
		System.out.println("Simple interest is : "+si);
	}
}