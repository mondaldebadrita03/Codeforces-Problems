// Approach 1: using sort method
import java.util.Scanner;
import java.util.Arrays;

public class MediumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        int[] arr = new int[3];
	        arr[0] = sc.nextInt();
	        arr[1] = sc.nextInt();
	        arr[2] = sc.nextInt();
	        
	        Arrays.sort(arr);
	        ans[i] = arr[1];
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.println(ans[i]);
	    }

	}
}

// Approach 2

import java.util.Scanner;
import java.util.Arrays;

public class MediumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();

          if((a >= b && a <= c) || (a >= c && a <= b))
              ans[i] = a;
          else if((b >= a && b <= c) || (b >= c && b <= a))
              ans[i] = b;
          else
              ans[i] = c;
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.println(ans[i]);
	    }

	}
}

