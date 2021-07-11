import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long x = (long)Math.sqrt(n);
		HashMap<Long, Integer> hm = new HashMap<>();
		for(long i=1;i<=x;i++){
			if(n%i==0){
				hm.put(i, hm.getOrDefault(i, 0) + 1);
				if(n/i!=i){
					hm.put(n/i, hm.getOrDefault(n/i, 0) + 1);
				}
			}
		}
		System.out.println(hm.size());
	}
}