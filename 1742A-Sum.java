import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    boolean[] ans = new boolean[n];
	    
	    for(int i = 0; i < n; i++){
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	        
	        if(a - b - c == 0 || b - a - c == 0 || c - a - b == 0){
	            ans[i] = true;
	        }
	    }
	    
	    for(int i = 0; i < n; i++){
	        if(ans[i]){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
	}
}
