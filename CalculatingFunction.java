import java.util.Scanner;
public class CalculatingFunction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for(int i = 1; i <= n; i++){
		    if(i % 2 == 0)
		        sum += i;
		    else
		        sum += (-1) * i;
		}
		System.out.println(sum);
	}
}

//Optimal

import java.util.Scanner;
public class CalculatingFunction{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		long n = sc.nextLong();
        long sum = 0;

        // O(1) Math Formula
        if (n % 2 == 0) {
            sum = n / 2;
        } else {
            sum = -(n + 1) / 2;
        }
        System.out.println(sum);
        sc.close();
	}
}
