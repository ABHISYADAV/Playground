import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int list[] = new int[n];
		int list2[] = new int[n];
		for (int index = 0; index < n; index++) {
			list[index] = sc.nextInt();
			list2[index] = list[index];
		}
		printOrder(list, n, list);
		for (int j = n/2; j < n ; j++)
			System.out.print(list2[j] + " ");

	}

	static void printOrder(int[] arr, int n, int[] arr2) {
		int list3[] = new int[n/2];
		

		for (int i = 0; i < n / 2; i++)
			list3[i]=arr[i];
		Arrays.sort(list3);
		for (int i = 0; i < n / 2; i++)
			System.out.print(list3[i] + " ");
	
	}

}
