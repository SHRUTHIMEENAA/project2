package zoho;

import java.util.Scanner;

public class noOfOnesInBinForm {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=0;i<32;i++)
		{
			if((n&1)==1)
			{
				c++;
			}
			n=n>>1;
		}
		System.out.println(c);

	}

}
//40 -> 101000 2 1's are there

