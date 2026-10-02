import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int freq1[] = new int[26];
		int freq2[] = new int[26];
		
		String s1 = sc.next() + sc.next();
		String s2 = sc.next();
		
		for(char c: s1.toCharArray()){
		    freq1[c - 'A']++;
		}
		
		for(char c: s2.toCharArray()){
		    freq2[c - 'A']++;
		}
		
		System.out.println(Arrays.equals(freq1, freq2) ? "YES" : "NO");
		
	}
}
