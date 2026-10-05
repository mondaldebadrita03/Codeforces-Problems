import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int crimes = 0;
		int polices = 0;
		
		while(n-- > 0){
		    int e = sc.nextInt();
		    
		    if(e == -1){
		        if(polices > 0){
		            polices--;
		        }
		        else{
		            crimes++;
		        }
		    }
		    else{
		        polices += e;
		    }
		}
		System.out.println(crimes);
	}
}
