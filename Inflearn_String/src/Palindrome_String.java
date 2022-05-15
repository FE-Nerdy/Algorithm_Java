import java.util.Scanner;

public class Palindrome_String {
	public static void main(String[] args) {
		Palindrome_String PS = new Palindrome_String();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(PS.solution(str));
		sc.close();
	}
	
	public String solution(String str) {
		String answer = "YES";
		int len = str.length();
		str = str.toUpperCase();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i) != str.charAt(len -i -1)) answer = "NO";
		}
		
		return answer;
	}
}