import java.util.Scanner;
public class area {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the side");
		int s=sc.nextInt();
		int area=s*s;
		System.out.println("area is:"+area);
	}
}