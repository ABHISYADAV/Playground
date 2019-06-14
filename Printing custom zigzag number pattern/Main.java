import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int rownum=1;rownum<=num;rownum++)
      {
        for(int column=1;column<=num;column++)
        {
          if (rownum%2==1)
          {
             if(column<num)
              System.out.print(rownum);
            if(column==num)
             {
              System.out.print(rownum+1);
             }
          }
          
          if (rownum%2==0)
          {
             if(column>1)
              System.out.print(rownum);
            if(column==1)
             {
              System.out.print(rownum+1);
             }
          }
        }
        System.out.println("");
      }
	}
}