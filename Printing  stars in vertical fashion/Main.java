import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
    int num1= in.nextInt();
    for(int i = 1 ;i <= num1; i++)
    {
    System.out.print("*");
      System.out.println();
    }
  }
}