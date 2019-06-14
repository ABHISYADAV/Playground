import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        for(int index = 0; index < arr_size; index++)
        {
            arr[index] = sc.nextInt();
        }
        boolean flag=false;
        int x=0;
        int y=arr.length-1;
        while(x!=y && x<y)
        {
        	if(arr[x]==arr[y])
        	{
        		flag=false;
        		x++;
        		y--;
        	}
        	else
        	{
        		flag=true;
        		break;
        	}
        	
        }
        
        if(flag==true)
        {
        	System.out.println("No");
        }
        else
        {
        	System.out.println("Yes");
        }
    }
}