package p1;
public class prime{
	public static void main(String[] args){
		int num=20;
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				System.out.println(num);
				//count++;
				//break;
			}
		}
		//if(count==0)
		//	System.out.println("prime");
		//else
		//	System.out.println("not prime");
	}
}