import java.util.Scanner;
public class TheatreSquare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		long a = sc.nextLong();
		long lengthFlagstones = (n + a - 1) / a;
        long widthFlagstones = (m + a - 1) / a;
        long ans = lengthFlagstones * widthFlagstones;
        System.out.println(ans);
	}
}
