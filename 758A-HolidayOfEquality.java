import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = 0;
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		    max = Math.max(max, arr[i]);
		}
		
		int ans = 0;
		
		for(int i = 0; i < n; i++){
		    ans += max - arr[i];
		}
		
		System.out.println(ans);
	}
}
