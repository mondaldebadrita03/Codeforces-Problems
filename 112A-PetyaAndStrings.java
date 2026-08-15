import java.util.Scanner;
public class PetyaAndStrings
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.nextLine().toLowerCase();
		String s2 = sc.nextLine().toLowerCase();
		int n = s1.length();
		
		for(int i = 0; i < n; i++){
		    if(s1.charAt(i) < s2.charAt(i)){
		        System.out.println(-1);
		            return;
		    }
		    else if(s1.charAt(i) > s2.charAt(i)){
		        System.out.println(1);
		            return;
		    }
		    
		}
		    
		System.out.println(0);
		
	}
}
