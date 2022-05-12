import java.util.Scanner;

public class FindLetter {

	public static void main(String[] args) {
		FindLetter fl = new FindLetter();
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		char c = sc.next().charAt(0);
		
		System.out.println(fl.solution(str, c));
		sc.close();
	}
	
	public int solution(String str, char t)
	{
		int answer = 0;
		
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(char x : str.toCharArray())
			if(x == t) answer++;
		
		return answer;
	}
}