import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      for(int row=1;row<=n;row++)
      {
      for(int space=1;space<=n-row;space++)
      {
      System.out.print(" ");
      }
      for(int colnum = 1; colnum <= row; ++ colnum)
      {
    		 System.out.print(count+" ");
             count++;
       } 
        System.out.println("");
      }
    }    
}