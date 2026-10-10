import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
		int n = sc.nextInt();
		int k = sc.nextInt();

		int remTime = 240 - k;
		int solved = 0;
		
		for(int i = 1; i <= n; i++){
		    remTime -= 5 * i;
		    solved++;
		    
		    if(remTime < 0)
		        break;
		}
		System.out.println(solved);
	}
}
