import java.util.Scanner;
public class year {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int years=num/365;
		System.out.println("years:"+years);
		int rem=num%365;
		int month=rem/30;
		System.out.println("months:"+month);
		int rem2=rem%30;
		int weeks=rem2/7;
		System.out.println("weeks:"+weeks);
		int day=rem2%7;
		System.out.println("days:"+day);
		
		
	}
}