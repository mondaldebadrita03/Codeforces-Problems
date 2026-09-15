// Approach One (Using loops)

import java.util.Scanner;
public class InsomniaCure {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		int m = sc.nextInt();
		int n = sc.nextInt();
		int d = sc.nextInt();
		int count = 0;
		
		if(k == 1){
		    System.out.println(d);
		}
		else{
		    for(int i = 1; i <= d; i++){
		        if(i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}

// Approach Two (Using Inclusion-Exclusion)

import java.util.Scanner;

public class InsomniaCure {
    static int gcd(int a, int b) {
        while(b != 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();

        int total = d / k + d / l + d / m + d / n;
        int pairs = d / lcm(k, l) + d / lcm(k, m) + d / lcm(k, n) + d / lcm(l, m) + d / lcm(l, n) + d / lcm(m, n);
        int triples = d / lcm(lcm(k, l), m) + d / lcm(lcm(k, l), n) + d / lcm(lcm(k, m), n) + d / lcm(lcm(l, m), n);
        int all = d / lcm(lcm(k, l), lcm(m, n));

        System.out.println(total - pairs + triples - all);
    }
}
