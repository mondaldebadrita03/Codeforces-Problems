import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int num = 0;
            int count = 0;

            while (count < k) {
                num++;

                if (num % 3 == 0 || num % 10 == 3) {
                    continue;
                }

                count++;
            }

            System.out.println(num);
        }

        sc.close();
    }
}
