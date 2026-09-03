import java.util.Scanner;
public class UltraFastMathematician{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = "";
		
		for(int i = 0; i < s1.length(); i++){
		    s3 += s1.charAt(i) ^ s2.charAt(i);
		}
		System.out.println(s3);
	}
}
