package zoho;

import java.util.Scanner;

public class powOfTwo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n&(n-1))==0)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
// to find the power of 2's for example'
//8->2 to the power of 3
//9->not the power of 2



