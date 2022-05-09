import java.util.Scanner;

public class Binomial_Coefficient_2 {

	static int[][] dp;
	public static final int div = 10007;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		dp = new int[N+1][K+1];

		System.out.println(BC(N, K));
		sc.close();
	}
	
	static int BC(int n, int k) {
		
		if (dp[n][k] > 0) {
			return dp[n][k];
		}
 
		if (k == 0 || n == k) {
			return dp[n][k] = 1;
		}
 
		return dp[n][k] = (BC(n - 1, k - 1) + BC(n - 1, k)) % div;
	}
}
