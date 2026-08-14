//Using Switch case
import java.util.Scanner;
public class Bit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		
		for(int i = 0; i < n; i++){
		    String operation = sc.next().trim();
		    switch(operation){
		        case "++X" -> ++x;
		        case "X++" -> x++;
		        case "--X" -> --x;
		        case "X--" -> x--;
		        default -> System.out.println("Enter a valid input!");
		    }
		}
		sc.close();
		System.out.println(x);
	}
}

//More simpler
import java.util.Scanner;
public class Bit
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		
		for(int i = 0; i < n; i++){
		    String operation = sc.next().trim();
		    if(operation.contains("+"))
          x++;
        else
          x--;
		}
		sc.close();
		System.out.println(x);
	}
}
