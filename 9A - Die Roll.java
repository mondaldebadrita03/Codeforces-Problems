
import java.util.*;

public class Main {

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();
        int w = sc.nextInt();

        int maxScore = Math.max(y, w);

        int favourable = 6 - maxScore + 1;

        if (favourable <= 0) {
            System.out.println("0/1");
        } else {
            int g = gcd(favourable, 6);

            System.out.println((favourable / g) + "/" + (6 / g));
        }

        sc.close();
    }
}
