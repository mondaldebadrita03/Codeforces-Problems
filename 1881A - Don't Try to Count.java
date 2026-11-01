import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    String x = sc.next();
		    String y = sc.next();
		    
		    StringBuilder sb = new StringBuilder(x);
		    int count = 0;
		    int ans = -1;
		    
		    while(true){
		        if(sb.toString().contains(y)){
		            ans = count;
		            break;
		        }
		        else if(sb.length() >= n + m - 1){
		            break;
		        }
		        sb.append(sb);
		        count++;
		    }
		    System.out.println(ans);
		}
	}
}
