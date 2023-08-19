package p1;
import java.util.Scanner;
public class avg{
	public static void main(String[] args)
	{
		int s1,s2,s3,s4,s5,sum,per;
		int totalMaxMarks=500;
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the marks of subject 1:");
		s1=sc.nextInt();
		
		System.out.println("Enter the marks of subject 2:");
		s2=sc.nextInt();
		
		System.out.println("Enter the marks of subject 3:");
		s3=sc.nextInt();
		
		System.out.println("Enter the marks of subject 4:");
		s4=sc.nextInt();
		
		System.out.println("Enter the marks of subject 5:");
		s5=sc.nextInt();
		
		sum=s1+s2+s3+s4+s5;
		
		per=(sum*100)/totalMaxMarks;
		
		System.out.println(sum+" "+per);
		
		if(per>=90)
		{
			System.out.println("Grade A");
		}
		else if(per>=80)
		{
			System.out.println("Grade B");
		}
		else if(per>=70)
		{
			System.out.println("Grade C");
		}
		else if(per>=60)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}

		