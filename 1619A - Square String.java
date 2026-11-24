import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            int n = s.length();

            if (n % 2 != 0) {
                System.out.println("NO");
                continue;
            }

            String first = s.substring(0, n / 2);
            String second = s.substring(n / 2);

            if (first.equals(second)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
