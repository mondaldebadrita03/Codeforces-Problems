import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    
		    Map<Integer, Integer> freqMap = new HashMap<>();
		    Map<Integer, Integer> indexMap = new HashMap<>();
		    
		    for(int i = 0; i < n; i++){
		        a[i] = sc.nextInt();
		        indexMap.put(a[i], i + 1);
		        
		        int count = freqMap.getOrDefault(a[i], 0) + 1;
		        freqMap.put(a[i], count);
		    }
		    
		    for(int num: freqMap.keySet()){
		        if(freqMap.get(num) == 1){
		            System.out.println(indexMap.get(num));
		            break;
		        }
		    }
		}
		sc.close();
	}
}
