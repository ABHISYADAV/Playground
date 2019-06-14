import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int r1 = in.nextInt();
		int c1 = in.nextInt();
		int a[][] = new int[r1][c1];
		int b[][] = new int[r1][c1];
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				a[i][j] = in.nextInt();
			}
		}
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				b[i][j] = in.nextInt();
			}
		}
		if (areSame(a, b, r1, c1) == 1)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

	static int areSame(int A[][], int B[][], int r1, int c1) {
		int i, j;
		for (i = 0; i < r1; i++)
			for (j = 0; j < c1; j++)
				if (A[i][j] != B[i][j])
					return 0;
		return 1;
	}
}
