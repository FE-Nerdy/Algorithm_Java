import java.util.Scanner;
public class Available_Palindrome {

	public static void main(String[] args) {
		Available_Palindrome AP = new Available_Palindrome();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(AP.solution(str));
		sc.close();
	}
	public String solution(String s) {
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}
}