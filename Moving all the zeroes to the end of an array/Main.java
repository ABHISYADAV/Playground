import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      	Scanner in = new Scanner(System.in);
		int size=in.nextInt();
      int count=0;
		int num2[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}
      
      for (int i = 0; i < size; i++) 
            if (num2[i] != 0) 
                num2[count++] = num2[i];
      while (count < size) 
            num2[count++] = 0; 
      for (int i=0; i<size; i++) 
            System.out.print(num2[i]+" "); 
    }
}