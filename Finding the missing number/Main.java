import java.util.Scanner;

class Main{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	int arr_size = sc.nextInt();
        int arr[] = new int[arr_size];
        int arr2[]=new int[arr_size];
        for(int index = 0; index < arr_size; index++)
        {
            arr[index] = sc.nextInt();
        }
        for(int i=1;i<=arr_size;i++)
        {
        	for(int j=0;j<arr_size;j++)
        	{
        		if(i==arr[j])
        		{
        			arr2[i-1]=1;
        			break;
        		}
        		else
        		{
        			arr2[i-1]=0;
        		}
        		
        	}
        	
        }
        
        for(int x=0;x<arr_size;x++)
        {
        	if(arr2[x]==0)
        	{
        		System.out.println(x+1);
        		break;
        	}
        }
    }
}