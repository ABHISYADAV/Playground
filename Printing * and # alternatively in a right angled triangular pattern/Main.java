import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
      
      int num1= in.nextInt();
      int count=1;
      for(int i=1;i<=num1;i++)
      {
      for(int j=1;j<=i;j++)
      {
         if(count%2 ==0)
         {
            System.out.print("#");
         }
         else
         {
           System.out.print("*");
         }       
        count++;
      }
        System.out.println();
      }
    }
}