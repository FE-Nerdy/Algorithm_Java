import java.util.Scanner;
 
public class ContinuousSum {
	
	static int[] arr;
	static Integer[] dp;
	static int max;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		arr = new int[N];
		dp = new Integer[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dp[0] = arr[0];
		max = arr[0];
		
		recur(N - 1);
		
		System.out.println(max);
		sc.close();	
		}
	
	static int recur(int N) {
		
		if(dp[N] == null) {
			dp[N] = Math.max(recur(N - 1) + arr[N], arr[N]);
 
			max = Math.max(dp[N], max);
		}
		
		return dp[N];
	}
}