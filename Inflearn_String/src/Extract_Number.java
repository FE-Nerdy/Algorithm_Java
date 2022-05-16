import java.util.*;
public class Extract_Number {

	public static void main(String[] args) {
		Extract_Number EN = new Extract_Number();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(EN.solution(str));
		sc.close();
	}
	public int solution(String s) {
		String answer = "";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer);
	}
}
