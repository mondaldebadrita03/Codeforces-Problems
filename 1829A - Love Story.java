import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String s = "codeforces";
		
		while(t-- > 0){
		    String str = sc.next();
		    int count = 0;
		    
		    for(int i = 0; i < 10; i++){
		        if(str.charAt(i) != s.charAt(i))
		            count++;
		    }
		    
		    System.out.println(count);
		}
	}
}
