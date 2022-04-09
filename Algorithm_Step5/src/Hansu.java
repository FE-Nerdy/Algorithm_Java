import java.util.*;

public class Hansu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(hansu_method(sc.nextInt()));
		sc.close();
	}
	
	public static int hansu_method(int num) {
		int count = 0;
		if (num < 100) {
			return num;
		}
		else {
			count = 99;
			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
 
				if ((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		return count;
	}
}