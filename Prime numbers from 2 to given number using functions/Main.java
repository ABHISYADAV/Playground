import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in= new Scanner(System.in);
     int num1=in.nextInt();
     printPrime(num1);
	}
  public static void printPrime(int num)
  {
      int flag=0;
      for(int i=2;i<=num;i++)
      {
         for(int j=2;j<=num/2;j++)
         {
          if (i%j==0 && i!=j)
          {
           flag=1; 
           break;
          }                    
         }
        if(flag==1)
        {
          flag=0;
        }
        else
          System.out.println(i);
      }
  }  
}