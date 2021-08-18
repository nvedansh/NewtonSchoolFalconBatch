import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
		int n = sc.nextInt();
		while(n-- > 0){
			pq.add(sc.nextLong());
		}

		int q = sc.nextInt();
		while(q-- > 0){
			int op = sc.nextInt();
			if(op == 1){
				pq.add(sc.nextLong());
			}
			else{
				System.out.println(pq.peek());
			}
		}
	}
}