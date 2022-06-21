import java.util.*;

class CorrectBracket {
	public String solution(String str) {
		String answer="YES";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x=='(') stack.push(x);
			else {
				if(stack.isEmpty()) return "No";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		CorrectBracket CB = new CorrectBracket();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(CB.solution(str));
		sc.close();
	}
}