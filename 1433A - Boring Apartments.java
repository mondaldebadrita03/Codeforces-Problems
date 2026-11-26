import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int digit = n % 10;

            int length = String.valueOf(n).length();

            int answer = (digit - 1) * 10;

            answer += length * (length + 1) / 2;

            System.out.println(answer);
        }
    }
}
