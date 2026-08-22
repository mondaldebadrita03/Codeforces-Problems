import java.util.Scanner;
public class WrongSubtraction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int iter = sc.nextInt();
		
		while(iter > 0){
		    int digit = num % 10;
		    if(digit == 0)
		        num /= 10;
		    else
		        num--;
		    iter--;
		}
		System.out.println(num);
	}
}
