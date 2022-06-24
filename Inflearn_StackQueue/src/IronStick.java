import java.util.*;

class IronStick {
	public int solution(String str){
		int cnt=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='(') stack.push('(');
			else{
				stack.pop();
				if(str.charAt(i-1)=='(') cnt+=stack.size();
				else cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args){
		IronStick IS = new IronStick();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(IS.solution(str));
		sc.close();
	}
}