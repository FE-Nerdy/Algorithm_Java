import java.util.*;
import java.util.Arrays;

public class Count_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int[] arr_result = new int [10];
		int value = 0;
		int n;
		Arrays.fill(arr_result, 0);
		
		for(int i = 0 ; i < 3 ; i++) {
			arr[i] = sc.nextInt();
			value += arr[i];
		}
		
		while(value > 0) {
			n = value % 10;
			arr_result[n]++;
			value = value / 10;
		}
		
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(arr_result[i]);
		sc.close();
	}
}