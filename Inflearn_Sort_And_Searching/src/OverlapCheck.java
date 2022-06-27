import java.util.*;

class OverlapCheck {	
	public String solution(int n, int[] arr){
		String answer="U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++){
			if(arr[i]==arr[i+1]){
				answer="D";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args){
		OverlapCheck OC = new OverlapCheck();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) arr[i]=sc.nextInt();
		System.out.println(OC.solution(n, arr));
		sc.close();
	}
}