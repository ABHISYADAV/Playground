import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int first=n1/100;
   //   System.out.println(first);
      int third=n1%10;
    //  System.out.println(third);
      int sum=(first+third);
      System.out.println(sum);
	}
}