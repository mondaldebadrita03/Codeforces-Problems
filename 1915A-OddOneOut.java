// Approach 1

import java.util.Scanner;
import java.util.ArrayList;

public class OddOneOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        int a1 = sc.nextInt();
	        int a2 = sc.nextInt();
	        int a3 = sc.nextInt();
	        
	        if(a1 == a2)
	            arr[i] = a3;
	        else if(a1 == a3)
	            arr[i] = a2;
	        else
	            arr[i] = a1;
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.println(arr[i]);
	    }

	}
}

// Approach 2 (Using XOR ^ operator)

import java.util.Scanner;
import java.util.ArrayList;

public class OddOneOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
	    
	    for(int i = 0; i < n; i++){
	        int a1 = sc.nextInt();
	        int a2 = sc.nextInt();
	        int a3 = sc.nextInt();
	        
	        arr[i] = a1 ^ a2 ^ a3;
	    }
	    
	    for(int i = 0; i < n; i++){
	        System.out.println(arr[i]);
	    }

	}
}
