import java.util.*;
public class WordCapitalization{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
   		char[] c = s.toCharArray();
   		c[0] = Character.toUpperCase(c[0]);
   		// System.out.println(String.valueOf(c));
      System.out.println(new String(c)); 
		  System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
	}
}

//Better approach
import java.util.*;
public class WordCapitalization{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
    System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
  }
}
