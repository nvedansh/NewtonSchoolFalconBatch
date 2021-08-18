import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

class MinPair implements Comparable<MinPair>{
	long value;
	int index;
	MinPair(long value, int index){
		this.value = value;
		this.index = index;
	}
	public int compareTo(MinPair mp) {
         if(this.value > mp.value){
			 return 1;
		 }
		 else if(this.value == mp.value){
			 return 0;
		 }
		 else{
			 return -1;
		 }
    }
}

class MaxPair implements Comparable<MaxPair>{
	long value;
	int index;
	MaxPair(long value, int index){
		this.value = value;
		this.index = index;
	}
	public int compareTo(MaxPair mp) {
		if(this.value > mp.value){
			 return -1;
		 }
		 else if(this.value == mp.value){
			 return 0;
		 }
		 else{
			 return 1;
		 }
    }
}

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[3*n];
		for(int i = 0; i < 3*n; i++){
			arr[i] = sc.nextLong();
		}

		PriorityQueue<MinPair> minHeap1 = new PriorityQueue<>();
		PriorityQueue<MaxPair> maxHeap = new PriorityQueue<>();
		PriorityQueue<MinPair> minHeap2 = new PriorityQueue<>();

		int c[] = new int[3*n];
		Arrays.fill(c, 1);
		long sum1 = 0, sum2 = 0;
		for(int i = 0; i < n; i++){
			minHeap1.add(new MinPair(arr[i], i));	
			sum1 += arr[i];
		}
		for(int i = n; i < 3*n; i++){
			maxHeap.add(new MaxPair(arr[i], i));
			sum2 += arr[i];
		}
		for(int i = 0; i < n; i++){
			MaxPair pair = maxHeap.remove();
			sum2 -= pair.value;
			c[pair.index] = 0;
			minHeap2.add(new MinPair(pair.value, pair.index));
		}

		long ans = sum1 - sum2;
		for(int i = n; i < 2*n; i++){
			if(c[i] == 1){
				sum2 -= arr[i];
				MinPair pair = minHeap2.remove();
				while(pair.index <= i){
					pair = minHeap2.remove();
				}
				sum2 += pair.value;
				c[pair.index] = 1;
			}
			minHeap1.add(new MinPair(arr[i], i));
			sum1 += arr[i];
			c[i] = 1;
			MinPair pair = minHeap1.remove();
			sum1 -= pair.value;
			c[pair.index] = 0;
			ans = Math.max(ans, sum1 - sum2);
		}
		System.out.println(ans);
	}
}