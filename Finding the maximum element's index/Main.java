import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int num2[] = new int[size];
		int index=0,greater=0;
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}
		for(int j=0;j<size;j++)
		{
			
			if(num2[j]>greater)
			{
				index=j;
				greater=num2[j];
			}
		}
		System.out.println(index);
	}
}