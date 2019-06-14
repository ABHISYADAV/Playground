import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
		Scanner in  =  new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int great1=find_greater(num1,num2);
		System.out.println(find_greater(great1,num3));
		
		
	}

	private static int find_greater(int num1, int num2) {
		// TODO Auto-generated method stub
		int greater;
		if(num1>num2)
		{
			greater = num1;
		}
		else
			greater =  num2;
		return greater;
	}
}