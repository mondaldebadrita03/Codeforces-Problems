import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    String p = sc.next();
		    String q = sc.next();
		    String r = "six";
		    
		    int[] freq1 = new int[26];
		    int[] freq2 = new int[26];

		    for(char c: p.toCharArray()){
		        freq1[c - 'a']++;
		    }
		    
		    for(char c: q.toCharArray()){
		        freq1[c - 'a']--;
		    }
		    
		    for(char c: r.toCharArray()){
		        freq2[c - 'a']++;
		    }
		    
		    System.out.println(Arrays.equals(freq1, freq2) ? "Yes": "No");
		}
	}
}
