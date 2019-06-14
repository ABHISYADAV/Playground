import java.util.Scanner;
import java.util.InputMismatchException;
public class Main 
{
    public static void main(String a[])
    {
    	Scanner s = new Scanner(System.in);
		int i;
		try {
			i = s.nextInt();
			System.out.println(i);
		} catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception occurred");
		
		} 
        
        
       
    }
}