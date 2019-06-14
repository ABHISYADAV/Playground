import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int num2[] = new int[size];
		int greater=0;
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}

	    
	    for(int i=1;i<size;i++)
	    {
	    	if(num2[i]>=greater)
	    		greater=num2[i];
	    	
	    }
	    System.out.println(greater);
	}
}