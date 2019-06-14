import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int first=n1/100;
    int second=(n1/10)%10;
    int third=n1%10;
    int revnum=third*100+second*10+first;
    System.out.println(revnum);
  }
}