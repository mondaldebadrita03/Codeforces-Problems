import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();
		int a4 = sc.nextInt();
		
		String s = sc.next();
		int cal = 0;
		
		for(char c: s.toCharArray()){
		    if(c == '1'){
		        cal += a1;
		    }
		    else if(c == '2'){
		        cal += a2;
		    }
		    else if(c == '3'){
		        cal += a3;
		    }
		    else{
		        cal += a4;
		    }
		}
		System.out.println(cal);
	}
}
