package p1;
public class harshad{
	public static void main(String[] args){
		int num=171;
		int original=num;
		int sum=0;
		{
			while(num>0)
			{
				int digit=num%10;
				sum=sum+digit;
				num=num/10;
			}
			if(original%sum==0)
				System.out.println("Harshad number");
			else
				System.out.println("not a harshad number");
		}
	}
}
				
				