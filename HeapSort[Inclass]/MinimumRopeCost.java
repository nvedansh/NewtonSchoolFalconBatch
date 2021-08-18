import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n =sc.nextInt();
			PriorityQueue<Long> pq =  new PriorityQueue<>();
			for(int i = 0; i < n; i++){
				pq.add(sc.nextLong());
			}
			long cost = 0l;
			while(pq.size() > 1){
				long x = pq.remove();
				long y = pq.remove();
				cost += (x+y);
				pq.add(x+y);
			}
			System.out.println(cost);
		}
	}
}