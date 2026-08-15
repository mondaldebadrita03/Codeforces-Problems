import java.util.Scanner;
public class BoyOrGirl
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		String s = sc.nextLine().toLowerCase();
		int n = s.length();
		int[] b = new int[26];
		
		for(int i = 0; i < n; i++){
            b[s.charAt(i)-'a']++;
		}
		
		for(int i = 0; i < 26; i++){
		    if(b[i] > 0)
                count++;
		}
		    
		System.out.println(count % 2 != 0 ? "IGNORE HIM!" : "CHAT WITH HER!");
		
	}
}
