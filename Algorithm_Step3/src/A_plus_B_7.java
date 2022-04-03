import java.util.*;

public class A_plus_B_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for ( int i = 1; i <= T ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if(a > 0 && b < 10)
				System.out.println("Case #" + i + ": " + (a+b));
		}
	}
}