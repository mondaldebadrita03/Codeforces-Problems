import java.util.*;
public class IWannaBetheGuy{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		
		for(int i = 0; i < 2; i++){
		    int a = sc.nextInt();
		    for(int j = 0; j < a; j++){
		        int m = sc.nextInt();
		        if(!set.contains(m))
		            set.add(m);
		    }   
		}
		for(int i = 1; i <= n; i++){
		    if(!set.contains(i)){
		        System.out.println("Oh, my keyboard!");
		        return;
		    }
		}
		System.out.println("I become the guy.");
	}
}
