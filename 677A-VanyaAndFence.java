import java.util.Scanner;
public class VanyaAndFence{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int friendsCount = sc.nextInt();
		int fenceHeight = sc.nextInt();
		int roadWidth = 0;
		
		for(int i = 0; i < friendsCount; i++){
		    if(sc.nextInt() <= fenceHeight)
		        roadWidth++;
		    else
		        roadWidth += 2;
		}
		System.out.println(roadWidth);
	}
}
