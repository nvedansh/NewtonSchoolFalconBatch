import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int t = sc.nextInt();
		while(t-- > 0){
			int op = sc.nextInt();
			if(op == 1){
				int value = sc.nextInt();
				minHeap.add(value);
				maxHeap.add(value);
			}
			else if(op == 2){
				int value = sc.nextInt();
				boolean minPresent = minHeap.remove(value);
				boolean maxPresent = maxHeap.remove(value);
				if(!minPresent && !maxPresent){
					System.out.println(-1);
				}
			}
			else if(op == 3){
				if(maxHeap.size() == 0){
					System.out.println(-1);
				}
				else{
					System.out.println(maxHeap.peek());
				}
			}
			else{
				if(minHeap.size() == 0){
					System.out.println(-1);
				}
				else{
					System.out.println(minHeap.peek());
				}
			}
		}

	}
}