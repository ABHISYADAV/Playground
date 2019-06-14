import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        // type your code here
    	InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);               
        String name=br.readLine();    
        TreeSet<String> obj=new TreeSet<String>();  
        String str[] = name.split(",");
        System.out.println("Duplicate Entry is: ");
        for(int i=0;i<str.length;i++)
        {
        	if(!obj.add(str[i])){
        		 
        		System.out.println(str[i]);
        	}
        }
        System.out.println("TreeSet is : "+obj);
        
        
       
    }
}