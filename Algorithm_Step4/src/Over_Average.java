import java.util.*;

public class Over_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] ;	
		int T = sc.nextInt();
		
		for(int i = 0 ; i < T ; i++) {
			int N = sc.nextInt();
			arr = new int[N];
			double sum = 0;
			
			for(int j = 0 ; j < N ; j++) {
				int val = sc.nextInt();
				arr[j] = val;
				sum += val;
			}
			
			double average = (sum / N) ;
			double count = 0;
			 
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > average) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n",(count/N)*100);
		}
		sc.close();
	}
}
