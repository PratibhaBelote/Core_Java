import java.util.Scanner;
public class char1{
	public static void main(String[] args)
	{
		char ch='1';
		if(ch>='a' && ch<='z')
			System.out.println("lowercase");
		else if(ch>='A' && ch<='Z')
			System.out.println("uppercase");
		else if(ch>='0' && ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Special char");
    }
}
