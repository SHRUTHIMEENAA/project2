package zoho;

import java.util.Scanner;

public class OneUnique {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	int s=0;
	for(int i=0;i<a.length;i++)
	{
		s=s^a[i];
	}
	System.out.println(s);
	}
}

//10 20 30 20 10
//30 ans


