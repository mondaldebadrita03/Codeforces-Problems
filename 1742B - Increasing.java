// Approach 1
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            boolean possible = true;

            for (int i = 1; i < n; i++) {
                if (arr[i] == arr[i - 1]) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}

// Approach 2
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();

                if (set.contains(x)) {
                    possible = false;
                }

                set.add(x);
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }
}
