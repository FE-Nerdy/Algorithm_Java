import java.util.Scanner;

public class Repaint_CheckBoard {
	
	public static boolean arr[][];
	public static int min = 64;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new boolean[N][M];
		
		for(int i = 0 ; i < N ; i++)
		{
			String str = sc.next();
			for(int j = 0 ; j < M ; j++)
			{
				if(str.charAt(j) == 'B')
					arr[i][j] = true;
				else if(str.charAt(j) == 'W')
					arr[i][j] = false;
			}
		}
		
		int N_search = N-7;
		int M_search = M-7;
		
		for(int i = 0 ; i < N_search ; i++)
			for(int j = 0 ; j < M_search; j++)
				check(i, j);

		System.out.println(min);
		sc.close();
	}
	
	public static void check(int x, int y)
	{
		int x_end = x + 8;
		int y_end = y + 8;
		int count = 0;
		boolean TF = arr[x][y];
		
		for(int i = x ; i < x_end ; i++)
		{
			for(int j = y; j < y_end ; j++)
			{
				if(arr[i][j] != TF)
					count++;
				
				TF = (!TF);
			}
			TF = (!TF);
		}
		
		count = Math.min(count, 64 - count);
		
		min = Math.min(min, count);
	}
}