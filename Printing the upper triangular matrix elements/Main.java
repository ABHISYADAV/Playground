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

		for (int x = 0; x < r1; x++) {
			if (x == 0) {
				for (int i = 0; i < r1; i++) {
					for (int j = 0; j < c1; j++) {
						if (i == j)
							System.out.print(a[i][j] + " ");
					}
					// System.out.println();
				}
			}
			else
			{
				for (int i = 0; i < r1; i++) {
					for (int j = 0; j < c1; j++) {
						if (i+x == j)
							System.out.print(a[i][j] + " ");
					}
					// System.out.println();
				}
				
			}
		}
	}
}
