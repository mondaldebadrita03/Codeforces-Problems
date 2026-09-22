import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] ans = new boolean[n];
		
		for(int i = 0; i < n; i++){
		    int x = sc.nextInt();
		    
		    if((x - 1) % 3 == 0 || (x + 1) % 3 == 0)
		        ans[i] = true;
		    else
		        ans[i] = false;
		}
		
		for(int i = 0; i < n; i++){
		    if(ans[i])
		        System.out.println("First");
		    else
		        System.out.println("Second");
		}
	}
}
