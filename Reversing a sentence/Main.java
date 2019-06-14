import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        StringBuilder sb=new StringBuilder(str1);
        int str_len=str1.length()-1;
        reverse_string(sb, 0, str_len);
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
    	String str=new String(sb);
    	String[] words = str.split("\\s");
        
        String outputString = "";
         
        for (int i = words.length-1; i >= 0; i--)
        {
            outputString = outputString + words[i] + " ";
        }
         
        System.out.println(outputString);
    }
}