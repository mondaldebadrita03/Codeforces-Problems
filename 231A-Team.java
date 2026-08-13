//Easy Approach
import java.util.Scanner;
public class Team
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int[][] canSolve = new int[n][3];
		int solved = 0;
		
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < 3; j++){
		        canSolve[i][j] = sc.nextInt();
		    }
		}
		
		for(int i = 0; i < n; i++){
		    int sum = 0;
		    for(int j = 0; j < 3; j++){
		        sum += canSolve[i][j];
		    }
		    if(sum>=2)
		        solved++;
		}
        System.out.println(solved);
	}
}

//Optimal Approach
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int solved = 0;

        for(int i = 0; i < n; i++){
            int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();
            if(sum >= 2)
                solved++;
        }
      
        System.out.println(solved);
    }
}
