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
        LinkedList obj = new LinkedList();
        String str[] = name.split(",");
        for(int i=0;i<str.length;i++)
        {
        	obj.add(str[i]);
        }
        System.out.println(obj);
        System.out.println("Size of the linked list: "+obj.size());
        System.out.println("Is LinkedList empty? "+obj.isEmpty());
        System.out.println("Does LinkedList contains "+name2+"?");
        System.out.println(obj.contains(name2));
    }
}