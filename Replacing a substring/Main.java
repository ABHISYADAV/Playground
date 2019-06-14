import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner scan = new Scanner(System.in);
      String instr = scan.nextLine();
      String str_repl=scan.nextLine();
      String str_incl=scan.nextLine();
      System.out.println(instr.replace(str_repl, str_incl));
    }
}