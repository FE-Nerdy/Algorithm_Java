import java.util.*;

class Curriculum {	
	public String solution(String need, String plan){
		String answer="YES";
		Queue<Character> Q=new LinkedList<>();
		for(char x : need.toCharArray()) Q.offer(x);
		for(char x : plan.toCharArray()){
			if(Q.contains(x)){
				if(x!=Q.poll()) return "NO";
			}
		}
		if(!Q.isEmpty()) return "NO";
		return answer;
	}
	
	public static void main(String[] args){
		Curriculum C = new Curriculum();
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		System.out.println(C.solution(a, b));
		sc.close();
	}
}