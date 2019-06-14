import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        int n;
        String temp;
        Scanner s = new Scanner(System.in);
        
        n = s.nextInt();
        String names[] = new String[n];
        Scanner s1 = new Scanner(System.in);
        
        for(int i = 0; i < n; i++)
        {
            names[i] = s.next();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (names[i].compareTo(names[j])>0) 
                {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(names[i].toLowerCase());
        }
        System.out.println(names[n - 1].toLowerCase());
    }
}