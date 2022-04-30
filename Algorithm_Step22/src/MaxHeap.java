import java.util.ArrayList;
import java.util.Scanner;

public class MaxHeap {
	public static class Max_Heap{
		private ArrayList<Integer> heap;
		
		public Max_Heap() {
			heap = new ArrayList<>();
			heap.add(-1);
		}
	
		private void swap(int i1, int i2) {
			int temp = heap.get(i1);
			heap.set(i1, heap.get(i2));
			heap.set(i2, temp);
		}

	
		public void insert(int node) {
			heap.add(node);
			int p = heap.size() - 1;
			while(p > 1 && heap.get(p/2) < heap.get(p)) {
				swap(p/2, p);
				p = p / 2;
				}
		}
	
		public int delete() {
			if(heap.size() == 1) {
	        return 0;
			}
			int deletedNode = heap.get(1);
			heap.set(1, heap.get(heap.size()-1));
			heap.remove(heap.size()-1);
			int p = 1;

			while(p * 2 < heap.size()) {
				int max_p = p * 2;
				if(p * 2 + 1 < heap.size()) {
					if(heap.get(p*2) < heap.get(p*2+1)) {
						max_p = p*2 + 1;
					}
				}
				if(heap.get(p) > heap.get(max_p)) {
					break;
				}else {
					swap(p, max_p);
					p = max_p;
				}
			}
			return deletedNode;
		}
	}
	
	public static void main(String[] args)
	{
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int TestCase = sc.nextInt();
		
		Max_Heap heap = new Max_Heap();
		
		for (int i = 0; i < TestCase; i++) {
		      int input = sc.nextInt();
		      if(input > 0) {
		        heap.insert(input);
		      }else if(input == 0) {
		        sb.append(heap.delete() + "\n");
		      }
		}
		System.out.println(sb.toString());
	    sc.close();
	}
}
