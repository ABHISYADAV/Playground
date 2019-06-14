import java.util.Scanner;
class Main {
	public static void main(String args[]) {
		// Type your code here
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		boolean flag = false;
		str = str.toLowerCase();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			flag = false;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ch) {
					flag = true;
					break;
				}
			}
			if (false == flag) {
				System.out.print(ch+" ");
				
			}
		}

	}
}