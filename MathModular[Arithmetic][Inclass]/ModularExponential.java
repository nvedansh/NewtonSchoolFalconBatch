import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	static long mod = (long)1e9 + 7;

	public static long power(long n, long p){
		long result = 1;
		n = n % mod;
		while(p > 0){
			if( p % 2 == 1){
				result = (result * n) % mod;
			}
			n = (n * n) % mod;
			p /= 2;
		}

		return result;
	}

	public static void main (String[] args) {	

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();

		long result = power(n, p);
		System.out.println(result);

	}
}