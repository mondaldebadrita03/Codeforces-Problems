import java.util.Scanner;
public class BeautifulMatrix
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int[][] matrix = new int[5][5];
		int rowIndex = 0;
		int colIndex = 0;
		for(int i = 1; i <= 5; i++){
		    for(int j = 1; j <= 5; j++){
		        //matrix[i][j] = sc.nextInt();
		        if(sc.nextInt() == 1){
		            rowIndex = i;
		            colIndex = j;
		        }
		    }
		}
		System.out.println(Math.abs(3-rowIndex)+Math.abs(3-colIndex));
	}
}
