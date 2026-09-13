import java.util.Scanner;
public class ArrivaloftheGeneral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxIndex = 0;
		int minIndex = 0;
    
		for(int i = 0; i < n; i++){
		    if(max < arr[i]){
		        max = arr[i];
		        maxIndex = i;
		    }
		    if(min >= arr[i]){
		        min = arr[i];
		        minIndex = i;
		    }
		}
		int swaps = n - minIndex - 1 + maxIndex;
		if(maxIndex > minIndex)
		    swaps--;
	    System.out.println(swaps);
	}
}
