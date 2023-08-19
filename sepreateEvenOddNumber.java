package p1;
public class odd_even_loop{
	public static void main(String[] args){
		int start=20;
		int end=30;
		System.out.println("Even number :");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("Odd number :");
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
	}
}