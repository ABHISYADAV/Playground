import java.util.*;
class Main
{
public static void main(String args[]) 
  {  
   Scanner in= new Scanner(System.in);
   int base=in.nextInt();
   int exponent=in.nextInt();
  System.out.println(power(base,exponent));
}
public static int power(int base,int exponent)
{
  int power=1;
  for(int i=1;i<=exponent;i++)
  {
    power=power*base;
  }
  return power;
}
}