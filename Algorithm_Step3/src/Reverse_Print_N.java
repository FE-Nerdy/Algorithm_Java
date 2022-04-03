import java.util.*;

public class Reverse_Print_N {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i = n ; i >= 1; i--)
			System.out.println(i);
	}
}