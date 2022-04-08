import java.util.*;

public class Max_Value {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int max;
		int p = 0;
		
		for(int i = 0 ; i < 9 ; i++)
			arr[i] = sc.nextInt();
		max = arr[0];
		for(int i = 1 ; i < 9 ; i++) {
			if (arr[i] > max) {
				max = arr[i];
				p = i;
			}
		}
		System.out.println(max);
		System.out.println(p+1);
		sc.close();
	}
}