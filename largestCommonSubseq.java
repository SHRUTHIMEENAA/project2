package zoho;
import java.util.Arrays;
import java.util.Scanner;
public class largestCommonSubseq {
	static public void main(String[] args) {
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		int[][] dp=new int[s1.length()+1][s2.length()+1];
		for(int i=1;i<=s1.length();i++) {
			for(int j=1;j<=s2.length();j++) {
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j]=dp[i-1][j-1]+1;
				}else {
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				System.out.print(dp[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(dp[s1.length()][s2.length()]);

}
}
//abcdef 
//acfegh 
//
//ace   ->  3
