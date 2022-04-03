import java.util.*;
public class plus_cycle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int result = 0;
		int t, o, tmp;
		tmp = N;
		
		while(true) {
			t = tmp / 10;
			o = tmp % 10;
			tmp = ((o*10) + ((t+o)%10));
			result++;
			
			if(N == tmp)
				break;
		}
		System.out.println(result);
		sc.close();
	}
}