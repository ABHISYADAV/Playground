
import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int num2[] = new int[size];
		int flag1=0,flag2=0;
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}
	    int search1=in.nextInt();
	    int search2=in.nextInt();
	    
	    for(int i=1;i<size;i++)
	    {
	    	
	    	if(num2[i]==search1)
	    	{
	    		flag1=i;
	    	}
	    	else
	    		if(num2[i]==search2)
		    	{
		    		flag2=i;
		    	}
	    			    	
	    }
	    if(flag1>0)
	    {
	    	System.out.println(flag1);
	    }
	    else
	    	System.out.println("-1");
	    if(flag2>0)
	    {
	    	System.out.println(flag2);
	    }
	    else
	    	System.out.println("-1");
	}

}