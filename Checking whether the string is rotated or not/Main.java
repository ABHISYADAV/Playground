import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner scan = new Scanner(System.in);
      String str1 = scan.nextLine();
      String str2 = scan.nextLine();
      String str="";
      str=str1+str1;
      if(str.contains(str2))
        System.out.println("Yes");
      else
    	  System.out.println("No");
    }
}