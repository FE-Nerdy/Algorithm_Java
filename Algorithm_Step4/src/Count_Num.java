import java.util.*;
import java.util.Arrays;

public class Count_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int [10];
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		int n;
		sc.close();
		
		
		while(value > 0) {
			n = value % 10;
			arr[n]++;
			value = value / 10;
		}
		
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(arr[i]);
	}
}