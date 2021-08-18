import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static int longestIncresing(int a[], int n){
		
		int dp[] = new int[n];
		dp[0] = 1;
		//5 4 3 2 1
		for(int i = 1; i < n; i++){
			int max_value = Integer.MIN_VALUE;
			for(int j = 0; j < i; j++){
				if(a[i] > a[j]){
					max_value = Math.max(max_value, dp[j]);
				}
			}
			if(max_value == Integer.MIN_VALUE){
				dp[i] = 1;
			}
			else{
				dp[i] = max_value + 1;
			}
		}

		int ans = 1;
		for(int i = 0; i < n; i++){
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = sc.nextInt();
			}
			System.out.println(longestIncresing(a, n));
		}
	}
}