import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {

	public static long gcd(long n, long m){
		if(m == 0){
			return n;
		}
		return gcd(m, n % m);
	}

	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		System.out.println(gcd(n, m));
	}
}