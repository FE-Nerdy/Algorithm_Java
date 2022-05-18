import java.util.ArrayList;
import java.util.Scanner;

public class PrintBigNumber {

	public ArrayList<Integer> solution(int N, int arr[])
	{
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i = 1; i<N ; i++)
		{
			if (arr[i] > arr[i-1])
				answer.add(arr[i]);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		PrintBigNumber PBN = new PrintBigNumber();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0 ; i < N ; i++)
			arr[i] = sc.nextInt();
		for(int x : PBN.solution(N, arr))
			System.out.print(x + " ");
		sc.close();
	}
}
