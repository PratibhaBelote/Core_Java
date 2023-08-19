package p1;
public class profit{
	public static void main(String[] args)
	{
		int pp=600;
		int sp=400;
		int p=sp-pp;
		if(pp<sp)
		{
			System.out.println("profit");
			System.out.println(p);
		}
		else if(pp==sp)
		{
			System.out.println("npnl");
		}
		else
		{
			System.out.println("loss");
			System.out.println(p);
		}
	}
}