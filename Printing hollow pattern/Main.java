import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      for(int rownum=1;rownum<=num;rownum++)
      {
      for(int colnum=1;colnum<=num;colnum++)
      {
        if((rownum==1)||(rownum==num))
         System.out.print("*");
         else
        if((colnum==1)||(colnum==num))
            System.out.print("*");  
        else
          System.out.print(" ");  
      } 
        System.out.println("");
      }
	}
}