
import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    String str2="";
    int str1_len = str1.length();
    int cnt=0;
    for(int i=str1_len-1;i>=0;i--)
    {
    	str2=str2+str1.charAt(i);
    }
    
    if(str1.equals(str2))
    	System.out.println("Yes");
    else
    	System.out.println("No");
  } 
}