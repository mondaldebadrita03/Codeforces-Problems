import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    String s = sc.next();
		    int k = 0;
		    
		    for(int i = 0; i < s.length(); i++){
		        if(s.charAt(i) != '0')
		            k++;
		    }
		    System.out.println(k);

            int size = s.length();
            boolean first = true;
            
	        for(int i = 0; i < size; i++){
		        if(s.charAt(i) != '0'){
		            int digit = Character.getNumericValue(s.charAt(i)); 
		            int mulFact = (int) Math.pow(10, size - 1 - i);
		            
		            if(!first){
		                System.out.print(" ");
		            }
		            System.out.print(digit * mulFact);
		            first = false;
		        }
		    }
	        System.out.println();
		}
		sc.close();
	}
}
