import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int firstA = sc.nextInt();

            // Read the remaining elements of the first array
            for (int i = 1; i < n; i++) {
                sc.nextInt();
            }

            int firstB = sc.nextInt();

            // Read the remaining elements of the second array
            for (int i = 1; i < m; i++) {
                sc.nextInt();
            }

            long attacksForBea = (long) firstA + n - 1;
            long attacksForVer = (long) firstB + m - 1;

            if (attacksForVer <= attacksForBea) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }

        sc.close();
    }
}
