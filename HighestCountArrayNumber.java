package zoho;

import java.util.Scanner;

public class HighestCountArrayNumber {
	static public void main(String[] args) {
		int n,c=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] count=new int[n];
		
		for(int i=0;i<n;i++) {
			if(count[i]!=-1) {
				c=1;
				for(int j=i+1;j<n;j++) {
					if(arr[i]==arr[j]) {
						c++;
						count[j]=-1;
					}
				}
				count[i]=c;
			}
		}
		int N=n;
		while(N>0) {
			for(int i=0;i<n;i++) {
				if(count[i]==N) {
					for(int j=0;j<N;j++) {
						System.out.print(arr[i]+" ");
					}
				}
			}
			N--;
		}
		
		
		
		
	}
}
//
//2  2 3 4  4 1  1  2  3  

//3 -1 2 2 -1 2 -1 -1 -1
//
//2 2 2 3 3 4 4 1 1  




