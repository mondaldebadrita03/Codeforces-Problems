import java.util.Scanner;
public class Elephant{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int step = 0;
		
		while(n > 0) {
		    if(n >= 5)
		        n -= 5;
		    else if(n < 5)
		        n = 0;
		    step++;
		}
		System.out.println(step);
	}
}
