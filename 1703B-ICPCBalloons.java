import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    String s = sc.next();
		    int[] freq = new int[26];
		    int balloons = 0;

		    for(char c: s.toCharArray()){
		        if(freq[c - 'A'] == 0){
		            balloons += 2;
		            freq[c - 'A']++;
		        }
		        else{
		            balloons++;
		        }
		    }
		    System.out.println(balloons);
		}
	}
}
