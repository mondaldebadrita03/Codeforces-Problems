import java.util.Scanner;
public class Word{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int u_count = 0;
	    int l_count = 0;
	    
		for(char c: s.toCharArray()){
		    if(Character.isUpperCase(c))
		        u_count++;
		    else
		        l_count++;
		}
		
		if(l_count >= u_count)
		    System.out.println(s.toLowerCase());
		else
		    System.out.println(s.toUpperCase());
	}
}
