import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	/*
		Fibbonocci series was fib(n) = fib(n-1) + fib(n-2)
		tribonocci series say is trib(n) = trib(n-1) + trib(n-2) + trib(n-3)
		trib(1) = a
		trib(2) = b
		trib(3) = c
		trib(4) = a + b + c
		trib(5) = b + c + a + b + c = a + 2b + 2c
		.... 

	*/
	
	
	static long mod = (long)1e9 + 7; // 1 * 10^9 + 7 = 1000000007
	public static void main (String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long trib[] = new long[n+1]; 
			
			trib[1] = a % mod;
			trib[2] = b % mod;
			trib[3] = c % mod;

			for(int i = 4; i <= n; i++){
				trib[i] = (trib[i-1] + trib[i-2] + trib[i-3]) % mod;
			}

			System.out.println(trib[n]);
	}
}