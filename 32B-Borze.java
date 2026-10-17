import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuilder ans = new StringBuilder();
		
		for(int i = 0; i < str.length(); i++){
		    if(str.charAt(i) == '.'){
		        ans.append("0");
		    }
		    else if(str.charAt(i) == '-' && str.charAt(i + 1) == '.' && i < str.length() - 1){
		        ans.append("1");
		        i++;
		    }
		    else{
		        ans.append("2");
		        i++;
		    }
		}
		System.out.println(ans.toString());
	}
}
