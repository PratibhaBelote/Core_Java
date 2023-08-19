import java.util.Scanner;
public class sal{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic salary");
		int basicSalary= sc.nextInt();
		
		if(basicSalary<=10000)
		{
			double hra=basicSalary*0.2;
			double da=basicSalary*0.8;
			double grossSalary=hra+da+basicSalary;
			System.out.println("grossSalary : "+grossSalary);
		}
		else if(basicSalary<=20000)
		{
			double hra=basicSalary*0.25;
			double da=basicSalary*0.9;
			double grossSalary=hra+da+basicSalary;
			System.out.println("grossSalary : "+grossSalary);
		}
		else
		{
			double hra=basicSalary*0.3;
			double da=basicSalary*0.95;
			double grossSalary=hra+da+basicSalary;
			System.out.println("grossSalary : "+grossSalary);
		}
	}
}