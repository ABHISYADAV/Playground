import java.util.Scanner;
class Main{
	 public static void main(String args[])
	   {
		 
		 Scanner in = new Scanner(System.in);
		 String str = in.nextLine();
		 String str1;
	     int ci, len, j,i, freq, l=0;
	     char c, ch1,ch;
	     len=str.length();
	     boolean flag=false;
	     String str2=new String();
	     for (int x = 0; x < str.length(); x++) 
	     {
	    	 if(!str2.contains(String.valueOf(str.charAt(x)))) {
	    		 str2 += String.valueOf(str.charAt(x));
	         }}
	 //    System.out.println(str2);
	     
	     for(i=0; i<str2.length(); i++)
	        {
	    	 ch1=str2.toLowerCase().charAt(i);
	    	 flag=false;
	    	 freq=0;
	            for(j=0; j<len; j++)
	            {
	                ch = str.toLowerCase().charAt(j);
	                if((ch == ch1) && (flag==false))
	                {
	                	freq++;
	                	flag=true;
	                }
	                else
	                {
	                	if((ch == ch1) && (flag==true))
	                	freq++;
	                }
	            }
	            if(freq>0)
	            {
	                System.out.print(ch1 + "" + freq +" ");
	            }
	        }
	   
    }
}