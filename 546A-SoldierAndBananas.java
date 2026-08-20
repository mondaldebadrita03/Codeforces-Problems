import java.util.Scanner;
public class SoldierAndBananas
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int w = sc.nextInt();
		int price = 0;
		
		for(int i = 1; i <= w; i++){
		    price += i * k;
		}
		if(price < n)
		    System.out.println(0);
		else
		    System.out.println(Math.abs(n -price));
	}
}
