import java.util.*;
import java.util.StringTokenizer;

public class Word_Count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		sc.close();
		
		StringTokenizer result = new StringTokenizer(str, " ");
		
		System.out.println(result.countTokens());
	}
}