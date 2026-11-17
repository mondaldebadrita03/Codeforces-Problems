import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            int switches = 0;

            if (s.charAt(0) == 'B') {
                switches++;
            }

            for (int i = 1; i < n; i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    switches++;
                }
            }

            System.out.println(switches);
        }
    }
}
