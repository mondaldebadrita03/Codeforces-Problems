import java.util.Scanner;
public class Translation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		if(s1.length() != s2.length()){
		    System.out.println("NO");
		    return;
		}
		int j = s2.length() - 1;
		
		for(int i = 0; i < s1.length() / 2; i++){
		    if(s1.charAt(i) != s2.charAt(j)){
		        System.out.println("NO");
		        return;
		    }
		    j--;
		}
		System.out.println("YES");
	}
}
