import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
		    String c = sc.next();
		    
		    if(c.matches("[codeforces]")){
		        System.out.println("YES");
		    }else{
		        System.out.println("NO");
		    }
		}
	}
}
