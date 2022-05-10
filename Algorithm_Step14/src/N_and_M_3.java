import java.util.Scanner;

public class N_and_M_3 {
	
	public static int[] arr;
	public static int N,M;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		arr = new int[M];
		
		backtracking(0);
		System.out.println(sb);
		sc.close();
	}
	
	public static void backtracking(int num) {
		if (num == M) {
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) {
			arr[num] = i;
			backtracking(num + 1);
		}
	}
}