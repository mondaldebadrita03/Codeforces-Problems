import java.util.Scanner;
public class Magnets{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int[] mag = new int[n];
    
		for(int i = 0; i < n; i++){
		    mag[i] = sc.nextInt();
		}
		
		for(int i = 1; i < n; i++){
		    if(mag[i] != mag[i - 1])
		        count++;
		}
		System.out.println(count);
	}
}
