import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int count = 0;
		    
		    while(n-- > 0){
		        int inp = sc.nextInt();
		        if(inp >= 10 && inp <= 60)
		            count++;
		    }
		    System.out.println(count);
		}

	}
}
