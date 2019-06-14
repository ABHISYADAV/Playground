import java.util.Scanner;
class Main{
	public static void main (String[] args) {
    	Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str="";
       if(num>0)
       {
    	   System.out.println(intToString(num));
       }
       else
       {
    	   num=num*(-1);
    	   System.out.println("-"+intToString(num));
    	   
       }
	}
	
	
	public static String intToString(int n) { 
	    if (n == 0) return "0";
	    StringBuilder sb = new StringBuilder();
	    while (n > 0) { 
	        int curr = n % 10;
	        n = n/10;
	        sb.append(curr);
	    }
	    String s = sb.substring(0);
	    sb = new StringBuilder();
	    for (int i = s.length() -1; i >= 0; i--) { 
	        sb.append(s.charAt(i));
	    }
	    return sb.substring(0);
	}
}