import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.InputMismatchException;
public class Main 
{
    public static void main(String a[]) throws IOException
    {
    	TreeMap<String, String> h = new TreeMap<>();
    	InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);               
        String cnt=br.readLine();
        for(int i=0;i<Integer.parseInt(cnt);i++)
        {
        	String key = br.readLine();
        	String value = br.readLine();
        	h.put(key, value);
        }
        String rkey = br.readLine();
        String addkey = br.readLine();
        String rval = br.readLine();
        System.out.println("Enter the number of values to be inserted in map:"+cnt);
        System.out.println(h);
        System.out.println("Enter the index to be removed:"+rkey);
        h.remove(rkey);
        System.out.println(h);
        System.out.println("Enter the index to insert:"+addkey);
        System.out.println("Enter the value to be inserted:"+rval);
        h.put(addkey,rval);
        System.out.println(h);
        
    }
}