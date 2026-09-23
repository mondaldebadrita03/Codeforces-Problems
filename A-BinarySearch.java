import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] arr = new long[n];
		boolean[] ans = new boolean[k];
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextLong();
		}
		
		for(int i = 0; i < k; i++){
		    long x = sc.nextLong();
		    ans[i] = binarySearch(arr, n, x);
		}
		
		for(int i = 0; i < k; i++){
		    if(ans[i])
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
	
	private static boolean binarySearch(long[] arr, int n, long x){
	    int left = 0;
	    int right = n - 1;
	    
	    while(left <= right){
	        int mid = left + (right - left) / 2;
	        
	        if(arr[mid] < x){
	            left = mid + 1;
	        }
	        else if(arr[mid] > x){
	            right = mid - 1;
	        }
	        else{
	            return true;
	        }
	    }
	    return false;
	}
}
