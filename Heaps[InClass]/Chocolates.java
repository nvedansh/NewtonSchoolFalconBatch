import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		PriorityQueue<Long> pq_max = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < n; i++){
			pq_max.add(sc.nextLong());
		}
		long ans = 0;
		for(int i = 0; i < k; i++){
			long value = pq_max.peek();
			ans += value;
			pq_max.remove();
			pq_max.add(value / 2);
		}
		System.out.println(ans);
	}
}