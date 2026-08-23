import java.util.Scanner;
public class AntonAndDanik{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		
		int a_count = 0;
		int d_count = 0;
		
	    for(int i = 0; i < n; i++){
	        if(s.charAt(i) =='A')
	            a_count++;
	        else
	            d_count++;
	    }
	    if(a_count == d_count)
	        System.out.println("Friendship");
	    else
	        System.out.println(a_count > d_count ? "Anton" : "Danik");
	    sc.close();
	}
}
