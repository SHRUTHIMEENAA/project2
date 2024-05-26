package zoho;
import java.util.*;
public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int flag=0;
		String s=sc.next();
		int n=s.length();
		for(int i=0;i<n/2;i++) {
			for(int j=n;j>n/2;j--) {
				if(s.charAt(i)==s.charAt(j)) {
					flag=1;
					
				}
			}
		}
		if(flag==1) {
			System.out.print("p");
		}
		else {
			System.out.print("not p");
		}
	}

}
