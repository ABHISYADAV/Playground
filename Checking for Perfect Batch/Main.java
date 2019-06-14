
import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int num2[] = new int[size];
		int bacth_cnt=size/3;
		int sum[]=new int[bacth_cnt];
		int j=0;
		int count=0;
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}
		for(int i=0;i<size;i++)
		{	
			
			
		  sum[j]=sum[j]+num2[i];
			
          if((i+1)%3==0)
			{
				j++;
			}
		}
		
	  for(int i=0;i<bacth_cnt;i++)
	  {
        
		  if(i==0)
		  {
			  
		  }
		  else  if(sum[i-1]==sum[i])
				  count++;
	
		  
	  }
      
	  if(count==(bacth_cnt-1))
		  System.out.println("Perfect Batch");
	  else
		  System.out.println("Not a Perfect Batch");
	}
}