import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] freq = new int[4];
		
		for(int i = 0; i < n; i++){
		    arr[i] = sc.nextInt();
		    freq[arr[i]]++;
		}
		
		int w = Math.min(freq[1], Math.min(freq[2], freq[3]));
		System.out.println(w);
		
		boolean[] visited = new boolean[n];
		
		for(int i = 0; i < w; i++){
		    int[] freqs = new int[4];
		    
		    for(int j = 0; j < n; j++){
		        
		        if(arr[j] == 1 && !visited[j] && freqs[1] == 0){
		            System.out.print(j + 1 +" ");
		            visited[j] = true;
		            freqs[1]++;
		            
		        }
		        else if(arr[j] == 2 && !visited[j] && freqs[2] == 0){
		            System.out.print(j + 1 +" ");
		            visited[j] = true;
		            freqs[2]++;
		        }
		        else if(arr[j] == 3 && !visited[j] && freqs[3] == 0){
		            System.out.print(j + 1 +" ");
		            visited[j] = true;
		            freqs[3]++;
		        }
		    }
		    System.out.println();
		}
	}
}
