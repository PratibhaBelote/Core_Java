package p1;
public class calculate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a 1st number");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int n=sc.nextInt();
		
		System.out.println("Enter\n1-add\n2-sub\n3-mult\n4-div");
		int choice=sc.nextInt();
		
		if(choice==1)
			System.out.println("add is "+(a+b));
		else if(choice==2)
			System.out.println("sub is "+(a-b));
		else if(choice==3)
			System.out.println("mult is "+(a*b));
		else if(choice==4)
			System.out.println("div is "+(a/b));
		else
			System.out.println("Envalid input");
	}
}
