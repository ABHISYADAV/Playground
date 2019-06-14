import java.util.Scanner;

class Main {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int size=in.nextInt();
		int num2[] = new int[size];
		int oddpos[]=new int[size];
		int evenpos[]=new int[size];
		int j=0,k=0;
		int temp;
		for(int i=0;i<size;i++)
		{
			
			num2[i]=in.nextInt();
		}
		int rotate=in.nextInt();
		for(int i=0;i<size;i++)
		{
			
			 if(num2[i] % 2 != 0)
	            {
				    oddpos[k] = num2[i];
	                k++;
	            }
	            else
	            {
	            	evenpos[j] = num2[i];
	                j++;
	            }
			
			
							
		}
		
		
		for(int x=0;x<rotate;x++)
		{
			
			  temp = oddpos[k-1];    
	            
	            for(int a = k-1; a > 0; a--){    
	                
	            	oddpos[a] = oddpos[a-1];    
	            }    
	               
	            oddpos[0] = temp;    
		}
		
		/*
		 * System.out.println(); for(int l=0;l<k;l++)
		 * System.out.print(" odd "+oddpos[l]); System.out.println();
		 */
		
		for(int x=0;x<rotate;x++)
		{
			
			  temp = evenpos[0];
	             
	            for (int z = 0; z < j-1; z++) 
	            {
	            	evenpos[z] = evenpos[z+1];
	            }
	             
	            evenpos[j - 1] = temp;
		}
		
		
		/*
		 * System.out.println(); for(int l=0;l<j;l++)
		 * System.out.print(" even "+evenpos[l]); System.out.println();
		 */
		 
		
		
		int ev=0,od=0,cnt=0;
		for(int u=0;u<size;u++)
		{
			cnt=u+1;
			if(cnt%2==1)
			{
				num2[u]=oddpos[od];
				od++;
			}
			else
			if(cnt%2==0)
			{
				num2[u]=evenpos[ev];
				ev++;
			}
			
		}
		for(int l=0;l<size;l++)
			System.out.print(num2[l]+" ");
	}
}