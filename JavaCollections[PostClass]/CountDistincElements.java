import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		HashMap<Long, Integer> m = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long a[] = new long[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}
		for(int i=0;i<k;i++){
			m.put(a[i], m.getOrDefault(a[i], 0) + 1);
		}
		System.out.print(m.size()+" ");
		int ans=m.size();
		for(int i=k;i<n;i++){
			m.put(a[i-k], m.getOrDefault(a[i-k], 0) - 1);
			if(m.getOrDefault(a[i-k], 0).equals(0)){
				ans--;
			}
			m.put(a[i], m.getOrDefault(a[i], 0) + 1);
			if(m.getOrDefault(a[i], 0).equals(1)){
				ans++;
			}
			System.out.print(ans+" ");
		}
	}
}