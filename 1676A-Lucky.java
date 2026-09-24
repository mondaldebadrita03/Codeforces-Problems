import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] ans = new boolean[n];
		
		for(int i = 0; i < n; i++){
		    int x = sc.nextInt();
		    int mid = 0;
		    int rSum = 0;
		    int lSum = 0;
		    
		    while(x > 0){
		        if(mid < 3){
		           rSum += x % 10;
		           x /= 10;
		           mid++;
		        }
		        else{
		           lSum += x % 10;
		           x /= 10;
		        }
		    }

		    if(lSum == rSum)
		        ans[i] = true;
		    else
		        ans[i] = false;
		}
		
		for(int i = 0; i < n; i++){
		    if(ans[i])
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}
