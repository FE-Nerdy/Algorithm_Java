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
			else {	// �ҹ��� ����
				arr[str.charAt(i) - 'a']++;
			}
		}
		
		for (int i = 0 ; i < 26 ; i++)
		{
			if (arr[i] > max) {
				max = arr[i];
				result = ((char) (i + 65)); // �빮�ڷ� ����ؾ��ϹǷ� 65�� �����ش�.
			}
			else if (arr[i] == max) {
				result = '?';
			}
		}
		System.out.println(result);
		sc.close();
	}
}