import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int list[] = new int[n];
		for (int index = 0; index < n; index++) {
			list[index] = sc.nextInt();
			
		}
		smallest_sub(list, n);

	}

	static void smallest_sub(int[] arr, int n) {
		for(int i=0;i < n ; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[j] > arr[i])
				System.out.println(arr[i]+"," + arr[j]);
			}
		}
	}

}
