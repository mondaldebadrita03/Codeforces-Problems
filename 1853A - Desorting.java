import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            // Already not sorted
            boolean sorted = true;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    sorted = false;
                    break;
                }
            }

            if (!sorted) {
                System.out.println(0);
                continue;
            }

            long ans = Long.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                long difference = a[i + 1] - a[i];

                long operations = difference / 2 + 1;

                ans = Math.min(ans, operations);
            }

            System.out.println(ans);
        }
    }
}
