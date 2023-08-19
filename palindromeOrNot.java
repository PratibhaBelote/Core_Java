package p1;
public class palindrome{
	public static void main(String[] args){
		int num=123321;
		int original=num;
		int revnum=0;
		while(num>0)
		{
			int digit=num%10;
			revnum=revnum*10+digit;
			num=num/10;
		}
		if(original==revnum)
		System.out.println("Palindrome");
	else
		System.out.println("Not a palindrome");
	}
}