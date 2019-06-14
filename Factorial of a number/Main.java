import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in  = new Scanner(System.in);
      int num1= in.nextInt();
      int fact=1;
      for(int i=1;i<=num1;i++)
      {
      fact=fact*i;
      }
      System.out.println(fact);
	}
}