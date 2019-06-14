import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int n1 = num % 10;
      int sum=0;
      while(num > 10)
      {
        num = num/10;
      }
      sum = num + n1;
      System.out.println(sum);
	}
}