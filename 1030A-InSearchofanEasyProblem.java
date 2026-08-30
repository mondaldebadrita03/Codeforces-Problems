import java.util.Scanner;
public class InSearchofanEasyProblem{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i = 0; i < n; i++){
		    if(sc.nextInt() == 1)
		        count++;
		}
		if(count >= 1)
		    System.out.println("HARD");
		else
		    System.out.println("EASY");
	}
}
