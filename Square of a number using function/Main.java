import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	  Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int square=num_square(num);
      System.out.println(square);
	} 
  
    public static int num_square(int i)
    {
    int sq=i*i;
    return sq;
    }
}