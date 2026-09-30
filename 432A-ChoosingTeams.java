import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

    int count = 0;
    int teams = 0;
        
		for(int i = 0; i < n; i++){
		    int participant = sc.nextInt();
		    if(participant <= 5 - k){
		        count++;
		    }
		    if(count == 3){
		        teams++;
		        count = 0;
		    }
		}
		System.out.println(teams);
	}
}
