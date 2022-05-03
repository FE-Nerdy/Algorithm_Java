import java.util.Scanner;

public class Bulk {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int i;
		int[][] arr = new int[T][2];

		for(i = 0 ; i < T ; i++)
		{
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			arr[i][0] = A;
			arr[i][1] = B;
		}
		
		for(i = 0 ; i < T ; i++)
		{
			int rank = 1;
			for( int j = 0 ; j < T ; j++)
			{
				if(i==j) {continue; }
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])
						rank++;
			}

			System.out.print(rank + " " );
		}
		sc.close();
	}
}