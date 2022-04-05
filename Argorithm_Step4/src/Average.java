import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		double value = 0;
		int max = 0;
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = sc.nextInt();
			if(max < arr[i])
				max = arr[i];
			value += arr[i];
		}
		
		System.out.println(((value/max)/n)*100);
	}
}