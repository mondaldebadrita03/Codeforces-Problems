import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m_wins = 0;
		int c_wins = 0;
		
		while(n-- > 0){
		    int m = sc.nextInt();
		    int c = sc.nextInt();
		    
		    if(m > c){
		        m_wins++;
		    }
		    else if(c > m){
		        c_wins++;
		    }
		}
		
		if(m_wins == c_wins){
		    System.out.println("Friendship is magic!^^");
		}
		else{
		    System.out.println(m_wins > c_wins ? "Mishka": "Chris");
		}
	}
}
