import java.util.Scanner;
public class BeautifulYear{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isUnique = false;

		while(!isUnique){
		    year++;
		    if(freqOne(year))
		        isUnique = true;
		}
		System.out.println(year);
	}
	private static boolean freqOne(int year){
	    int[] freq = new int[10];
	    for(int i = 0; i < 4; i++){
	        int digit = year % 10;
	        freq[digit]++;
	        year /= 10;
	    }
	    
	    int count = 0;
	    for(int i = 0; i < 10; i++){
	        if(freq[i] == 1)
	            count++;
	    }
	    return count == 4;
	}
}
