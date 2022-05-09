import java.util.Scanner;

public class CombiZeroCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int M = sc.nextInt();
		
		int FiveCount = fiveCount(N) - fiveCount(M) - fiveCount(N-M);
		int TwoCount = twoCount(N) - twoCount(M) - twoCount(N-M);
		System.out.println(Math.min(FiveCount, TwoCount));
		sc.close();
	}
	
	static int fiveCount(int N)
	{
		int cnt = 0;
		while (N >= 5) {
			cnt += N / 5;
			N /= 5;
		}
		return cnt;
	}
	static int twoCount(int N)
	{
		int cnt = 0;
		while (N >= 2) {
			cnt += N / 2;
			N /= 2;
		}
		return cnt;
	}
}
