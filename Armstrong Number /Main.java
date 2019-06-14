import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in  = new Scanner(System.in);
      int num1= in.nextInt();
      int c=0,a;
      int temp = num1;
      while ( num1 > 0)
      {
       a=num1%10;  
       num1=num1/10;  
       c=c+(a*a*a);  
      }
     if(temp==c)  
    System.out.println("Armstrong Number");   
    else  
        System.out.println("Not a Armstrong Number");   
	}
}