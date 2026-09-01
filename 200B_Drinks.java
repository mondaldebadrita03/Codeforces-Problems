import java.util.Scanner;
public class Drinks{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double amt = 0;
		for(int i = 0; i < n; i++){
		    amt += sc.nextInt();
		}
		System.out.printf("%.12f\n",amt / n);
	}
}
