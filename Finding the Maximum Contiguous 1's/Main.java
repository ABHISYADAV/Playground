import java.util.Scanner;

class Main
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       
int arr_size = sc.nextInt();
       int arr[] = new int[arr_size];
       int sum=0;int max=0;
       for(int index = 0; index < arr_size; index++)
       {
           arr[index] = sc.nextInt();
       }
       System.out.println(max_length(arr,arr_size));
   }

private static int max_length(int[] arr, int arr_size) {

	int count = 0;  
    int result = 0; 
  
    for (int i = 0; i < arr_size; i++) 
    { 
    	if (arr[i] == 0) 
            count = 0; 
  
         else
        { 
            count++;//increase count 
            result = Math.max(result, count); 
        } 
    } 
  
    return result; 
}
}