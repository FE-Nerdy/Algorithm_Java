import java.util.Scanner;

public class ChangeLowUpper {

	public String Solution(String str)
	{
		String answer = "";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		return answer;
	}
	public static void main(String[] args) {
		
		ChangeLowUpper CLU = new ChangeLowUpper();
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		System.out.println(CLU.Solution(str));
		sc.close();
	}
}