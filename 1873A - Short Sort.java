import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int diff = 0;

            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) != "abc".charAt(i)) {
                    diff++;
                }
            }

            if (diff == 0 || diff == 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
