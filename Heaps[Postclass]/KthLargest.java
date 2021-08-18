import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			PriorityQueue<Long> pq = new PriorityQueue<>();
			int n = sc.nextInt();
			int k = sc.nextInt();
			for(int i = 1; i<=n; i++){
				if(i < k){
					pq.add(sc.nextLong());
					System.out.print("-1 ");
				}
				else if( i == k ){
					pq.add(sc.nextLong());
					System.out.print(pq.peek()+ " ");
				}
				else{
					long value = sc.nextLong();
					if(value > pq.peek()){
						pq.remove();
						pq.add(value);
					}
					System.out.print(pq.peek()+" ");
				}
			}
			System.out.println();
		}
	}
}