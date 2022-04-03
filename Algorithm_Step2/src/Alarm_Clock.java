import java.util.*;

public class Alarm_Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		if(H != 0)
		{
			if(M >= 45) {
				System.out.print(H + " ");
				System.out.print(M-45);
			}
			else {
				System.out.print(H-1 + " ");
				System.out.println(M+15);
			}
		}
		else
		{
			if(M >= 45) {
				System.out.print(H + " ");
				System.out.print(M-45);
			}
			else {
				System.out.print(H+23 + " ");
				System.out.println(M+15);
			}
		}
	}
}