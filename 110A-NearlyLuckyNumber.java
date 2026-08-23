import java.util.Scanner;
public class NearlyLuckyNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long lucky = 0;
		
		String s = String.valueOf(n);
	    for(int i = 0; i < s.length(); i++){
	        if(s.charAt(i) =='7' || s.charAt(i) =='4')
	            lucky++;
	    }
	    System.out.println(lucky == 7 || lucky == 4 ? "YES" : "NO");
	    sc.close();
	}
}
