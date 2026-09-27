import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t-- > 0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    
		    long power = 1;
        for (int i = 0; i < n - k + 1; i++) {
            power *= 2;
        }

        long answer = power + 2L * (k - 1);

        System.out.println(answer);
		}
	}
}
