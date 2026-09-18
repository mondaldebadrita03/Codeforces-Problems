import java.util.Scanner;
public class FoxAndSnake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int r = sc.nextInt();
	    int c = sc.nextInt();
	    int val = 0;
	    
	    for(int i = 0; i < r; i++){
	        boolean bend = false;
	        for(int j = 0; j < c; j++){
	            if(i % 2 == 0){
	                System.out.print("#");
	            }
	            else{
	                if(j == c - 1 && val == 0 && !bend){
	                    System.out.print("#");
	                    bend = true;
	                    val--;
	                }
	                else if(j == 0 && val == -1 && !bend){
	                    System.out.print("#");
	                    bend = true;
	                    val++;
	                }
	                else{
	                    System.out.print(".");
	                }
	            }
	        }
	        System.out.println();
	    }
	}
}
