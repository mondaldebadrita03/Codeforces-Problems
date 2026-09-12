import java.util.Scanner;
public class BalancedArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
		for(int i = 0; i < test; i++){
		    int n = sc.nextInt();
		    constructArray(n);
		}
	}
	
	private static void constructArray(int n){
	    int[] arr = new int[n];
	        
	    if(n % 4 != 0){
	        System.out.println("NO");
	        return;
	    }

	   int sumEven = 0;
	   int sumOdd = 0;

       for(int i = 0; i< n / 2; i++){
            arr[i] = 2 * (i + 1);
            sumEven += arr[i];
        }

        for(int i = 0; i < n / 2 - 1; i++){
            arr[n / 2 + i]=2 * i + 1;
            sumOdd += arr[n / 2 + i];
        }
        arr[n - 1] = sumEven - sumOdd;
        
	    System.out.println("YES");
	    for(int k = 0; k < n; k++){
	       System.out.print(arr[k] +" ");
	    }
	    System.out.println();
	}
}
