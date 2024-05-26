package zoho;

import java.util.Scanner;


public class anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int dp[]=new int[26];
		for(int i=0;i<s1.length();i++)
		{
			int n=(int)s1.charAt(i)-97;
					dp[n]++;
		}
		for(int i=0;i<s2.length();i++)
		{
			int n=(int)s2.charAt(i)-97;
					dp[n]--;
		}
		for(int i=0;i<26;i++)
		{
			if(dp[i]!=0)
			{
				System.out.print("Not a anagram");
				return;
			}
		}
		System.out.print("Anagram");
		
	}

}


