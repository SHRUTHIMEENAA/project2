package zoho;
import java.util.*;
public class versions {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			String[] v1=s1.split("\\.");
			String[] v2=s2.split("\\.");
			int max=(v1.length>v2.length?v1.length:v2.length);
			for(int i=0;i<max;i++)
			{
				int n1=(v1.length<=i)?0:Integer.parseInt(v1[i]);
				int n2=(v2.length<=i)?0:Integer.parseInt(v2[i]);
				if(n1>n2)
				{
					System.out.println("1");
					return;
				}
				else
				{
					System.out.println("-1");
					return;
				}
			}
			System.out.print("0");
		}
		

	}
	//leetcode la compare two versions
	//if the first verison is greater means 1
	//else print -1
	//if it was same than print 0
//1st taking versions as string 
//2nd store them in string array  by spliting them by split(\\.)
//3rd find max in 2 versions string array length
//4th start the loop and traverse till max
//5th condition n1 v1.len and v2.len < i ->0:convert to integer from string array



