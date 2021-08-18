import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	static long mod = (long) 1e9 + 7;
	public static long longestIncresing(long a[], int n){
		
		long dp[] = new long[n];
		Arrays.fill(dp, 1);
		//5 4 3 2 1
		for(int i = 1; i < n; i++){
			for(int j = 0; j < i; j++){
				if(a[i] > a[j]){
					dp[i] += dp[j];
					dp[i] %= mod;
				}
			}
		}

		long ans = 0;
		for(int i = 0; i < n; i++){
			ans += dp[i];
			ans %= mod;
		}
		return ans;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			long a[] = new long[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextLong();
			}
			System.out.println(longestIncresing(a, n));
		}
	}
}