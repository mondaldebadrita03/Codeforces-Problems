import java.util.Scanner;
import java.util.HashSet;
public class AntonAndLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		HashSet<Character> set = new HashSet<>();
		
		for(char c: s.toCharArray()){
		    if(c != ' ' && c != '{' && c != '}' && c != ','){
		        if(!set.contains(c))
		            set.add(c);
		    }
		}
		System.out.println(set.size());
	}
}
