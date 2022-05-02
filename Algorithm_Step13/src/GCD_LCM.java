import java.util.Scanner;
 
public class GCD_LCM {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
 
		int d = GCD(a, b);
 
		System.out.println(d);
		System.out.println(a * b / d);
		sc.close();
	}

	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
            
		return GCD(b, a % b);
	}
}