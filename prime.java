package zoho;
import java.util.*;
public class prime {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int c=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			System.out.print("Prime");
		}
		else {
			System.out.print(" not Prime");
		}
	}

}
