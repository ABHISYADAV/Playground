import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in  = new Scanner(System.in);
      int num1= in.nextInt();
      int sum = 0, temp, rem,fact =1;
      temp = num1;
      while(num1 > 0)
      {
        rem = num1 % 10;
        for(int i=1;i<=rem;i++)
          fact=fact*i;
        sum = sum + fact;
        fact = 1;
        num1 = num1 / 10;
      }
 //      System.out.println(sum);
      if( sum == temp)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}