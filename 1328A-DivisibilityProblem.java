import java.util.Scanner;
public class DivisibilityProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ans = new int[n];
		
		for(int i = 0; i < n; i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		    int res = a % b;
		    if(res != 0){
		        int rem = a % b;
		        res = b - rem;
		    }
		    ans[i] = res;
		}
		
		for(int i = 0; i < n; i++){
		    System.out.println(ans[i]);
		}
	}
}
