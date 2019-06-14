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
		printOrder(list, n);

	}

	static void printOrder(int[] arr, int n) {
		int list3[] = new int[n/2];
		int list4[] = new int[n];
		for (int i = 0; i < n / 2; i++)
			list3[i]=arr[i];
		for (int j = n/2; j < n; j++)
			list4[j]=arr[j];
		
		Arrays.sort(list3);
		Arrays.sort(list4);
		for (int i = 0; i < n / 2; i++)
			System.out.print(list3[i] + " ");
		for (int j = n - 1; j >= n / 2; j--)
			System.out.print(list4[j] + " ");

	}

}
