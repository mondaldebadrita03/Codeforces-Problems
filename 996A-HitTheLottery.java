import java.util.Scanner;
public class HitTheLottery {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int bills = 0;
		
		bills += n / 100;
		n %= 100;
		
		bills += n / 20;
		n %= 20;
		
		bills += n / 10;
		n %= 10;
		
		bills += n / 5;
		n %= 5;
		
		bills += n / 1;
		n %= 1;
		System.out.println(bills);
	}
}
