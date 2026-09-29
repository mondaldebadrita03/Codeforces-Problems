import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		if(!isPrime(m)){
		    System.out.println("NO");
		    return;
		}
		
		int nextPrime = 0;
		boolean found = false;
		while(!found){
		    n++;
		    if(isPrime(n)){
		        nextPrime = n;
		        found = true;
		    }
		}
		
		System.out.println(nextPrime == m ? "YES": "NO");
		
		sc.close();
	}
	private static boolean isPrime(int n){
	    
	    for(int i = 2; i < n; i++){
		    if(n % i == 0){
		        return false;
		    }
		}
		return true;
	}
}
