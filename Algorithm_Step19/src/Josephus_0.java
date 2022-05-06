import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
 
public class Josephus_0 {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		sb.append('<');
		
		while(q.size() > 1) {
			
			for(int i = 0; i < K - 1; i++) {
				int tmp = q.poll();
				q.offer(tmp);
			}
			
			sb.append(q.poll()).append(", ");
		}
		
		sb.append(q.poll()).append('>');
		System.out.println(sb);
		
		sc.close();	
	}
}