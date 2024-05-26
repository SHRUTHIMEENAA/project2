package zoho;
import java.util.Arrays;
import java.util.Scanner;

public class sortcolors {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int nums[]=new int[n];
		for(int i=0;i<n;i++)
		{
			nums[i]=sc.nextInt();
		}
		int arr[]=new int[n];
		Arrays.fill(arr,1);
		int f=0,l=n-1;
		for(int i=0;i<n;i++)
		{
			if(nums[i]==0)
				arr[f++]=0;
			else if(nums[i]==2)
				arr[l--]=2;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}

}
//0 means red,1 means white,2 means blue,here same colors are adjacent
//another array is used to fill the array with 1 and then for loop os started 
//where if its 0 then arr[0] is becomes 0 and similarly from ast n-1 becomes
//2
