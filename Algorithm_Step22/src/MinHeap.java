import java.util.PriorityQueue;
import java.util.Scanner;

public class MinHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq =
                new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        while(n-->0){
            int cmd = sc.nextInt();
            if(cmd == 0){
                if(pq.isEmpty())
                    sb.append(0).append('\n');
                else
                    sb.append(pq.poll()).append('\n');
            }
            else
                pq.offer(cmd);
        }
        System.out.println(sb);
        sc.close();
    }
}