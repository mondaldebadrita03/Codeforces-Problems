import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] res = new long[t];
		
		for(int i = 0; i < t; i++){
		    long n = sc.nextLong();
		    
		    res[i] = distributeCandies(n);
		}
		
		for(int i = 0; i < t; i++){
		    System.out.println(res[i]);
		}
	}
	
	private static long distributeCandies(long n){
        if(n < 3)
            return 0;
	    return (n - 1) / 2;
	}
}
