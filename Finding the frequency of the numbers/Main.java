import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int arr[] = new int[n];
    for(int idx = 0; idx <= n - 1; idx++){
      arr[idx] = sc.nextInt();
    }
    
    selection_sort(n, arr,k);
    
  }
  public static void selection_sort(int n, int arr[],int k)
  {
	  int count=0;
	  for(int x=1;x<=k;x++)
	  {
		  for(int y=0;y<arr.length;y++)
		  {
			  if(arr[y]==x)
				  count++;
		  }
		  System.out.println(x+" "+count);
		  count=0;
	  }
  }
}