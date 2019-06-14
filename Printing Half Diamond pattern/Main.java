import java.util.Scanner;
class Main {
	public static void main (String[] args){
	  Scanner in = new Scanner(System.in);
      int num=in.nextInt();
      int count=0;
      for(int rownum=1;rownum<=num;++rownum)
      {
      count=1;
      for(int space=1;space<=(num-rownum);++space)
      {
      System.out.print(" ");
      }
      count=rownum*2-1;
      for(int colnum=1;colnum<=count;colnum++)
      {        
      System.out.print("*");
      }
      System.out.println("");
      }
	}
}