package zoho;
import java.util.*;		 
public class bracketsValid {
	static boolean isValid(String str)
	{
			while(true) {
				if(str.contains("()"))
				str=str.replace("()","");
				else if(str.contains("{}"))
				str=str.replace("{}","");
				else if(str.contains("[]"))
				str=str.replace("[]","");
				else 
				return str.isEmpty();
			}
	}
	public static void main(String args[]) {
		
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.print(isValid(str));	
	}
}



	


