import java.util.*;
class SumContinuousN_Math {	
	public int solution(int n){
		int answer=0, cnt=1;
		n--;
		while(n>0){
			cnt++;
			n=n-cnt;
			if(n%cnt==0) answer++;
		}
		return answer;
	}

	public static void main(String[] args){
		SumContinuousN_Math T = new SumContinuousN_Math();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(T.solution(n));
		sc.close();
	}
}