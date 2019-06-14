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
        String name2=br.readLine(); 
        String name3=br.readLine(); 
        LinkedHashSet<String> obj=new LinkedHashSet(); 
        String str[] = name.split(",");
        for(int i=0;i<str.length;i++)
        {
        	obj.add(str[i]);
        }
        System.out.println(obj);
        System.out.println("Enter the value to be deleted: "+name2);
        obj.remove(name2);
        System.out.println(obj);
        System.out.println("Enter the value to be added: "+name3);
        obj.add(name3);
        System.out.println(obj);
        
       
    }
}