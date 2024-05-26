package zoho;

import java.util.Scanner;

public class countNums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int c=1;
		for(int i=0;i<s.length();i++)
		{
			if(i+1 < s.length()&& s.charAt(i)==s.charAt(i+1))
			{
				c++;
			}
			else
			{
				System.out.print(c+""+s.charAt(i));
				c=1;
			}
			
		}

	}

}
//11144456
//31341516

