import java.util.Scanner;
public class WayTooLongWords
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] word = new String[100];
		
		for(int i = 0; i < n; i++){
		    word[i] = sc.nextLine();
		}
		
		for(int i = 0; i < n; i++){
		    String s = word[i];
		    if(s.length()<=10){
		        System.out.println(s.toString());
		    }
		    else{
		        String x = "" + s.charAt(0) + (s.length() - 2) + (s.charAt(s.length()-1));
		        System.out.println(x);
		    }
		}
	}
}
