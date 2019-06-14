import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
		Scanner in  =  new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int gcd1=find_gcd(num1,num2);
		
		System.out.println(find_gcd(gcd1,num3));
		
		
	}

	private static int find_gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if (b == 0)
			return a;
		else
			return find_gcd(b, a % b);
		
	}
}