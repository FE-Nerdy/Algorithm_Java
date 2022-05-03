import java.util.Scanner;

public class Binomial_Coefficient_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int result = Factorial(N)/(Factorial(N-K) * Factorial(K));
		
		System.out.println(result);
		sc.close();
	}
	
	static int Factorial(int num)
	{
		if(num == 0) return 1;
		else {
			return  num * Factorial(num -1);
		}
	}
}