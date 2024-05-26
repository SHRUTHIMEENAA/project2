package zoho;

import java.util.Scanner;

public class stringExpansion {
	static public void main(String[] args) {
		String str;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		char ch=str.charAt(0);  //a
		for(int i=1;i<str.length();i++) { //a23b5n4
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				sum=sum*10+(int)str.charAt(i)-48;
			}else {
				for(int j=0;j<sum;j++){
					System.out.print(ch);
				}
				sum=0;
				ch=str.charAt(i);
			}
		}
		for(int j=0;j<sum;j++){
			System.out.print(ch);
		}
	}
}
