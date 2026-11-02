import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int x = 0; x < n; x++){
		    arr[x] = sc.nextInt();
		}
		
		int i = 0;
		int j = n - 1;
		
		int score_s = 0;
		int score_d = 0;
		int turn = 0;
		
		while(turn < n){
		    if(turn % 2 == 0){
		        if(arr[i] > arr[j]) {
		            score_s += arr[i];
		            i++;
		        }
		        else{
		            score_s += arr[j];
		            j--;
		        }
		    }
		    else{
		        if(arr[i] > arr[j]) {
		            score_d += arr[i];
		            i++;
		        }
		        else{
		            score_d += arr[j];
		            j--;
		        }
		    }
		    turn++;
		}
		System.out.println(score_s +" "+ score_d);
	}
}
