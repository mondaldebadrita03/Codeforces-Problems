import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            if((a + b + c) % 3 == 0){
                int min = Math.min(a, Math.min(b, c));
                int max = Math.max(a, Math.max(b, c));

                if (max - min == 2) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
