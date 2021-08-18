import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Long> minHeap = new PriorityQueue<>();
		PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		int n = sc.nextInt();
		int q = sc.nextInt();
		long sum = 0;
		for(int i = 0; i < n; i++){
			long value = sc.nextLong();
			minHeap.add(value);
			maxHeap.add(value);
			sum += value;
		}
		long ans[] = new long[n];
		for(int i = 0; i < n; i++){
			ans[i] = sum;
			long minValue = minHeap.remove();
			long maxValue = maxHeap.remove();
			minHeap.add(maxValue - minValue);
			maxHeap.add(maxValue - minValue);
			sum -= minValue;
			sum -= maxValue;
			sum += (maxValue - minValue);
		}
		for(int i = 0; i < q; i++){
			int k = sc.nextInt();
			System.out.println(ans[k]);
		}
	}
}