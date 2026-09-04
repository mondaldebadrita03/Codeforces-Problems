import java.util.Scanner;
import java.util.HashSet;
public class IsYourHorseshoeOnTheOtherHoof{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int count = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i= 0; i < 4; i++){
		    int s = sc.nextInt();
		    if(!set.contains(s))
		        set.add(s);
		    else
		        count++;
		}
		System.out.println(count);
	}
}

// Another version (Cleaner)
import java.util.*;
public class IsYourHorseshoeOnTheOtherHoof{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> set = new HashSet<>();
		
		for(int i= 0; i < 4; i++){
		    set.add(sc.nextInt());
		}
		System.out.println(4 - set.size());
	}
}

