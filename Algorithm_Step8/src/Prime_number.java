import java.util.*;
	
public class Prime_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int N = sc.nextInt();
		if( N > 1) {
			for( int i = 0; i < N ; i++)
			{
				int value = sc.nextInt();
				if(isPrime(value))
					count++;
			}
			sc.close();
			System.out.println(count);
		}
	}
	
	public static boolean isPrime(int num) {
        if (num == 1) return false; 

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}