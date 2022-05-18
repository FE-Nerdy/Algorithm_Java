import java.util.*;
public class TallerStudent {
	public int solution(int N, int[] arr)
	{
		int answer = 1, max = arr[0];
		for(int i = 1; i < N ; i++)
		{
			if(arr[i] > max) {
				answer++;
				max = arr[i];
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		TallerStudent TS = new TallerStudent();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for(int i = 0 ; i < N ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.print(TS.solution(N, arr));
		sc.close();
	}
}
