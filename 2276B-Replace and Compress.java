import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();

            boolean canIncrease = false;
            boolean canDecrease = false;

            for (int i = 1; i < n - 1; i++) {
                char left = s.charAt(i - 1);
                char mid = s.charAt(i);
                char right = s.charAt(i + 1);

                if (left == mid && mid == right) {
                    canIncrease = true;
                } else if (left == right && mid != left) {
                    canDecrease = true;
                }
            }

            int ans = 1;

            if (canIncrease) {
                ans++;
            }

            if (canDecrease) {
                ans++;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
