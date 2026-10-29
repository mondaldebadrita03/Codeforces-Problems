import java.util.*;
public class Main {
	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    String s1 = sc.next();
		    String s2 = sc.next();
		    
		    char[] a1 = s1.toCharArray();
		    char temp = a1[0];
		    char[] a2 = s2.toCharArray();
		    
		    a1[0] = a2[0];
		    a2[0] = temp;
		    
		    System.out.println(new String(a1)+" "+ new String(a2));
		}
	}
}
