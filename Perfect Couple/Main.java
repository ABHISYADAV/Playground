import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      int arr_size, min;
        Scanner Sc = new Scanner(System.in);
        arr_size = Sc.nextInt();
        int arr[] = new int[arr_size];
        
        for (int index = 0; index < arr_size; index++) 
        {
            arr[index] = Sc.nextInt();
        }
        int s_val=Sc.nextInt();
        int temp_sum=0;
        for(int i=0;i<arr_size;i++)
        {
        	for(int j=i+1;j<arr_size;j++)
        	{
        		temp_sum=arr[i]+arr[j];
        		if(temp_sum==s_val)
        		{
        			
        			System.out.print(arr[i]+", "+arr[j]);
        			System.out.println();
        			temp_sum=0;
        		}
        		
        	}
        	
        }
    }
}