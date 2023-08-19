import java.util.Scanner;
public class bill{
	public static void main(String[] args)
	{
		int units;
		float bill,finalBill;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of units");
		units=sc.nextInt();
		
		if(units<=50)
		{
			bill=(float) (units * 0.50);
		}
		else if(units < 150)
		{
			bill=(float) ((50 * 0.50) + (units - 50) *0.75);
		}
		else if(units < 250)
		{
			bill=(float) ((50 * 0.50) + (150 * 0.75) + (units - 150) * 1.20);
		}
		else 
		{
			bill=(float) ((50 * 0.50) + (150 * 0.75) + (100 * 1.20) +(units - 250) * 1.50);
		}
		System.out.println("Bill : "+bill);
		
		float res = (float) (bill * 0.20);
		
		System.out.println("surcharge : "+res);
		finalBill=res+bill;
		System.out.println("finalBill : "+finalBill);
	}
}