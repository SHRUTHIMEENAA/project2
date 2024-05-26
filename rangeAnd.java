package zoho;

import java.util.Scanner;

public class rangeAnd {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int ri=sc.nextInt();
		int le=sc.nextInt();
		int count=0;
		while(le!=ri)
		{
			le=le>>1;
			ri=ri>>1;
			count++;
		}
		System.out.print(le<<count);
	}
}

//to get the range value that is for example 10 and 15 range 
//the output becomes on the basis of 10&11&12&13&14&15
//the answer of this was 8
//logic is that find the first and second number binary digit
//then right shift both until it gets the same value sid eby sid ecount the number of times your are right shift both the numbers
//at last take anyone and find the left shift it was thw answer


