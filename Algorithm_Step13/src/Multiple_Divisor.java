import java.util.Scanner;
 
public class Multiple_Divisor {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        
		while(true) {
			
			int Div = sc.nextInt();
			int Num = sc.nextInt();
			
			if(Div == 0 && Num == 0) break;
			
			if(Num % Div == 0) {
				System.out.println("factor");
			}
			else if(Div % Num == 0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
		sc.close();
	}
}