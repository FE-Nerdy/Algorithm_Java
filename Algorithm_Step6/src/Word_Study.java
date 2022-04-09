import java.util.*;

public class Word_Study {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[26];
		int max = 0;
		char result = '!';
		String str = sc.next();

		for (int i = 0 ; i < str.length() ; i++){
			if (65 <= str.charAt(i) && str.charAt(i) <= 90) {
				arr[str.charAt(i) - 'A']++;
			}
			else {	// 소문자 범위
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		for (int i = 0 ; i < 26 ; i++)
		{
			if (arr[i] > max) {
				max = arr[i];
				result = ((char) (i + 65)); // 대문자로 출력해야하므로 65를 더해준다.
			}
			else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		sc.close();
	}
}