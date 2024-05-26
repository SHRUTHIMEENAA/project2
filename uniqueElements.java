package zoho;

import java.util.Scanner;

public class uniqueElements {
	static void unique(int b[],int n)
	{
		int c[]=new int[n];
		int c1=1;
		for(int i=0;i<n;i++)
		{
			c1=1;
			if(c[i]!=-1)
			{
				for(int j=i+1;j<n;j++)
				{
					
				if(b[i]==b[j])
				{
					c1++;
					c[j]=-1;
					
				}
				}
				c[i]=c1;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(c[i]==1)
			{
				System.out.println(b[i]);
			}
		}
	}
			

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		unique(b,n);

	}

}
//this program is to find the unique elements,occurence of two numbers 
//and dupicate elements
//12 12 5 12 696 ->unique elements 5 696
//12 12 55 25 ->twice 12
//12 58 56 96 88->dupicates all would print the values


