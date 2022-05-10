import java.util.Scanner;

public class Sum_Section_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr;
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[N+1];
		arr[0] = 0;

		for(int i = 1 ; i < N+1 ; i++)
			arr[i] = sc.nextInt() + arr[i-1];
		
		for(int i = 0 ; i < M; i++)
		{
			int first = sc.nextInt();
			int end = sc.nextInt();
			
			System.out.println(arr[end] - arr[first-1]);
		}
		
		sc.close();
	}
}