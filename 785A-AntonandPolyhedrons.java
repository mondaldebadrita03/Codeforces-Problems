import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int faces = 0;
		
		for(int i = 0; i < n; i++){
		    String polyhedron = sc.next();
		    
		    switch(polyhedron){
		        case "Tetrahedron" -> faces += 4;
		        case "Cube" -> faces += 6;
		        case "Octahedron" -> faces += 8;
		        case "Dodecahedron" -> faces += 12;
		        case "Icosahedron" -> faces += 20;
		    }
		}
		System.out.println(faces);
	}
}
