package p1;
public class kaprekar{
	 static public void main(String[] args){
		int num=45;
		int sq=num*num;   //sqaure
		int sqd=sq;         //duplicate square
		int noofdigit=0;  //number of digit...
		while(sqd>0)
		{
			sqd=sqd/10;
			noofdigit++; //total no. kiti aahet sq madhe te kalnar.....
		}
		if(noofdigit%2!=0) //jr noofdigit odd asel tr no. even karil.....
			noofdigit++;
		
		noofdigit=noofdigit/2; //sqaure la 2 part madhe divide krto...
		int denomilater=(int)Math.pow(10,noofdigit);
		int left=sq/denomilater;
		int right=sq%denomilater;
		if(left+right==num)
			System.out.println("kaprekar number");
		else
			System.out.println("not a kaprekar number");
	}
}

