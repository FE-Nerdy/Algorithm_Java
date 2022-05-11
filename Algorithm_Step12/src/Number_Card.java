import java.util.Arrays;
import java.util.Scanner;

class Number_Card {
    private static int N;
    private static int[] arr;
    private static int M;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        
        arr = new int[N];
        
        for (int i = 0; i < N; i++) {
        	arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        M = sc.nextInt();
        
        for (int i = 0; i < M; i++) {
            int m = sc.nextInt();
            int left = 0;
            int right = N - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                int n = arr[mid];
                if (n == m) {
                    sb.append(1 + " ");
                    break;
                }
                if (n > m) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
                if (left > right) {
                    sb.append(0 + " ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}