package zoho;
import java.util.*;
public class steps {
	static int fib(int n)
	{
		int a = 1, b = 1, c;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
}

//normal steps problem
//example if we take 4 as input it can be splitted as (2,2)(1,1,1,1) (2,1,1)(1,2,1)(1,1,2)
//than the output as 5


