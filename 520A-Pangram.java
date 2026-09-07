import java.util.Scanner;
public class Pangram{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine().toLowerCase();
		boolean[] seen = new boolean[26];
		
		for(int i = 0; i < n; i++){
		    char c = str.charAt(i);
		    seen[c - 'a'] = true;
		}
		
		for(int i = 0; i < 26; i++){
		    if(!seen[i]){
		        System.out.println("NO");
		        return;
		    }
		}
		System.out.println("YES");
	}
}
