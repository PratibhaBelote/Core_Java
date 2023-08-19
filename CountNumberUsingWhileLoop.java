package p1;
public class count_number{
	public static void main(String[] args){
		int num=2568963;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
}