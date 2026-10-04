import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int r = sc.nextInt();
		int ans = 1;
		
		for(int i = 1; i <= 10; i++){
		    if(i * k % 10 == 0 || i * k % 10 == r){
		        ans = i;
		        break;
		    }
		}
		System.out.println(ans);
	}
}
