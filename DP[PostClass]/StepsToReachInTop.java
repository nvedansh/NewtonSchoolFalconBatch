import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] dp = new long[51];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for(int i = 4; i <= 50; i++){
			dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
		}
		int n = sc.nextInt();
		System.out.println(dp[n]);
	}
}