import java.util.*;
import java.io.*;
import java.lang.*;

public class Main 
{
    public static void main(String a[]) throws IOException
    {
    	TreeMap<String, String> h = new TreeMap<String, String>();
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
        System.out.println("Enter the number of values to be inserted in map:"+cnt);
        System.out.println(h);
        System.out.println("Enter the index to be removed:"+rkey);
        h.remove(rkey);
        System.out.println(h);
        System.out.println("Size of map is : "+h.size());
        
    }
}
