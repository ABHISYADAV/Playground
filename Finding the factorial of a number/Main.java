import java.util.Scanner;

class Main
{
  public static void main(String args[]) 
  {
	  Scanner in = new Scanner(System.in);
	    int num = in.nextInt();
	    System.out.println(factorial(num));
  }

private static int factorial(int num) {
	if(num==1)
	return 1;
	else
	return num*factorial(num-1);
			
	
} 
}