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
        LinkedHashSet<String> obj=new LinkedHashSet(); 
        String str[] = name.split(",");
        for(int i=0;i<str.length;i++)
        {
        	obj.add(str[i]);
        }
        System.out.println(obj);
       
    }
}