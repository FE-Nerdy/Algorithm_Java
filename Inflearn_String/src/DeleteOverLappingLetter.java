import java.util.*;

public class DeleteOverLappingLetter {

	public static void main(String[] args) {
		DeleteOverLappingLetter DOLL = new DeleteOverLappingLetter();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(DOLL.solution(str));
		sc.close();
	}
	
	public String solution(String str)
	{
		String answer = "";
		for(int i = 0 ; i<str.length(); i++) {
			if(str.indexOf(str.charAt(i)) == i)
				answer+=str.charAt(i);
		}
		return answer;
	}

}
