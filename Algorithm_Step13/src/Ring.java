import java.util.Scanner;

public class Ring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int FirstRing = sc.nextInt();
		
		for(int i = 0 ; i < T-1 ; i++)
		{
			int ring = sc.nextInt();
			int gcd = GCD(FirstRing, ring);
			
			System.out.println((FirstRing/gcd) + "/" + (ring/gcd));
		}
		
		sc.close();
	}
	
	static int GCD(int a, int b) {
		int r;
 
		while (b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}