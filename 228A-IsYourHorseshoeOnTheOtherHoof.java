import java.util.Scanner;
import java.util.HashSet;
public class IsYourHorseshoeOnTheOtherHoof{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i= 0; i < 4; i++){
		    int s = sc.nextInt();
		    if(!set.contains(s))
		        set.add(s);
		    else
		        count++;
		}
		System.out.println(count);
	}
}
