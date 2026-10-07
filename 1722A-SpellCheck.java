// Approach 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            if (n == 5 && s.contains("T") && s.contains("i") && s.contains("m") && s.contains("u") && s.contains("r")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

// Approach 2

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] freq = new int[123];
		int t = sc.nextInt();
		String s1 = "Timur";
		
		for(char c: s1.toCharArray()){
		    freq[c - 'A']++;
		}
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    if(n == 5){
	            int[] freqAns = new int[123];
	        
	            for(char c: s.toCharArray()){
	                freqAns[c - 'A']++;
	            }
	            System.out.println(Arrays.equals(freq, freqAns) ? "YES": "NO");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
