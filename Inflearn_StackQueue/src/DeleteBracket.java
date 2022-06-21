import java.util.*;

public class DeleteBracket {

	public String solution(String str) {
		String answer="";
		Stack<Character> stack = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');
			}
			else stack.push(x);
		}
		for(int i = 0 ; i<stack.size(); i++)
			answer+=stack.get(i);
		
		return answer;
	}
	
	public static void main(String[] args) {
		DeleteBracket DB = new DeleteBracket();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(DB.solution(str));
		sc.close();
	}
}