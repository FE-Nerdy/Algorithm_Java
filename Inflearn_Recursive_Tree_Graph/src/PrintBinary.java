import java.util.*;

class PrintBinary {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n/2);
			System.out.print(n%2);
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		PrintBinary PM = new PrintBinary();
		PM.solution(11);
	}	
}
