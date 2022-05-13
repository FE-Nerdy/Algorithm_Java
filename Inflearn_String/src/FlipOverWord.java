import java.util.Scanner;
import java.util.ArrayList;

public class FlipOverWord {

	public static void main(String[] args) {
		FlipOverWord FOW = new FlipOverWord();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		String[] str = new String[N];
		for(int i = 0 ; i < N ; i++)
		{
			str[i] = sc.next();
		}
		for(String x : FOW.solution(N, str))
			System.out.println(x);
		sc.close();
	}
	
	public ArrayList<String> solution(int n , String[] str)
	{
		ArrayList<String> answer = new ArrayList<String>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;	
	}
}
