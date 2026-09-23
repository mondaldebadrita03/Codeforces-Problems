// Approach 1
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		
		for(int i = 0; i < n; i++){
		    int size = sc.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size; j++){
		        arr[j] = sc.nextInt();
		    }
		    ans[i] = countBlankSpaces(arr, size);
		}
		
		for(int i = 0; i < n; i++){
		    System.out.println(ans[i]);
		}
	}
	private static int countBlankSpaces(int[] arr, int size){
	    int spaces = 0;
	    int i = 0;
	    int j = 0;
	    
	    while(i < size && j < size){
	        int zeros = 0;
	        while(j < size && arr[j] != 1){
	            zeros++;
	            j++;
	        }
	        j++;
	        i = j;
	        spaces = Math.max(spaces, zeros);
	    }
	   return spaces;
	}
}

// Approach 2
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		
		for(int i = 0; i < n; i++){
		    int size = sc.nextInt();
		    int[] arr = new int[size];
		    for(int j = 0; j < size; j++){
		        arr[j] = sc.nextInt();
		    }
		    ans[i] = countBlankSpaces(arr, size);
		}
		
		for(int i = 0; i < n; i++){
		    System.out.println(ans[i]);
		}
	}
	private static int countBlankSpaces(int[] arr, int size){
      int zeros = 0;
	    int spaces = 0;
    
	    for (int i = 0; i < size; i++) {
            if (arr[i] == 0) {
                zeros++;
                spaces = Math.max(spaces, zeros);
            } else {
                zeros = 0;
            }
      }
	   return spaces;
	}
}
