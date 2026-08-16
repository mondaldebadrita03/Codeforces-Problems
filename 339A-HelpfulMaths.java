import java.util.*;
public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] parts = s.split("\\+");
        Arrays.sort(parts);
        String result = String.join("+", parts);
        System.out.println(result);
        sc.close();
    }
}
