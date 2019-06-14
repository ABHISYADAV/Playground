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
	int count = 1, tempCount;
	  int popular = arr[0];
	  int temp = 0;
	  for (int i = 0; i < (arr.length - 1); i++)
	  {
	    temp = arr[i];
	    tempCount = 0;
	    for (int j = 1; j < arr.length; j++)
	    {
	      if (temp == arr[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;
	    }
	  }
	  return popular;
}
}