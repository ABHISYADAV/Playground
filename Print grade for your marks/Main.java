import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      if(num>=85)
        System.out.println("A");
      else if(num>=75)
        System.out.println("B");
      else if(num>=65)
        System.out.println("C");
      else if(num>=55)
        System.out.println("D");
      else if(num>=45)
        System.out.println("E");
      else if(num<45)
        System.out.println("Fail");
    }
}