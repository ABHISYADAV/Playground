import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int length = str1.length();
		int count =  (length/2);
		for(int row=1; row < length+1 ; row++)
		{
			for (int rowspace = row; rowspace < length; rowspace++) 
			{
		      System.out.print(" ");		
			}
			
			for(int rowp = 0 ; rowp < row ; rowp++)
			{
				count =  (length/2);
				for(int rowprint = 0; rowprint < row ; rowprint++)
				{
		//			System.out.print(count);
					System.out.print(str1.charAt(count));
					if(count<length-1)
					count++;
					else if(count == length-1)
					{
						count=0;
					}
				}
				break;
			}
			System.out.println();
		}

	}
}