
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		Scanner sc = new Scanner(System.in);
	    String str1 = sc.nextLine(); 	
	    StringBuilder sb1 = new StringBuilder(str1);
		String str2 = sc.nextLine();
		char ch[] = new char[str1.length()];
		int count=0;
		for( int index =0 ; index < str2.length() ; index++)
		{
			for( int str1index =0 ; str1index < str1.length() ; str1index++)
			{
				if(str2.charAt(index) == str1.charAt(str1index))
				{
					sb1.setCharAt(str1index,'$');
				}			
			}
		}
		for( int index =0 ; index < str1.length() ; index++)
		{
			if(sb1.charAt(index) != '$')
			{
				System.out.print(sb1.charAt(index));
			}
		}
	
	}
}